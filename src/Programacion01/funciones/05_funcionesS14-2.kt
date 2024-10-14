package Programacion01.funciones

/*
media con parámetros de distintos tipos

Observa el test y escribe la función media() que calcula la media aritmética de dos valores. Observa que los argumentos pueden ser ambos double o bien ambos Int o bien ambos String

Por ejemplo:
Prueba 	                    Resultado

 println(media(2, 3))       2.5
 println(media(2.0, 3.0))   2.5
 println(media("2", "3"))   2.5
Respuesta:
 */
fun media(num1: Int, num2: Int): Double{
    return((num1.toDouble()+num2.toDouble())/2.0)
}
fun media(num1:Double, num2:Double): Double{
    return((num1.toDouble()+num2.toDouble())/2.0)
}
fun media(num1: String, num2: String): Double{
    return((num1.toDouble()+num2.toDouble())/2.0)
}
fun main(){
    println(media(2, 3))
    println(media(2.0, 3.0))
    println(media("2", "3"))
}