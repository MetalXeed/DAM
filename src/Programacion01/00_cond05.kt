package Programacion01/*

CÁLCULO DEL SALARIO NETO

Escribe un programa que lea en una línea el número de horas trabajadas y en otra línea el precio por hora.

Calcula el salario neto semanal de un trabajador en función del número de horas trabajadas y la tasa de impuestos
 de acuerdo a las siguientes reglas:

• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1.5 veces la tarifa normal.



Al sueldo bruto se le aplicarán las siguientes tasas de impuestos:

• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos.

 Imprime por la salida estándar el salario calculado.

 */

fun main() {
    val horas = readln().toDouble()
    val rate = readln().toDouble()
    var hextra = 0.0
    var bruto = 0.0
    var neto = 0.0
    when (horas){ //calculo del salario bruto

        in 0.0 .. 35.0 -> {
            bruto = (rate * horas)
        }
        in 35.001 .. 999.99 -> {
            hextra = horas - 35.0
            bruto = (rate * 35.0 + rate*1.5*hextra)
        }
    }
    when (bruto){    //calculo de salario neto

        in 0.0 .. 500.0 -> {
            neto = bruto
        }
        in 500.001 .. 899.99 -> {

            neto = ((bruto-500)*0.75+500)
        }
        in 900.00 .. Double.MAX_VALUE-> {
            neto = ((bruto-500.0-400.0)*0.55+(400.0)*0.75+500.0)
        }
    }
    println(neto)
}