package Programacion01
/*
    Sumar n números
    Ejercicio para familizarizarse con el sistema de entrada/salida
    Se pide simplemente sumar n números.

ENTRADA:
    Comienza con un valor para n, donde n es la cantidad de números a sumar. Se garantiza que n>0.
    A continuación viene  una lista de los n números a sumar

SALIDA:
    La suma de los n números.

COMENTARIOS:
    Fíjate que en este estilo de problemas, a veces, como en este caso, los ejemplos de entrada
    salida realmente completan el enunciado porque observo en ellos como me van a mandar los datos.
    En este caso me fijo que en una linea me mandan n y a continuación en otra línea la lista de
    enteros separados por un espacio en blanco

Entrada 	Resultado

3           6
1 2 3

4           3
1 1 1 0

 */
fun main() {
    //println("Introduce n de Int a sumar:")
    var n=readln().toInt()//nº de valores
    //println("Introduce n a sumar separados por espacio:")
    var listan = readln()//listado de nº
    var resultado = 0
    val lista2 = listan.split(" ")
    for (i in 0..(lista2.size-1)){
        resultado = resultado + lista2[i].toInt()
    }
    println(resultado)

}