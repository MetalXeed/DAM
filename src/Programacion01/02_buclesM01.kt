package Programacion01
/*

Triángulo  de *  con punta hacia abajo

No olvides que se trata de imprimir secuencialmente asterísco a asterisco. Sin  ayudarte de String,
StringBuider o similares.

ENTRADA: altura de un triángulo, un número entero n>=0. Si n=0 finaliza la entrada.

SALIDA: triángulos de la altura indicada. Despues de imprimir cada triángulo observa en los ejemplos que
hay una linea de guiones

Por ejemplo:
Entrada 	Resultado

5           *****
1            ****
2             ***
0              **
                *
            --------------------------------
                *
            --------------------------------
               **
                *
            --------------------------------

 */
fun main() {
    do {
        var entrada = readln().toInt()
        if (entrada == 0) break
        for (i in 0..entrada - 1) {
            for (y in 0..i - 1) print(" ")
            for (y in 0..entrada - i - 1) print("*")
            println()
        }
        println("--------------------------------")
    }while(true)
}