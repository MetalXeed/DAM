package Programacion01.condicionales
/*

Obtener nombre de mes a partir de numero de mes

Entrada 	Resultado

7           el mes 7 se llama Julio

1           el mes 1 se llama Enero

 */

fun main(){
    val mes = readln().toInt()
    when (mes){
        1 -> println("el mes $mes se llama Enero")
        2 -> println("el mes $mes se llama Febrero")
        3 -> println("el mes $mes se llama Marzo")
        4 -> println("el mes $mes se llama Abril")
        5 -> println("el mes $mes se llama Mayo")
        6 -> println("el mes $mes se llama Junio")
        7 -> println("el mes $mes se llama Julio")
        8 -> println("el mes $mes se llama Agosto")
        9 -> println("el mes $mes se llama Septiembre")
        10 -> println("el mes $mes se llama Octubre")
        11 -> println("el mes $mes se llama Noviembre")
        12 -> println("el mes $mes se llama Diciembre")
    }

}