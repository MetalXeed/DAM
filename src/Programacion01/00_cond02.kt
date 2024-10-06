package Programacion01/*

Comprobar si un numero es multiplo de otro

Se piden dos números enteros por teclado,  si comprueba si el primero es múltiplo del segundo y muestra el
 resultado de la siguiente forma:

    <num1> es múltiplo de <num2>, en caso de que sea múltiplo

    <num1> no es múltiplo de <num2>, en caso de que no lo sea

 Para evitar  posibilidades matemáticas suponemos siempre que num1 y num2 son siempre mayores que 0

 */

fun main() {
    var n = readln()
    var listan = n.split(" ")
    if (listan.size < 2) println("no tenemos 2 dígitos")
    else {
        val x = listan[0].toInt()
        val y = listan[1].toInt()

        if ((x % y) == 0) println("$x es múltiplo de $y")
        else println("$x no es múltiplo de $y")
    }
}