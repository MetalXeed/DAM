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
    operator fun minus(otro:Puntito):Puntito{
        this.a= 0-this.a
        this.a= 0-this.a
        return this
    }
}
fun main() {
    val puntito = Puntito(10, 20)
    println(-puntito)
    println(-"12345Hola mundo")
}