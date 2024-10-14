package Programacion01.bucles
/*
Piramide con * con punta hacia arriba.

Es realmente una especie de pirámide 2D o triángulo.

No olvides que se trata de imprimir secuencialmente asterísco a asterisco. Sin  ayudarte de String,
StringBuider o similares.

ENTRADA: altura de la pirámide, un número entero n>=0. Si n=0 finaliza la entrada.

SALIDA: pirámides de la la altura indicada. Despues de imprimir cada triángulo observa en los
ejemplos que hay una linea de guiones.  Observa en el ejemplo que para dibujar una figura como
a anterior cada nueva fila incrementa/decrementa 2 asteriscos respecto a la fila anterior. Por lo
tanto, todas las líneas tienen un número impar de asteriscos.



Por ejemplo:
Entrada
5
1
2
0

Resultado
    *
   ***
  *****
 *******
*********
--------------------------------
*
--------------------------------
 *
***
--------------------------------

 */

fun main() {
    do {
        var entrada = readln().toInt()
        if (entrada == 0) break

        for (i in 0..entrada - 1) {
            for (y in 0..entrada - i-2) print(" ")
            for (y in 0..i*2) print("*")
            println()
        }
        println("--------------------------------")
    }while(true)
}