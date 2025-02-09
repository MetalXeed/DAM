package Programacion01.PF.basicos

/*
Para practicar sobrecarga de operadores

Añade el código necesario para que funcione el test

Por ejemplo:

Prueba 	Resultado

fun main() {
    val puntito = Puntito(10, 20)
    println(-puntito)
    println(-"12345Hola mundo")
}



Puntito(x=-10, y=-20)
odnum aloH54321

 */
data class Puntito(var a:Int, var b:Int){
    operator fun unaryMinus():Puntito{
        a= -a
        b= -b
        return this
    }
}
operator fun String.unaryMinus():String{
    return this.reversed()
}
//data class Puntito(val x: Int, val y: Int) {
//    operator fun unaryMinus() = Puntito(-x, -y)
//}
//operator fun String.unaryMinus(): String = this.reversed()
fun main() {
    val puntito = Puntito(10, 20)
    println(-puntito)
    println(-"12345Hola mundo")
}