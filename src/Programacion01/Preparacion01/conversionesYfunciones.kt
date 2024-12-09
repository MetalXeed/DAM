package Programacion01.Preparacion01
fun main() {


    /*
//Transformaciones
 */
//.toCharArray() despues puedes usar sorted


    /*
//Funciones
 */

    ////////////ARRAYS///////////////
//indexOf
    val array = arrayOf(1, 2, 3, 4, 5)
    println("El índice del elemento 3 es: ${array.indexOf(3)}")
//contains
    println("El array contiene 3: ${array.contains(3)}")
//first(), last()
//sorted(), sortedDescending()
//map(), filter()
    val mappedArray = array.map { it * 2 }
    println("Array mapeado: ${mappedArray.joinToString()}")  // Output: Array mapeado: 2, 4, 6, 8, 10

    val filteredArray = array.filter { it % 2 == 0 }
    println("Array filtrado: ${filteredArray.joinToString()}")  // Output: Array filtrado: 2, 4

//forEach
    array.forEach { println("Elemento: $it") }

//joinToString()
    val joinedString = array.joinToString(separator = ", ")
    println("Array como cadena: $joinedString")  // Output: Array como cadena: 1, 2, 3, 4, 5

    //copyOf()
    val copyArray = array.copyOf()
    println("Copia del array: ${copyArray.joinToString()}")  // Output: Copia del array: 1, 2, 3, 4, 5
//slice()
    val subArray = array.slice(1..3)
    println("Subarray: ${subArray.joinToString()}")  // Output: Subarray: 2, 3, 4

    //plus
    val newArray = array.plus(4).plus(5)
    println("Nuevo array: ${newArray.joinToString()}")  // Output: Nuevo array: 1, 2, 3, 4, 5

    //distinct()
    val uniqueArray = array.distinct()
    println("Array con elementos únicos: ${uniqueArray.joinToString()}")  // Output: Array con elementos únicos: 1, 2, 3, 4, 5

    //flatten()
    val nestedArray = arrayOf(arrayOf(1, 2), arrayOf(3, 4), arrayOf(5))
    val flatArray = nestedArray.flatten()
    println("Array plano: ${flatArray.joinToString()}")  // Output: Array plano: 1, 2, 3, 4, 5

    //reduce()
    val sum = array.reduce { acc, i -> acc + i }
    println("Suma de los elementos: $sum")  // Output: Suma de los elementos: 15

    //fold()
    val sumWithInitial = array.fold(10) { acc, i -> acc + i }
    println("Suma de los elementos con valor inicial 10: $sumWithInitial")  // Output: Suma de los elementos con valor inicial 10: 25

    //all()
    val allEven = array.all { it % 2 == 0 }
    println("Todos los elementos son pares: $allEven")  // Output: Todos los elementos son pares: true

    //any()
    val anyEven = array.any { it % 2 == 0 }
    println("Hay al menos un elemento par: $anyEven")  // Output: Hay al menos un elemento par: true

    //count()
    val evenCount = array.count { it % 2 == 0 }
    println("Número de elementos pares: $evenCount")  // Output: Número de elementos pares: 2

    //take(), takeLast()
    val firstThree = array.take(3)
    println("Primeros tres elementos: ${firstThree.joinToString()}")  // Output: Primeros tres elementos: 1, 2, 3

    val lastTwo = array.takeLast(2)
    println("Últimos dos elementos: ${lastTwo.joinToString()}")  // Output: Últimos dos elementos: 4, 5

    //drop(), dropLast()
    val allButFirstTwo = array.drop(2)
    println("Todos menos los dos primeros: ${allButFirstTwo.joinToString()}")  // Output: Todos menos los dos primeros: 3, 4, 5

    val allButLastThree = array.dropLast(3)
    println("Todos menos los últimos tres: ${allButLastThree.joinToString()}")  // Output: Todos menos los últimos tres: 1, 2

    //partition()
    val (even, odd) = array.partition { it % 2 == 0 }
    println("Elementos pares: ${even.joinToString()}")  // Output: Elementos pares: 2, 4
    println("Elementos impares: ${odd.joinToString()}")  // Output: Elementos impares: 1, 3, 5

    //groupby()
    val groupByModulo = array.groupBy { it % 3 }
    println("Agrupados por módulo 3: $groupByModulo")  // Output: Agrupados por módulo 3: {1=[1, 4], 2=[2, 5], 0=[3, 6]}


    val listaMutable = mutableListOf("a", "b", "c")
    val arrayn = listaMutable.toTypedArray()
    //val arrayM = array<>()

        val mapa = mapOf("a" to 1, "b" to 2, "c" to 3)

        // Imprimir claves
        println("Claves:")
        for (clave in mapa.keys) {
            println(clave)
        }

        // Imprimir valores
        println("Valores:")
        for (valor in mapa.values) {
            println(valor)
        }

        // Imprimir entradas
        println("Entradas:")
        for (entrada in mapa.entries) {
            println("Clave: ${entrada.key}, Valor: ${entrada.value}")
        }


}
