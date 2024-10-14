package Programacion01.funciones

/*
a es mayor que b  otra vez

Escribe la función correspondiente al test

Por ejemplo:
Prueba 	                            Resultado

println(aMayorQueb(1.2,0.9))        true
println(aMayorQueb(2,9))            false
println(aMayorQueb("9","111"))      true
println(aMayorQueb("111","9"))      false
println(aMayorQueb("111","999"))    false
*/

fun aMayorQueb(num1:Double, num2: Double): String {
return ((num1>num2).toString())
}
fun aMayorQueb(num1:Int, num2: Int): String {
    return (num1>num2).toString()
}
fun aMayorQueb(num1:String, num2: String): String {
    return (num1>num2).toString()
}
fun main(){
    println(aMayorQueb(1.2,0.9))
    println(aMayorQueb(2,9))
    println(aMayorQueb("9","111"))
    println(aMayorQueb("111","9"))
    println(aMayorQueb("111","999"))
}