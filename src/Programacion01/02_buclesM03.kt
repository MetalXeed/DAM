package Programacion01

/*

Diamante

Escribir una función diamente()

Es realmente una especie de diamante 2D o rombo

No olvides que se trata de imprimir secuencialmente de caracter en caracter, sin  ayudarte de String,
 StringBuider o similares.

ENTRADA: altura del diamente y caracter de impresión separados por un blanco. La altura será un
númeo n>=0 impar, si n=0 indica fin de entrada.

SALIDA: El diamante con tantas líneas como indica su altura y al final una linea de guiones.

Por ejemplo:
Entrada

5 @
1 #
3 *
7 ♡
0

Resultado

  @
 @@@
@@@@@
 @@@
  @
--------------------------------
#
--------------------------------
 *
***
 *
--------------------------------
   ♡
  ♡♡♡
 ♡♡♡♡♡
♡♡♡♡♡♡♡
 ♡♡♡♡♡
  ♡♡♡
   ♡
--------------------------------

 */

fun main(){
    var entrada:String = "vacio"
    var elementos:List<String>
    var altura:Int = 0
    var silbolo:String = "?"
    do {
        entrada = readln()
        if (entrada == "0") break
        elementos = entrada.split(" ")
        altura = elementos[0].toInt()
        silbolo = elementos[1].toString()

        for (i in 0..altura-1 step 2) { //piramide normal

            for (y in 0..altura -i -2) print(" ")

            for (y in 0..altura*2) print(silbolo)
            println()
        }

        for (i in 0..altura -1 ) { //piramide inversa

            for (y in 0..(altura) -i -2) print(" ")

            for (y in 0..(altura)*2) print(silbolo)
            println()
        }
        println("--------------------------------")
    }while(true)

}