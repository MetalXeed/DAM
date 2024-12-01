package Programacion01.recursividad

/*
Ejercicio 1: Función Recursiva Simple
Vamos a crear una función recursiva que imprima números desde n hasta 1.

fun imprimir(n:Int){
    if(n>0){
        println(n)
        imprimir(n-1)
    }
}
fun main(){

    imprimir(5)
}
Ejercicio 2: Cálculo del Factorial con Recursividad
Vamos a calcular el factorial de un número utilizando recursividad.


fun factorial(n:Int):Int{

    return if (n==1) 1 else n * factorial(n-1)
}
fun main(){

    println(factorial(5))
}
Ejercicio 3: Multiplicación Recursiva
Ahora vamos a implementar una función recursiva que multiplique dos números enteros utilizando sumas sucesivas. Este
ejercicio nos ayudará a entender cómo una operación simple puede ser implementada recursivamente.

fun multiplicar(x:Int, y:Int):Int{
    return when{
        y==0 -> 0
        y >0 ->  x + multiplicar(x,y-1)
        else -> -x + multiplicar(x,y+1)

    }
}
fun main(){
    println(multiplicar(3, 4)) // Debería imprimir 12
    println(multiplicar(2, -5)) // Debería imprimir -10
    println(multiplicar(-3, 3)) // Debería imprimir -9
}



fun combinar(longitud:Int,listado:List<String>):List<String>{
    val resultado = mutableListOf<String>()
    //caso base
    if (longitud==1) return listado
    //caso recursivo
    val sublista = combinar(longitud-1,listado)

    for (num in listado){
        for(numCombinado in sublista){
            resultado.add(num + numCombinado)
        }
    }
    return resultado
}
fun main(){
    val listado = listOf("1","2","3")
    val longitud= listado.size
    println("Todas las combinaciones posibles:")

    val resultado = combinar(3,listado)
    for (s in resultado) println(s)

}
Ejercicio 2: Añadir Podas
Ahora, vamos a modificar el ejercicio anterior para incluir una poda que descarte combinaciones específicas. Por
ejemplo, vamos a podar si la suma parcial o total de las cifras es mayor o igual a un límite específico.

 */
fun combinarConPoda(longitud: Int, numeros: List<String>, sumaAcumulada: Int): List<String> {
    val limite = 4 // Si se alcanza el límite, se poda
    val result: MutableList<String> = ArrayList()

    // Caso base
    if (longitud == 1) {
        for (numero in numeros) {
            if (sumaAcumulada + numero.toInt() < limite) {
                result.add(numero)
            }
        }
        return result
    }

    // Caso recursivo
    for (numero in numeros) {
        val nuevaSuma = sumaAcumulada + numero.toInt()
        // Poda: devuelve lista vacía y evita llamada recursiva
        if (nuevaSuma >= limite) return result
        val sublista = combinarConPoda(longitud - 1, numeros, nuevaSuma)
        for (numeroCombinado in sublista) {
            result.add(numero + numeroCombinado)
        }
    }
    return result
}

fun main() {
    val numeros = listOf("1", "2", "3")

    println("Combinaciones de 1, 2 y 3 con longitud 3 y poda si suma >= que el límite")
    val longitud = 3
    val result = combinarConPoda(longitud, numeros, 0)
    for (s in result) {
        println(s)
    }
}
