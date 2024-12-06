package Programacion01.ochoReinas

/*
* Autor: Jose Guimarey Muñiz
* Fecha:24/12/06
* Ejecicio: 8 reinas
 */
fun ochoReinas(matriz:Array<CharArray>,fila:Int):Boolean{
    val n=matriz.size

    if (fila==n){
        return true
    }

    for (j in matriz[0].indices) {
        if (comprobarPosicion(matriz, fila, j)) {
            matriz[fila][j] = 'Q'
            if (ochoReinas(matriz, fila + 1))
                return true
            matriz[fila][j] = '.'
        }
    }

    return false //solucion no encontrada
}
fun comprobarPosicion(matriz:Array<CharArray>,fila:Int,columna:Int):Boolean {
    //comprobar columna
    for (i in 0 until fila) {
        if (matriz[i][columna] == 'Q') return false
    }
    //comprobar diagonal sup izquierda
    var i = fila -1
    var j = columna -1
    while (i >= 0 && j >= 0) {
        if (matriz[i][j] == 'Q')
            return false
        i--
        j--
    }
    //comprobar diagonal sup. derecha
    i = fila -1
    j = columna +1
    while (i >= 0 && j < matriz.size) {
        if (matriz[i][j] == 'Q')
            return false
        i--
        j++
    }
    return true
}

fun crearTablero(n:Int):Array<CharArray>{
    val matriz = Array(n){CharArray(n){'.'} }
    return matriz
}

fun imprimirTablero(matriz:Array<CharArray>){
    for (i in matriz.indices){
        for (j in matriz[0].indices)
            if (j==0) print("${matriz[i][j]} ")
            else print(" ${matriz[i][j]} ")
        println()
    }
}

fun main(){
    var entrada = readLine()
    while (!entrada.isNullOrBlank()&& !entrada.equals("0")){
        var n = entrada.toInt() //representa dimensiones del tablero n*n y nº de reinas.
        var matrizVacia = crearTablero(n)
        var solucion = ochoReinas(matrizVacia,0)
        if (solucion) imprimirTablero(matrizVacia)
        else println("No hay solución")
        println("========================================")
        entrada = readLine()
    }
}
