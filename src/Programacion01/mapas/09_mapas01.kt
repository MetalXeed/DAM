package Programacion01.mapas

/*
Va de modas...

En la primera evaluación lo hicimos con arrays, ahora hazlo con mapas y observarás  como se simplifica la solución.

http://www.aceptaelreto.com/problem/statement.php?id=152

Dado un conjunto, o distribución, de valores se define la moda como el valor (o valores) que más se repite en dicho conjunto.

En este problema te pedimos que calcules la moda de un conjunto de números.
Entrada

La entrada consta de una serie de casos de prueba.

Cada caso comienza con un número que representa el número de valores que tiene el conjunto, que nunca será mayor de 25.000. En la siguiente línea se proporcionan, separados por espacio, los valores de todos los elementos del conjunto. Todos ellos serán números enteros.

La entrada terminará con una serie de 0 valores.
Salida

Para cada caso de prueba se mostrará la moda de la distribución, es decir el número que más se repite.

Se garantiza que ningún caso de prueba contendrá más de una moda, es decir únicamente habrá un valor que aparezca el mayor número de veces.



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


 */
fun esModa(lista:List<Int>):Int{
    val frecuencias = mutableMapOf<Int,Int>()
    var moda = lista[0]
    var frecuenciaMax = 1

    for (i in lista){
        frecuencias[i] = frecuencias.getOrDefault(i, 0) + 1
        // if(frecuencias.containsKey(i)) frecuencias.set(i,frecuencias[i]!!+1)
        //else frecuencias[i]=1
    }
// Encontrar el número con la mayor frecuencia
    for ((key, value) in frecuencias) {
        if (value > frecuenciaMax) {
            frecuenciaMax = value
            moda = key
        }
    }
    return moda
}
/*
for(key in frecuencias.values){

if(frecuencias[key]!! > frecuenciaMax) {
frecuenciaMax = frecuencias[key]!!
moda=key
}
    }
*/



fun main(){
    var nEntrada= readLine()!!.toInt()
    while (nEntrada!=0) {//leemos hasta que encontramos un 0
        var listaEntrada = readLine()!!.split(" ").map { it.toInt() }
        println(esModa(listaEntrada))
        nEntrada= readLine()!!.toInt()
    }
}
/*

COPILOT
fun esModa(lista:List<Int>):Int{
    val listaOrdenada = lista.sorted()
    var frecuencia = mutableMapOf<Int,Int>()
    for (i in lista){
        frecuencia[i] = frecuencia.getOrDefault(i,0)+1
    }
// Encontrar el número con la mayor frecuencia
    return frecuencia.maxByOrNull { it.value }?.key ?: 0
}


SOLUCION CON LISTAS:
fun esModa(n:Int,lista:List<Int>):Int{
    val listaOrdenada = lista.sorted()
    var frecuencia =1
    var frecuenciaMax = 1
    var moda = listaOrdenada[0]

    for (i in 0..lista.size-2){
        if (listaOrdenada[i]==listaOrdenada[i+1]) {
            frecuencia++
        }
        else frecuencia=1
        if (frecuencia>frecuenciaMax) {
            frecuenciaMax=frecuencia
            moda=listaOrdenada[i]
        }

    }
    return moda
}

fun main(){
    var nEntrada= readLine()!!.toInt()
    while (nEntrada!=0) {
        var listaEntrada = readLine()!!.split(" ").map { it.toInt() }
        println(esModa(nEntrada, listaEntrada))
        nEntrada= readLine()!!.toInt()
    }
}
 */