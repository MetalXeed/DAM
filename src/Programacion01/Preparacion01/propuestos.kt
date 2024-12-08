package Programacion01.Preparacion01

/*
1. Problema del Viajante de Comercio (Traveling Salesman Problem - TSP)
Aunque es un problema complejo y famoso en la teoría de la computación, una versión simplificada de este problema puede aparecer en exámenes. Se pide encontrar la ruta más corta que visita un conjunto de ciudades exactamente una vez y regresa al punto de partida.

Ejemplo en Kotlin:
kotlin
fun tsp(graph: Array<IntArray>, v: IntArray, currPos: Int, n: Int, count: Int, cost: Int, minCost: Int): Int {
    if (count == n && graph[currPos][0] > 0) {
        return min(minCost, cost + graph[currPos][0])
    }

    var minCostCopy = minCost
    for (i in 0 until n) {
        if (v[i] == 0 && graph[currPos][i] > 0) {
            v[i] = 1
            minCostCopy = tsp(graph, v, i, n, count + 1, cost + graph[currPos][i], minCostCopy)
            v[i] = 0
        }
    }
    return minCostCopy
}

fun main() {
    val n = 4
    val graph = arrayOf(
        intArrayOf(0, 10, 15, 20),
        intArrayOf(10, 0, 35, 25),
        intArrayOf(15, 35, 0, 30),
        intArrayOf(20, 25, 30, 0)
    )
    val v = IntArray(n)
    v[0] = 1
    val minCost = tsp(graph, v, 0, n, 1, 0, Int.MAX_VALUE)
    println("The minimum cost is $minCost")
}
2. Torre de Hanoi
Un problema clásico de recursión que involucra mover discos entre tres varillas según ciertas reglas.

Ejemplo en Kotlin:
kotlin
fun hanoi(n: Int, from: String, to: String, aux: String) {
    if (n == 1) {
        println("Move disk 1 from $from to $to")
        return
    }
    hanoi(n - 1, from, aux, to)
    println("Move disk $n from $from to $to")
    hanoi(n - 1, aux, to, from)
}

fun main() {
    val n = 3 // Number of disks
    hanoi(n, "A", "C", "B") // Names of the rods
}
3. Ordenamiento Rápido (Quicksort)
Un algoritmo de ordenación eficiente que utiliza la técnica de dividir y conquistar.

Ejemplo en Kotlin:
kotlin
fun quicksort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pi = partition(arr, low, high)
        quicksort(arr, low, pi - 1)
        quicksort(arr, pi + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            arr[i] = arr[j].also { arr[j] = arr[i] }
        }
    }
    arr[i + 1] = arr[high].also { arr[high] = arr[i + 1] }
    return i + 1
}

fun main() {
    val arr = intArrayOf(10, 7, 8, 9, 1, 5)
    quicksort(arr, 0, arr.size - 1)
    println("Sorted array: ${arr.joinToString(", ")}")
}
4. Suma de Subconjunto (Subset Sum Problem)
Determina si hay un subconjunto de un conjunto dado de números enteros que suma a un valor objetivo.

Ejemplo en Kotlin:
kotlin
fun subsetSum(arr: IntArray, n: Int, sum: Int): Boolean {
    if (sum == 0) return true
    if (n == 0 && sum != 0) return false
    if (arr[n - 1] > sum) return subsetSum(arr, n - 1, sum)
    return subsetSum(arr, n - 1, sum) || subsetSum(arr, n - 1, sum - arr[n - 1])
}

fun main() {
    val arr = intArrayOf(3, 34, 4, 12, 5, 2)
    val sum = 9
    val n = arr.size
    if (subsetSum(arr, n, sum))
        println("Found a subset with given sum")
    else
        println("No subset with given sum")
}
5. Problema del Cambio de Moneda (Coin Change Problem)
Determina el número de maneras en que se puede hacer un cambio para una cantidad específica usando una cantidad ilimitada de monedas de ciertos valores.

Ejemplo en Kotlin:
kotlin
fun countWays(coins: IntArray, m: Int, n: Int): Int {
    val table = IntArray(n + 1)
    table[0] = 1
    for (i in 0 until m) {
        for (j in coins[i]..n) {
            table[j] += table[j - coins[i]]
        }
    }
    return table[n]
}

fun main() {
    val coins = intArrayOf(1, 2, 3)
    val n = 4
    println("Number of ways to make change for $n: ${countWays(coins, coins.size, n)}")
}
    6. Números Primos
Determina si un número dado es primo.

Ejemplo en Kotlin:
kotlin
fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (i in 3..Math.sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val numero = 29
    println("¿$numero es primo? ${esPrimo(numero)}")
}
7. Palíndromo
Comprueba si una cadena es un palíndromo (se lee igual de adelante hacia atrás y de atrás hacia adelante).

Ejemplo en Kotlin:
kotlin
fun esPalindromo(cadena: String): Boolean {
    val limpio = cadena.replace(Regex("[^A-Za-z]"), "").toLowerCase()
    return limpio == limpio.reversed()
}

fun main() {
    val palabra = "Anita lava la tina"
    println("¿'$palabra' es un palíndromo? ${esPalindromo(palabra)}")
}
8. Suma de Dígitos Recursiva
Calcula la suma de los dígitos de un número de manera recursiva.

Ejemplo en Kotlin:
kotlin
fun sumaDigitos(n: Int): Int {
    if (n == 0) return 0
    return n % 10 + sumaDigitos(n / 10)
}

fun main() {
    val numero = 1234
    println("La suma de los dígitos de $numero es ${sumaDigitos(numero)}")
}
9. Combinaciones de un Conjunto
Genera todas las combinaciones de un conjunto dado.

Ejemplo en Kotlin:
kotlin
fun combinaciones(conjunto: List<Int>, temp: List<Int> = emptyList(), index: Int = 0): List<List<Int>> {
    if (index == conjunto.size) {
        return listOf(temp)
    }
    val combsConEl = combinaciones(conjunto, temp + conjunto[index], index + 1)
    val combsSinEl = combinaciones(conjunto, temp, index + 1)
    return combsConEl + combsSinEl
}

fun main() {
    val conjunto = listOf(1, 2, 3)
    val combs = combinaciones(conjunto)
    println("Combinaciones de $conjunto: $combs")
}
10. Generar Permutaciones
Genera todas las permutaciones de una lista de números.

Ejemplo en Kotlin:
kotlin
fun permutar(arr: IntArray, l: Int, r: Int) {
    if (l == r) {
        println(arr.joinToString(", "))
    } else {
        for (i in l..r) {
            arr[l] = arr[i].also { arr[i] = arr[l] }
            permutar(arr, l + 1, r)
            arr[l] = arr[i].also { arr[i] = arr[l] }
        }
    }
}

fun main() {
    val arr = intArrayOf(1, 2, 3)
    permutar(arr, 0, arr.size - 1)
}
11. Calcular Exponenciación Rápida
Calcula de manera eficiente a^b utilizando exponenciación rápida.

Ejemplo en Kotlin:
kotlin
fun exponenciacionRapida(base: Int, exponente: Int): Int {
    if (exponente == 0) return 1
    val temp = exponenciacionRapida(base, exponente / 2)
    return if (exponente % 2 == 0) temp * temp else base * temp * temp
}

fun main() {
    val base = 2
    val exponente = 10
    println("$base^$exponente = ${exponenciacionRapida(base, exponente)}")
}
12. Encontrar el Máximo y el Mínimo en un Array
Encuentra los valores máximo y mínimo en un array sin utilizar funciones incorporadas como max() o min().

Ejemplo en Kotlin:
kotlin
fun maxMin(arr: IntArray): Pair<Int, Int> {
    var max = arr[0]
    var min = arr[0]
    for (num in arr) {
        if (num > max) max = num
        if (num < min) min = num
    }
    return Pair(max, min)
}

fun main() {
    val arr = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5)
    val (max, min) = maxMin(arr)
    println("El máximo es $max y el mínimo es $min")
}
13. Generar Números de Fibonacci hasta N
Genera los números de Fibonacci hasta el número N.

Ejemplo en Kotlin:
kotlin
fun fibonacciHastaN(n: Int): List<Int> {
    val fibs = mutableListOf(0, 1)
    var i = 2
    while (true) {
        val nextFib = fibs[i - 1] + fibs[i - 2]
        if (nextFib > n) break
        fibs.add(nextFib)
        i++
    }
    return fibs
}

fun main() {
    val n = 100
    println("Números de Fibonacci hasta $n: ${fibonacciHastaN(n)}")
}
14. Calcular el Factorial de un Número (Iterativo y Recursivo)
Ejemplo en Kotlin:
kotlin
fun factorialIterativo(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun factorialRecursivo(n: Int): Int {
    if (n == 0) return 1
    return n * factorialRecursivo(n - 1)
}

fun main() {
    val numero = 5
    println("Factorial (iterativo) de $numero es ${factorialIterativo(numero)}")
    println("Factorial (recursivo) de $numero es ${factorialRecursivo(numero)}")
}
15. Calcular la Suma de una Serie Geométrica
Calcula la suma de una serie geométrica dada a, r y n.

Ejemplo en Kotlin:
kotlin
fun sumaSerieGeometrica(a: Int, r: Int, n: Int): Double {
    if (r == 1) return (a * n).toDouble()
    return a * (1 - Math.pow(r.toDouble(), n.toDouble())) / (1 - r)
}

fun main() {
    val a = 2 // Primer término
    val r = 3 // Razón común
    val n = 5 // Número de términos
    println("La suma de la serie geométrica es ${sumaSerieGeometrica(a, r, n)}")
}

16. Buscar el Elemento Máximo en una Lista Recursivamente
Encuentra el elemento máximo en una lista utilizando recursión.

Ejemplo en Kotlin:
kotlin
fun maxElemento(lista: List<Int>): Int {
    if (lista.size == 1) return lista[0]
    val maxDelResto = maxElemento(lista.drop(1))
    return if (lista[0] > maxDelResto) lista[0] else maxDelResto
}

fun main() {
    val lista = listOf(3, 5, 7, 2, 8)
    println("El elemento máximo en la lista es ${maxElemento(lista)}")
}
17. Juego de la Vida de Conway
Simula el Juego de la Vida de Conway, una autómata celular.

Ejemplo en Kotlin:
kotlin
fun juegoDeLaVida(grid: Array<IntArray>) {
    val rows = grid.size
    val cols = grid[0].size
    val tempGrid = Array(rows) { IntArray(cols) }

    for (i in grid.indices) {
        for (j in grid[0].indices) {
            val neighbors = contarVecinos(grid, i, j)
            tempGrid[i][j] = when {
                grid[i][j] == 1 && (neighbors < 2 || neighbors > 3) -> 0
                grid[i][j] == 0 && neighbors == 3 -> 1
                else -> grid[i][j]
            }
        }
    }

    for (i in grid.indices) {
        for (j in grid[0].indices) {
            grid[i][j] = tempGrid[i][j]
        }
    }
}

fun contarVecinos(grid: Array<IntArray>, x: Int, y: Int): Int {
    val directions = listOf(-1, 0, 1)
    var count = 0
    for (dx in directions) {
        for (dy in directions) {
            if (dx == 0 && dy == 0) continue
            val nx = x + dx
            val ny = y + dy
            if (nx in grid.indices && ny in grid[0].indices && grid[nx][ny] == 1) {
                count++
            }
        }
    }
    return count
}

fun main() {
    val grid = arrayOf(
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 1),
        intArrayOf(1, 1, 1),
        intArrayOf(0, 0, 0)
    )

    juegoDeLaVida(grid)
    grid.forEach { println(it.joinToString(" ")) }
}
18. Sudoku Solver
Resuelve un rompecabezas de Sudoku.

Ejemplo en Kotlin:
kotlin
fun resolverSudoku(tablero: Array<IntArray>): Boolean {
    for (fila in 0..8) {
        for (columna in 0..8) {
            if (tablero[fila][columna] == 0) {
                for (num in 1..9) {
                    if (esPosible(tablero, fila, columna, num)) {
                        tablero[fila][columna] = num
                        if (resolverSudoku(tablero)) return true
                        tablero[fila][columna] = 0
                    }
                }
                return false
            }
        }
    }
    return true
}

fun esPosible(tablero: Array<IntArray>, fila: Int, columna: Int, num: Int): Boolean {
    for (i in 0..8) {
        if (tablero[fila][i] == num || tablero[i][columna] == num || tablero[fila / 3 * 3 + i / 3][columna / 3 * 3 + i % 3] == num) {
            return false
        }
    }
    return true
}

fun main() {
    val tablero = arrayOf(
        intArrayOf(5, 3, 0, 0, 7, 0, 0, 0, 0),
        intArrayOf(6, 0, 0, 1, 9, 5, 0, 0, 0),
        intArrayOf(0, 9, 8, 0, 0, 0, 0, 6, 0),
        intArrayOf(8, 0, 0, 0, 6, 0, 0, 0, 3),
        intArrayOf(4, 0, 0, 8, 0, 3, 0, 0, 1),
        intArrayOf(7, 0, 0, 0, 2, 0, 0, 0, 6),
        intArrayOf(0, 6, 0, 0, 0, 0, 2, 8, 0),
        intArrayOf(0, 0, 0, 4, 1, 9, 0, 0, 5),
        intArrayOf(0, 0, 0, 0, 8, 0, 0, 7, 9)
    )

    if (resolverSudoku(tablero)) {
        tablero.forEach { println(it.joinToString(" ")) }
    } else {
        println("No hay solución")
    }
}
19. Búsqueda Binaria
Implementa el algoritmo de búsqueda binaria para encontrar un elemento en una lista ordenada.

Ejemplo en Kotlin:
kotlin
fun busquedaBinaria(arr: IntArray, x: Int): Int {
    var inicio = 0
    var fin = arr.size - 1
    while (inicio <= fin) {
        val mid = (inicio + fin) / 2
        if (arr[mid] == x) return mid
        if (arr[mid] < x) inicio = mid + 1
        else fin = mid - 1
    }
    return -1
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val x = 4
    val resultado = busquedaBinaria(arr, x)
    if (resultado != -1) {
        println("Elemento encontrado en el índice $resultado")
    } else {
        println("Elemento no encontrado")
    }
}
20. Verificar si una Cadena Tiene Todos los Caracteres Únicos
Determina si una cadena contiene solo caracteres únicos.

Ejemplo en Kotlin:
kotlin
fun tieneCaracteresUnicos(cadena: String): Boolean {
    val caracteresVistos = mutableSetOf<Char>()
    for (caracter in cadena) {
        if (caracter in caracteresVistos) return false
        caracteresVistos.add(caracter)
    }
    return true
}

fun main() {
    val cadena = "abcdefg"
    println("¿La cadena '$cadena' tiene caracteres únicos? ${tieneCaracteresUnicos(cadena)}")
}
21. Encontrar Puntos de Intersección entre Dos Listas
Determina los elementos comunes entre dos listas.

Ejemplo en Kotlin:
kotlin
fun interseccion(lista1: List<Int>, lista2: List<Int>): List<Int> {
    return lista1.intersect(lista2.toSet()).toList()
}

fun main() {
    val lista1 = listOf(1, 2, 3, 4, 5)
    val lista2 = listOf(3, 4, 5, 6, 7)
    val interseccion = interseccion(lista1, lista2)
    println("Intersección entre lista1 y lista2: $interseccion")
}
22. Buscar el Elemento Mayor Común en dos Listas
Encuentra el elemento mayor común entre dos listas.

Ejemplo en Kotlin:
kotlin
fun mayorComun(lista1: List<Int>, lista2: List<Int>): Int? {
    return lista1.intersect(lista2.toSet()).maxOrNull()
}

fun main() {
    val lista1 = listOf(1, 2, 3, 4, 5)
    val lista2 = listOf(3, 4, 5, 6, 7)
    val mayorComun = mayorComun(lista1, lista2)
    println("Mayor elemento común entre lista1 y lista2: $mayorComun")
}
23. Generar un Conjunto Potencia
Genera todas las combinaciones posibles (el conjunto potencia) de un conjunto dado.

Ejemplo en Kotlin:
kotlin
fun conjuntoPotencia(conjunto: List<Int>): List<List<Int>> {
    val resultado = mutableListOf<List<Int>>()
    val n = conjunto.size
    for (i in 0 until (1 shl n)) {
        val subset = mutableListOf<Int>()
        for (j in 0 until n) {
            if (i and (1 shl j) != 0) {
                subset.add(conjunto[j])
            }
        }
        resultado.add(subset)
    }
    return resultado
}

fun main() {
    val conjunto = list
}
 */