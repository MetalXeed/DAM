/*

Par o impar

Se solicite al usuario la entrada de un número entero positivo y el programa mostrará alguno de los siguientes mensajes:

    <valor introducido> es un número par, si el valor introducido es par

    <valor introducido> es un número impar, si el valor introducido es impar



PISTA:

    Un número es par si el resto de la división entera entre 2 es 0


 */

fun main() {
    var n=readln().toInt()

    if (n % 2 == 0) println("$n es un número par")
    else println("$n es un número impar")
}