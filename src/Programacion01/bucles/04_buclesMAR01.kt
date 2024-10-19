package Programacion01.bucles

import Programacion01.funciones.readlnToInt

/*
 Aburrimiento en las sobremesas

Los palillos y las cerillas son elementos típicos de gran cantidad de figuras, juegos y entretenimientos para la
sobremesa. Todo el mundo, alguna vez, cuando la conversación desvaría e invade el tedio, hemos matado el tiempo
            haciendo formas geométricas, de mayor o menor tamaño dependiendo de cuanto material de construcción
            tengamos a mano.

Por ejemplo, con 18 cerillas podemos formar la siguiente figura:

Si la conversación es especialmente aburrida, se puede ir haciendo más y más grande, hasta que se acaben las
cerillas, el espacio en la mesa… ¡o la conversación!

Entrada

La entrada estará compuesta de una sucesión de números positivos menores que 20.000. El último, que no deberá
procesarse, será un 0.

Salida

Por cada número de la entrada el programa deberá escribir cuántas cerillas son necesarias para formar un
triángulo con ese número de cerillas en cada lado siguiendo el esquema de la figura.

Por ejemplo:
Entrada 	Resultado

3           18
1           3
60          5490
0
Respuesta:
 */
fun piramide(n:Int,r:Int):Int {
    var result:Int = r
    result+=(n * 3)
    if (n == 1) {
        return (result)
    }else {
        return piramide(n - 1,result)
    }
}
fun main() {
    var altura = readln().toInt()
    var resultado= 0
    while(altura>0){

        println(piramide(altura,resultado))

        altura = readln().toInt()
    }
}