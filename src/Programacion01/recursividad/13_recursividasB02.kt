package Programacion01.recursividad

/*
 Escapando de las fuerzas imperiales

https://www.aceptaelreto.com/problem/statement.php?id=432



Nuestros héroes, a bordo del Halcón Milenario y confiando en la pericia de Han Solo, están intentado escapar de las fuerzas rebeldes. Para despistar a las fuerzas imperiales, Han Solo quiere introducirse en un campo de asteroides.

Pero antes de tan arriesgada maniobra quiere saber si, una vez dentro, podrán salir de él o es mejor buscar una alternativa más prudente.

El campo de asteroides es una cuadrícula en el que el Halcón Milenario puede moverse en horizontal y en vertical, pero no en diagonal. Las casillas pueden ser transitables, o estar ocupadas por asteroides inmóviles.




Entrada

Cada caso de prueba comienza con una pareja de números 1 ≤ F,C ≤ 20 indicando, respectivamente, el número de filas y columnas de la cuadrícula que representa el campo de asteroides.

A continuación irán F líneas, cada una con C caracteres. Un asterisco ('*') indica una celda con asteroide, y un punto ('.') indica una celda transitable. El Halcón Milenario entra al campo de asteroides en la celda identificada con la letra S, y necesita salir de él en la celda F. En el mapa, existirá una y solo una de cada una de esas letras y sus celdas deben considerarse transitables.

Ten en cuenta que, gracias al hiperespacio, las celdas S y F pueden estar en cualquier posición, no únicamente en los extremos.

Salida

Por cada caso de prueba el programa escribirá "SI" si es viable que el Halcón Milenario se adentre en el campo de asteroides porque hay al menos un camino desde el punto S al punto F siguiendo las reglas de movimiento de la nave. En otro caso, el programa escribirá "NO".

Por ejemplo:
Entrada 	Resultado

2 2         SI
SF          NO
..          SI
2 3
S*F
*..
3 3
.S.
**.
F..



 */
fun esPosicionValida():Boolean{
    return (true)
}
fun main(){

    var entrada = readLine()
    while(!entrada.isNullOrEmpty()){
        var dimAsteroides = entrada.split(" ").map { it.toInt() }
        var campoAsteroides = mutableListOf<CharArray>()
        for (x in 0..dimAsteroides[0]-1){
            entrada = readLine()
            if (!entrada.isNullOrEmpty()){
                var filaAsteroides = entrada.toCharArray()
                campoAsteroides.add(filaAsteroides)
            }

        }
    }
}

/*
fun esPosicionValida(fila: Int, columna: Int, laberinto: List<CharArray>): Boolean {
    val F = laberinto.size
    val C = laberinto[0].size
    return fila in 0 until F && columna in 0 until C && laberinto[fila][columna] != '*'
}

fun dfs(laberinto: List<CharArray>, fila: Int, columna: Int, finFila: Int, finColumna: Int, visitados: Array<BooleanArray>): Boolean {
    // Caso base: hemos llegado a la celda final
    if (fila == finFila && columna == finColumna) {
        return true
    }

    // Marcar la celda actual como visitada
    visitados[fila][columna] = true

    // Direcciones: norte, este, sur, oeste
    val direcciones = listOf(
        listOf(-1, 0), // Norte
        listOf(0, 1),  // Este
        listOf(1, 0),  // Sur
        listOf(0, -1)  // Oeste
    )

    // Intentar moverse en cada dirección
    for (dir in direcciones) {
        val nfila = fila + dir[0]
        val ncolumna = columna + dir[1]

        if (esPosicionValida(nfila, ncolumna, laberinto) && !visitados[nfila][ncolumna]) {
            // Realizar la llamada recursiva
            if (dfs(laberinto, nfila, ncolumna, finFila, finColumna, visitados)) {
                return true
            }
        }
    }

    // Desmarcar la celda actual (backtracking)
    visitados[fila][columna] = false
    return false
}

fun main() {
    var entrada = readLine()
    while (!entrada.isNullOrEmpty()) {
        val (F, C) = entrada.split(" ").map { it.toInt() }
        val laberinto = mutableListOf<CharArray>()

        var inicioFila = 0
        var inicioColumna = 0
        var finFila = 0
        var finColumna = 0

        for (i in 0 until F) {
            entrada = readLine()
            if (!entrada.isNullOrEmpty()) {
                val fila = entrada.toCharArray()
                laberinto.add(fila)
                if ('S' in fila) {
                    inicioFila = i
                    inicioColumna = fila.indexOf('S')
                }
                if ('F' in fila) {
                    finFila = i
                    finColumna = fila.indexOf('F')
                }
            }
        }

        val visitados = Array(F) { BooleanArray(C) { false } }
        val resultado = if (dfs(laberinto, inicioFila, inicioColumna, finFila, finColumna, visitados)) "SI" else "NO"
        println(resultado)

        entrada = readLine()
    }
}


 */