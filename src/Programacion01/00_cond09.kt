package Programacion01
/*

Notas

Escribe un programa que lea por entrada estándar una calificación numérica entre 0 y 10 (con decimales) y la
 transforma en calificación alfabética según la siguiente tabla.

• de 0 a <3 Muy deficiente
• de 3 a <5 Insuficiente
• de 5 a <6 Bien
• de 6 a <9 Notable
• de 9 a 10 Sobresaliente

Entrada 	Resultado

0.0         Muy deficiente

 */

fun main(){

    val puntuacion = readln().toDouble()
    when(puntuacion){
        in 0.0..2.99 -> println("Muy deficiente")
        in 3.00..4.99 -> println("Insuficiente")
        in 5.00..5.99 -> println("Bien")
        in 6.00..8.99 -> println("Notable")
        in 9.00..10.00 -> println("Sobresaliente")
    }
}