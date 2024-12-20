package Programacion01.recursividad

/*
Triángulo  de *  con punta hacia abajo con recursividad

Este problema es para resolver claramente con bucles pero no deja de ser interesante hacer una solución recursiva ya
que la recursividad  "se aprecia gráficamente dentro de la figura" y ayuda a razonar la recursividad.

Se trata de prácticar recursidad así que resuelve el problema:

    Imprimiendo secuencialmente asterísco a asterisco con caracter '*'. Sin  ayudarte de String, StringBuider o
    similares.
    Sin usar bucles for o while
    Ademas de enviar la función imprimirT() puedes enviar funciones adicionales que use tu función imprimirT(),
    por ejemplo puedes usar una función que te imprima una linea que podría llamarse imprimirL() o similar.

Por ejemplo:
Prueba

imprimirT(5)
println("-------------------------")
imprimirT(1)
println("-------------------------")
imprimirT(2)
println("-------------------------")


Resultado
*****
****
***
**
*
-------------------------
*
-------------------------
**
*
-------------------------
 */
fun printL(n:Int){ //imprime linea de asteriscos
    if (n==1) {
        print('*')
        println()
        return
    }
    print('*')
    printL(n-1)
}
fun imprimirT(n:Int){ //disminuye el n de asteriscos por linea
    if (n==1) {
        printL(1)
        return
    }
    printL(n)
    imprimirT(n-1)
}
fun main(){
    imprimirT(5)
    println("-------------------------")
    imprimirT(1)
    println("-------------------------")
    imprimirT(2)
    println("-------------------------")
}