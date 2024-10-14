package Programacion01.bucles
/*

Nochevieja

Ramón se pasa el día de Nochevieja contando los minutos que faltan para que den las uvas. ¿Puedes ayudarle?

Entrada

La entrada consiste en una serie de horas, cada una en una línea. Cada hora está formada por las horas y los minutos separados por : y utilizando siempre dos dígitos. Se utiliza una representación en formato 24 horas (es decir, desde 00:00 a 23:59).

La entrada termina cuando la hora es la medianoche (00:00), que no debe procesarse.

Salida

Para cada caso de prueba se mostrará una línea con el número de minutos que faltan para medianoche.

Por ejemplo:
Entrada 	Resultado

23:45       15
21:30       150
00:01       1439
00:00

 */

fun main(){
    do{
        var time = readln().split(":")
        if (time[0]=="00" && time[1]=="00") break
        var hours: Int = time[0].toInt()
        var minut: Int = time[1].toInt()
        var faltante = 0
        var rh = 23 - hours
        var rm = 60-minut

        faltante = rh * 60 + rm
        println(faltante)

    }while(true)
}