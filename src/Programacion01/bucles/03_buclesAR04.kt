package Programacion01.bucles
/*

El día de Navidad

La Navidad es una de las fiestas más esperadas. Cada uno tiene sus motivos (religiosos, fiestas
en el colegio y trabajo, villancicos…). Sobre todo los más pequeños de la casa, están impacientes
                                               de que sea Navidad y preguntan insistentemente a sus padres:
                                                "¿Ya es Navidad?", "¿Ya es Navidad?", "¿Ya es Navidad?".

Nuestra tarea es hacer un programa que permita a nuestros niños saber si es Navidad o no.

Entrada

La entrada comenzará con un número N indicando cuántas fechas se consultarán. A continuación vendrán esas N
fechas, con dos números enteros, día y mes en el formato DD MM indicando el día y el mes a consultar. Todas
 las fechas serán correctas.

Salida

Por cada fecha de la entrada, el programa deberá escribir SI si la fecha es la del día de Navidad, 25 de
diciembre, y NO en otro caso.

Por ejemplo:
Entrada 	Resultado

2           SI
25 12       NO
03 05

*/

fun main(){

    var n = readln().toInt()
    do {

        var fecha = readln().split(" ")
        var dia = fecha[0].toInt()
        var mes = fecha[1].toInt()

        if (dia == 25 && mes == 12) println("SI")
        else println("NO")
        n--
    } while (n!=0)
}