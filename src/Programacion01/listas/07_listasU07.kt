package Programacion01.listas

/*
Va de modas

https://www.aceptaelreto.com/pub/problems/v001/52/st/statements/Spanish/index.html

Dado un conjunto, o distribución, de valores se define la moda como el valor (o valores) que más se repite en dicho
conjunto.

En este problema te pedimos que calcules la moda de un conjunto de números.
Entrada

La entrada consta de una serie de casos de prueba.

Cada caso comienza con un número que representa el número de valores que tiene el conjunto, que nunca será mayor de
25.000. En la siguiente línea se proporcionan, separados por espacio, los valores de todos los elementos del conjunto.
Todos ellos serán números enteros.

La entrada terminará con una serie de 0 valores.
Salida

Para cada caso de prueba se mostrará la moda de la distribución, es decir el número que más se repite.

Se garantiza que ningún caso de prueba contendrá más de una moda, es decir únicamente habrá un valor que aparezca el
mayor número de veces.

Por ejemplo:
Entrada 	                        Resultado

11                                  4
1 2 2 3 3 3 4 4 4 4 5               1
17
1 8 9 6 3 2 1 5 4 7 9 6 3 2 1 4 7
0

11
1 2 2 3 3 3 4 4 4 4 5
17
1 8 9 6 3 2 1 5 4 7 9 6 3 2 1 4 7
0


11
1 2 2 3 3 3 4 4 4 4 5
0


 */

fun esModa(listado: List<Int>): Int {
    //val listaFrecuencia = mutableListOf<Int>()
    val listaOrdenada = listado.toList().sorted()
    var frecuenciaActual = 0
    var frecuenciaMaxima = 0
    var moda:Int = listaOrdenada[0]

// Recorrer la lista y contar las ocurrencias de cada número
    for (i in 0..listaOrdenada.size-2) {
        if(listaOrdenada[i] == listaOrdenada[i+1]) frecuenciaActual++
        else {if(frecuenciaActual>frecuenciaMaxima){
            frecuenciaMaxima=frecuenciaActual
            moda=listaOrdenada[i]
        }
        frecuenciaActual=0
        }
    }
    // Verificar la última frecuencia
    if (frecuenciaActual>frecuenciaMaxima) moda = listaOrdenada.last()
// Encontrar el número con la mayor frecuencia
    return moda
}


fun main() {
    var nentradas: Int = readLine()!!.toInt()
    var entradas: List<Int>

    while (!nentradas.equals(0)) {
        entradas = readLine()!!.split(" ").map { it.toInt() }
        println(esModa(entradas))
        nentradas= readLine()!!.toInt()
    }
}
/*
**usando mapas
fun esModa(listado: List<Int>): Int {
    // Crear un mapa para contar las ocurrencias de cada número
    val frecuencia = mutableMapOf<Int, Int>()
// Contar las ocurrencias de cada número en la lista
    for (num in listado) {
        frecuencia[num] = frecuencia.getOrDefault(num, 0) + 1
    }
// Encontrar el número con la mayor frecuencia
    return frecuencia.maxByOrNull { it.value }!!.key
}

 */