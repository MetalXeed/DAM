package Programacion01.recursividad

/*
El laberinto, el ratón y el queso

150+ Ratón Y Queso Maze Ilustraciones de Stock, gráficos ...

El laberinto del ratón y el queso es un juego clásico que ha entretenido a niños y adultos durante décadas y es una herramienta pedagógica efectiva que puede ser utilizada para estudiar la toma de decisiones y las estrategias de resolución de problemas.

Nuestro laberinto será una matriz de caracteres y se trata de encontrar una solución (un camino)  desde un punto inicial desde que partiría el ratón hasta llegar a  Q(queso), teniendo en cuenta que  # es una pared y 0 representa una celda transitable.

La solución será un string que contiene la lista de coordenadas del camino solución.

Se garantiza que siempre habrá una solución, pero puede haber muchas soluciones. La solución obtenida no tiene porque ser la mejor(la más corta), si no que será aquella que se genera  en el siguiente orden de exploración: norte,  este, sur y oeste.

SE PIDE: función hayCamino()

Por ejemplo:
Prueba

val laberinto = listOf(
        mutableListOf('R', '#', '0', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('#', '#', '#', '0', '0'),
        mutableListOf('0', '0', '0', '0', '#'),
        mutableListOf('0', '0', '#', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('0', '#', '0', '#', '#'),
        mutableListOf('0', '0', 'Q', '#', '0')
    )

    // Ratón sale de 0,0
    println(hayCamino(0, 0, laberinto))


Resultado
(0,0)(1,0)(1,1)(1,2)(0,2)(0,3)(0,4)(1,4)(2,4)(2,3)(3,3)(3,2)(3,1)(4,1)(5,1)(5,2)(6,2)(7,2)

val laberinto = listOf(
        mutableListOf('R', '#', '0', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('#', '#', '#', '0', '0'),
        mutableListOf('0', '0', '0', '0', '#'),
        mutableListOf('0', '0', '#', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('0', '#', '0', '#', '#'),
        mutableListOf('0', '0', 'Q', '#', '0')
    )

    // Ratón sale de 7,0
    println(hayCamino(7, 0, laberinto))


Resultado
(7,0)(6,0)(5,0)(4,0)(3,0)(3,1)(4,1)(5,1)(5,2)(6,2)(7,2)

 */
// Función para verificar si una posición está dentro de los límites del laberinto y es transitable
fun hayCamino(fila: Int, columna: Int, laberinto: List<MutableList<Char>>): String {
    val filas = laberinto.size
    val columnas = laberinto[0].size
    val visitados = Array(filas) { BooleanArray(columnas) }
    val camino = mutableListOf<List<Int>>()

    if (dfs(fila, columna, laberinto, visitados, camino)) {
        return camino.joinToString("") { "(${it[0]},${it[1]})" }
    }

    return ""
}

fun dfs(fila: Int, columna: Int, laberinto: List<MutableList<Char>>, visitados: Array<BooleanArray>, camino: MutableList<List<Int>>): Boolean {
    if (fila !in 0 until laberinto.size || columna !in 0 until laberinto[0].size || laberinto[fila][columna] == '#' || visitados[fila][columna]) {
        return false
    }

    camino.add(listOf(fila, columna))

    if (laberinto[fila][columna] == 'Q') {
        return true
    }

    visitados[fila][columna] = true

    val direcciones = listOf(
        listOf(-1, 0),  // Norte
        listOf(0, 1),   // Este
        listOf(1, 0),   // Sur
        listOf(0, -1)   // Oeste
    )

    for (dir in direcciones) {
        val nfila = fila + dir[0]
        val ncolumna = columna + dir[1]

        if (dfs(nfila, ncolumna, laberinto, visitados, camino)) {
            return true
        }
    }

    camino.removeAt(camino.size - 1)
    visitados[fila][columna] = false
    return false
}


fun main(){
    val laberinto = listOf(
        mutableListOf('R', '#', '0', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('#', '#', '#', '0', '0'),
        mutableListOf('0', '0', '0', '0', '#'),
        mutableListOf('0', '0', '#', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('0', '#', '0', '#', '#'),
        mutableListOf('0', '0', 'Q', '#', '0')
    )

    // Ratón sale de 0,0
    println(hayCamino(0, 0, laberinto))
}