package Programacion01.listas

/*
¿Cuantos días faltan?

Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja? Asumiremos que nos encontramos en un año no
bisiesto.
Entrada

La entrada comenzará con un entero para especificar el número de casos de prueba que vendrá a continuación. Para cada
caso de prueba se mostrará una línea en la que aparecerán dos enteros, el primero de ellos será correspondiente al
día y el segundo correspondiente al mes de una fecha válida.
Salida

Para cada fecha de la entrada, se mostrarán el número de días completos que faltan hasta el día de Nochevieja.

Por ejemplo:
Entrada 	Resultado

3           3
28 12       1
30 12       364
1 1

 */

fun contardias(date:List<Int>):Int{
    var diasRestantes = 0
    var diaspormes = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
    diasRestantes +=  diaspormes[date[1]-1] -date[0]
    for (i in date[1] until 12){
        diasRestantes+= diaspormes[i-1]
    }
    return diasRestantes
}
fun main() {
    val entradas = readLine()!!.toInt()

    for (i in 0..entradas - 1) {
        var fechas= readLine()!!.split(" ").map {it.toInt()}
        println(contardias(fechas))

    }
}
/*
fun contardias(dia: Int, mes: Int): Int {
val diasPorMes = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
 var diasRestantes = 0 // Sumar días restantes del mes actual dias
 Restantes += diasPorMes[mes - 1] - dia
 // Sumar días de los meses siguientes
 for (i in mes until 12) { diasRestantes += diasPorMes[i] }
 return diasRestantes }
 fun main() {
 val entradas = readLine()!!.toInt()
 for (i in 0 until entradas) {
 val (dia, mes) = readLine()!!.split(" ").map { it.toInt()
 }
 println(contardias(dia, mes)) }

 */