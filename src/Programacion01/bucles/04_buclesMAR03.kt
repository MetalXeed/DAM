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
//import kotlin.math.absoluteValue
fun main() {
    var entrada = readLine()!!
    var contador = 0
    while(entrada != null && entrada.isNotEmpty()){
        var valores  = entrada.split(" ").map { it.toInt() }
        contador = 0

        if (valores[0] == valores[1] && valores[1]==0) break
        val dif = (valores[0] - valores[1]).absoluteValue
        if (dif < 50) {
            println(dif)
        } else if (valores[0] > valores[1]) {
            println(valores[1] + 99 - valores[0])
        } else if (valores[0] < valores[1]) {
            println(valores[0] + 99 - valores[1])
        } else println(dif)

        entrada = readLine()!!
    }
}