package Programacion01.PF.basicos

/*
función de extensión esLetraMinuscula()

Escribe una función esLetraMinuscula() que actua sobre caracteres y cumpla el test de forma que devuelve:

    true, si el caracter es una letra minúscula
    false, en caso contrario

Por ejemplo:
Prueba 	Resultado

println('a'.esLetraMinuscula())
println('A'.esLetraMinuscula())
println('5'.esLetraMinuscula())



true
false
false

Respuesta:(sistema de penalización: 0 %)
 */
fun Char.esLetraMinuscula():Boolean{
    var caracteresMayusculos= mutableListOf<Int>()
    for (i in 97..122) caracteresMayusculos.add(i)
        return caracteresMayusculos.contains(this.toInt())
}
//fun Char.esLetraMinuscula() = this.isLowerCase()
fun main(){

    println('a'.esLetraMinuscula()) //true
    println('A'.esLetraMinuscula()) //false
    println('5'.esLetraMinuscula()) //false
    /*
    var a = 'z'
    println
     */
}