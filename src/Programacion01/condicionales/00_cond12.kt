package Programacion01.condicionales
/*

ENTRADA:Se leen en una  linea una hora(instante) en formato hh:mm:ss
SALIDA:  la hora correspondiente a sumarle un segundo a la hora de entrada.

Entrada 	Resultado

00:00:00    00:00:01

23:59:59    00:00:00


 */

fun main() {
    val entrada = readln()
    val lectura = entrada.split(":")

    var horas = lectura[0].toInt()
    var minutos = lectura[1].toInt()
    var segundos = lectura[2].toInt()
    var salida:String

    if (segundos == 59){
        segundos =0
        if (minutos == 59) {
            minutos =0
            if (horas == 23) horas = 0
            else horas++
        }else minutos++
    }else segundos++
    salida = "${horas.toString().padStart(2,'0')}:${minutos.toString().padStart(2,'0')}:${segundos.toString().padStart(2,'0')}"
    println(salida)
}