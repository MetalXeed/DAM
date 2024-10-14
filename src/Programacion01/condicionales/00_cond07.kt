package Programacion01.condicionales
/*

Obtener numero de mes a partir de nombre de mes

Entrada 	Resultado

Mayo        el mes Mayo es el numero 5

Diciembre   el mes Diciembre es el numero 12


 */

fun main(){
    val mes = readln()
    when (mes){
        "Enero" -> println("el mes $mes es el numero 1")
        "Febrero" -> println("el mes $mes es el numero2")
        "Marzo" -> println("el mes $mes es el numero 3")
        "Abril" -> println("el mes $mes es el numermo 4")
        "Mayo" -> println("el mes $mes es el numero 5")
        "Junio" -> println("el mes $mes es el numero 6")
        "Julio" -> println("el mes $mes es el numero 7")
        "Agosto" -> println("el mes $mes es el numero 8")
        "Septiembre" -> println("el mes $mes es el numero 9")
        "Octubre" -> println("el mes $mes es el numero 10")
        "Noviembre" -> println("el mes $mes es el nuemro 11")
        "Diciembre" -> println("el mes $mes es el numero 12")
    }

}