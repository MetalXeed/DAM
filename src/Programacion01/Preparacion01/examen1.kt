package Programacion01.Preparacion01
/*
1. Plantilla para Lectura de Entrada y Procesamiento de Datos

fun main() {
    var entrada: String? = readLine()
    while (entrada != null && entrada.isNotBlank()) {
        // Procesar la entrada
        val datos = entrada.split(" ").map { it.toInt() }

        // Realizar operaciones con los datos
        // Por ejemplo:
        val resultado = datos.sum()
        println("Resultado: $resultado")

        // Leer la siguiente línea
        entrada = readLine()
    }
}
2. Plantilla para Funciones Recursivas
Factorial
kotlin
fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}

fun main() {
    println(factorial(5)) // Ejemplo de uso
}
Fibonacci
kotlin
fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    println(fibonacci(10)) // Ejemplo de uso
}
3. Plantilla para Algoritmo de Euclides (mcd)
kotlin
fun mcd(dividendo: Int, divisor: Int): Int {
    if (divisor == 0) return dividendo
    return mcd(divisor, dividendo % divisor)
}

fun main() {
    println(mcd(72, 16)) // Ejemplo de uso
}
4. Plantilla para Búsqueda y Procesamiento en Matrices
Contar Bombas Adyacentes (Buscaminas)
kotlin
fun contarBombasAdyacentes(tablero: Array<CharArray>, fila: Int, columna: Int): Int {
    val direcciones = listOf(
        listOf(-1, -1), listOf(-1, 0), listOf(-1, 1),
        listOf(0, -1), /* CELDA */ listOf(0, 1),
        listOf(1, -1), listOf(1, 0), listOf(1, 1)
    )
    var contador = 0
    for (dir in direcciones) {
        val nfila = fila + dir[0]
        val ncolumna = columna + dir[1]
        if (nfila in tablero.indices && ncolumna in tablero[0].indices && tablero[nfila][ncolumna] == '*') {
            contador++
        }
    }
    return contador
}
5. Plantilla para Verificación y Validación de Datos
kotlin
fun esPosicionValida(fila: Int, columna: Int, filas: Int, columnas: Int): Boolean {
    return fila in 0 until filas && columna in 0 until columnas
}
6. Plantilla para Imprimir Estructuras Complejas
Imprimir Matriz
kotlin
fun imprimirMatriz(matriz: Array<CharArray>) {
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun main() {
    val matriz = arrayOf(
        charArrayOf('A', 'B', 'C'),
        charArrayOf('D', 'E', 'F'),
        charArrayOf('G', 'H', 'I')
    )
    imprimirMatriz(matriz)
}
Imprimir Triángulo de Asteriscos con Recursividad
kotlin
fun imprimirL(n: Int) {
    if (n > 0) {
        print("*")
        imprimirL(n - 1)
    }
}

fun imprimirT(n: Int) {
    if (n > 0) {
        imprimirL(n)
        println()
        imprimirT(n - 1)
    }
}

fun main() {
    imprimirT(5)
}
7. Plantilla para Búsquedas en Laberintos o Grafos
kotlin
fun dfs(laberinto: List<MutableList<Char>>, fila: Int, columna: Int, visitados: Array<BooleanArray>, camino: MutableList<List<Int>>): Boolean {
    if (fila !in laberinto.indices || columna !in laberinto[0].indices || laberinto[fila][columna] == '#' || visitados[fila][columna]) {
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
        if (dfs(laberinto, nfila, ncolumna, visitados, camino)) {
            return true
        }
    }

    camino.removeAt(camino.size - 1)
    visitados[fila][columna] = false
    return

 */