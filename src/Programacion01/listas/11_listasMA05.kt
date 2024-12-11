package Programacion01.listas

/*
Sudokus correctos EN KOTLIN



https://www.aceptaelreto.com/problem/statement.php?id=345

El sudoku es un pasatiempo lógico que consiste en rellenar una cuadrícula de 9×9 casillas dividida en nueve regiones 3×3 (las separadas con líneas más gruesas en la imagen) con los números del 1 al 9 de tal forma que no se repitan números en ninguna fila, columna o región. El sudoku inicialmente se presenta con algunas casillas ya rellenas, a modo de pistas, y el jugador debe deducir los valores de las casillas vacías. Si el sudoku está bien planteado, la solución es única.

Dado un sudoku completamente relleno, ¿sabrías construir un programa que comprobara si es correcto (es decir, cada fila, columna o región contiene los números del 1 al 9 exactamente una vez)?
Entrada

La entrada comienza con un número que representa el número de casos de prueba que vendrán a continuación.

Cada caso de prueba está formado por 9 líneas, cada una con 9 números entre el 1 y el 9 separados por espacios, que representan un sudoku completamente relleno.
Salida

Para cada caso, se escribirá una línea con la palabra SI si el sudoku ha sido resuelto correctamente, y NO en caso contrario.

Por ejemplo:

 Entrada 	        Resultado

3                   SI
4 1 3 8 2 5 6 7 9   NO
5 6 7 1 4 9 8 3 2   NO
2 8 9 7 3 6 1 4 5
1 9 5 4 6 2 7 8 3
7 2 6 9 8 3 5 1 4
3 4 8 5 1 7 2 9 6
8 5 1 6 9 4 3 2 7
9 7 2 3 5 8 4 6 1
6 3 4 2 7 1 9 5 8
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
1 6 9 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9


3
4 1 3 8 2 5 6 7 9
5 6 7 1 4 9 8 3 2
2 8 9 7 3 6 1 4 5
1 9 5 4 6 2 7 8 3
7 2 6 9 8 3 5 1 4
3 4 8 5 1 7 2 9 6
8 5 1 6 9 4 3 2 7
9 7 2 3 5 8 4 6 1
6 3 4 2 7 1 9 5 8
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 5 5 5 5 5 5 5 5
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
1 6 9 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9


 */
fun verificaFila(){

}
fun verificarColumna(){

}
fun verificarSector(){

}
fun comprobarSudoku(matriz:MutableList<IntArray>):String{
    var resultado = "SI"
    //var mapa = mapOf(9){0}

    return resultado
}

fun main(){
    val matriz:MutableList<IntArray> = MutableList(9){ IntArray(9) {0} }

    val entrada = readLine()!!.toInt()
    for(region in 0 until 3 ){
        val n = entrada.toInt()
        for(i in 0 until 9){
            var linea = readLine()!!.split(" ").map {it.toInt() }
            matriz[i] = linea.toTypedArray().toIntArray()

        }
        println(comprobarSudoku(matriz))
    }
}


/*
Solucion:
fun verificarFila(matriz: MutableList<IntArray>, fila: Int): Boolean {
    val numeros = BooleanArray(9)
    for (col in 0 until 9) {
        val num = matriz[fila][col] - 1
        if (num !in 0..8 || numeros[num]) return false
        numeros[num] = true
    }
    return true
}
fun verificarColumna(matriz: MutableList<IntArray>, col: Int): Boolean {
    val numeros = BooleanArray(9)
    for (fila in 0 until 9) {
        val num = matriz[fila][col] - 1
        if (num !in 0..8 || numeros[num]) return false
        numeros[num] = true
    }
    return true
}

fun verificarRegion(matriz: MutableList<IntArray>, inicioFila: Int, inicioCol: Int): Boolean {
    val numeros = BooleanArray(9)
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            val num = matriz[inicioFila + i][inicioCol + j] - 1
            if (num !in 0..8 || numeros[num]) return false
            numeros[num] = true
        }
    }
    return true
}
fun comprobarSudoku(matriz: MutableList<IntArray>): String {
    for (i in 0 until 9) {
        if (!verificarFila(matriz, i) || !verificarColumna(matriz, i)) {
            return "NO"
        }
    }

    for (i in 0 until 9 step 3) {
        for (j in 0 until 9 step 3) {
            if (!verificarRegion(matriz, i, j)) {
                return "NO"
            }
        }
    }

    return "SI"
}



 */