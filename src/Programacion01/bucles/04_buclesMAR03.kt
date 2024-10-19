package Programacion01.bucles

import kotlin.math.absoluteValue

/*
ZAPPING

Mi tele tiene 99 canales correlativos que van desde el canal número 1 al 99. Hace algún tiempo se me estropeó el mando a distancia, y no me funcionan los números, por lo que no puedo acceder a mi canal favorito con ellos. Al menos, todavía funcionan los botones de pasar al siguiente canal y al anterior. No quiero que también estos botones se me rompan, de modo que siempre intento pulsarlos el menor número de veces.

Sabiendo que al pasar al siguiente canal desde el 99 la tele me salta al 1, y viceversa, ¿cuántas veces tengo que avanzar o retroceder de canal para pasar de un canal A a un canal B de forma óptima?

Entrada

La entrada consta de una serie de casos de prueba consistentes en dos valores entre 1 y 99, el primero correspondiente al canal en el que me encuentro y el segundo al canal al que quiero llegar. La entrada termina cuando los dos números son 0.

Salida

Para cada caso de prueba se escribirá una línea en la que aparecerá el número de veces que tengo que saltar de canal para conseguir mi objetivo de forma óptima.

Por ejemplo:
Entrada 	Resultado

2 5         3
2 99        2
5 63        41
63 5        41
0 0
Respuesta:
 */
fun caldisca(p1:Int, p2:Int):Int{
    if(p1 > 0 && p2 > 0) return p1
    return ((p1 - p2).absoluteValue)
}
fun main(args: Array<String>) {
    var entrada = readln().split(" ")//lista de valores

    var distancia= 0
    var punto1 = entrada[0].toInt()
    var punto2 = entrada[1].toInt()


    while(punto1 != -1 && punto2 != -1){
        for (i in 0..entrada.size-1 step 2) {
            distancia+= caldisca(punto1,punto2)

            var punto1 = entrada[i].toInt()
            var punto2 = entrada[i+1].toInt()

        }
        println(distancia)
        punto1 = readln().toInt()
        punto2 = readln().toInt()

        var punto1 = entrada[0].toInt()
        var punto2 = entrada[1].toInt()
    }
}