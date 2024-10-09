package Programacion01
/*

Calcular IMC

Descripción de estado físico según IMC (ïndice de masa corporal)

La entrada es el peso y la altura,cada uno en una línea.  Se calcula el IMC correspondiente
 sabiendo el imc equivale al peso dividido por la altura al cuadrado y se imprime el estado
  físico de la persona según la siguiente tabla

Entrada 	Resultado

74.0
1.66        Sobrepeso

 */

fun main() {
    var peso = readln().toFloat()
    var altura = readln().toFloat()
    var imc:Float=peso/(altura*altura)
    when (imc){
        in 0.0 .. 18.499 -> println("Delgado")
        in 18.5 .. 24.999 -> println("Normal")
        in 25.0 .. 29.999 -> println("Sobrepeso")
        in 30.0 .. 999.999 -> println("Obeso")
    }
}