package Programacion01.listas

/*
Generar el tablero de buscaminas





Cuando jugamos al buscaminas, el progreso del juego se va dirigiendo en base a un tablero precalculado que
contiene las minas y la cantidad de celdas vecinas con minas que tiene cada celda.
Entrada:

Una serie de tableros.

Cada tablero se describe con dos líneas. En la primera se indica las dimensiones de filas F con F>0 y de columnas
C con C>0 separadas por un espacio. En la segunda fila, separadas por un espacio en blanco,  se indican las
coordenadas (f,c) de las minas del tablero con valores 0<= f < F y 0 <= c < C. Se garantiza que los valores de la
entrada son congruentes, por ejemplo, las dimensiones no son negativas ni las minas que se colocan fuera del
tablero.

Salida:
Tablero una vez colocadas las minas de la entrada. Las minas se representan con el dígito 9. Las celdas sin minas
alrededor con 0.

Por ejemplo:
Entrada

8 8
0 0 0 1 0 2 1 0 1 2 2 0 2 1 2 2 5 5
6 6
3 3 3 4 4 3 4 4
10 10
0 9 0 7 1 8 5 3 6 4

Resultado

9 9 9 2 0 0 0 0
9 8 9 3 0 0 0 0
9 9 9 2 0 0 0 0
2 3 2 1 0 0 0 0
0 0 0 0 1 1 1 0
0 0 0 0 1 9 1 0
0 0 0 0 1 1 1 0
0 0 0 0 0 0 0 0
------------------------------------
0 0 0 0 0 0
0 0 0 0 0 0
0 0 1 2 2 1
0 0 2 9 9 2
0 0 2 9 9 2
0 0 1 2 2 1
------------------------------------
0 0 0 0 0 0 1 9 3 9
0 0 0 0 0 0 1 2 9 2
0 0 0 0 0 0 0 1 1 1
0 0 0 0 0 0 0 0 0 0
0 0 1 1 1 0 0 0 0 0
0 0 1 9 2 1 0 0 0 0
0 0 1 2 9 1 0 0 0 0
0 0 0 1 1 1 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
------------------------------------

 */
fun crearTablero(valoresTablero:List<Int>):List<List<Int>>{
    var filas    = valoresTablero[0]
    var columnas = valoresTablero[1]

    return List(filas){MutableList(columnas) {0} }
}
fun colocarMinas(tablero:List<List<Int>>,minas:List<Int>):List<List<Int>> {
    val filas = tablero.size
    val columnas = tablero[0].size
    val resultado = tablero.map { it.toMutableList() }

    for (i in minas.indices step 2) {
        val f = minas[i]
        val c = minas[i + 1]

        resultado[f][c] = 9 //añadimos las minas

        for (i in -1..1) { //sumamos 1 a las posiciones del tablero adjacentes que no tengan mina.
            for (j in -1..1) {
                val nFila    = f + i
                val nColumna = c + j
                if (nFila in 0 until filas && nColumna in 0 until columnas && resultado[nFila][nColumna] != 9)
                    resultado[nFila][nColumna]++
            }
        }
    }
    return resultado
}

fun imprimirMinas(partida:List<List<Int>>){
    for (fila in partida){
        println(fila.joinToString(" "))
    }
}
fun main(){
    var input = readLine()

    while(!input.isNullOrBlank()){
        var valoresTablero = input.split(" ").map { it.toInt() }
        var minas          = readLine()!!.split(" ").map { it.toInt() }
        var partida        = colocarMinas(crearTablero(valoresTablero), minas)

        imprimirMinas(partida)
        println("------------------------------------")
        input = readLine()
    }
}
