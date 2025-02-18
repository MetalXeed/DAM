package Programacion01.PF.basicos

/*
fun standard, anónima y lambda

Se trata de comparar la sintaxis de 3 funciones que hacen lo mismo. Escribimos la función con 3 versiones:
"normal", anónima y lambda. Para usar una función normal tendras que usar una referencia a una función.

Envía el siguiente código completado para pasar el test

fun esParFunNormal ....  //completa la fun

fun main() {
    val esParConFunNormal= esParFunNormal(3)
    println(esParConFunNormal)
    val esParConAnonima = //version anónima
    println(esParConAnonima(7))
    val esParConLambda= // version lambda
    println(esParConLambda(8))
}

Por ejemplo:
Resultado

false
false
true

 */
//completa la fun
fun esParFunNormal(entero:Int=0):Boolean{
    return (entero % 2 == 0)
}

fun main() {
    val esParConFunNormal= esParFunNormal(3)
    println(esParConFunNormal)

    val esParConAnonima = fun(entero:Int): Boolean {return entero % 2 == 0}//version anónima
    println(esParConAnonima(7))

    val esParConLambda = { a:Int -> a % 2 ==0}
    println(esParConLambda(8))
}