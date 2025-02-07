package Programacion01.PF.`17_highOrder`

fun main(){
    val listaNumeros:List<Int> = (1..10).toList()
    println("Consultas sobre esta lista de numeros: $listaNumeros")
    val pares = listaNumeros.filter { it%2==0 }
    println(pares)
    println("Suma de los elementos pares: *")
}