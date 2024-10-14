package Programacion01.bucles
/*

Debe resolverse el problema imprimiendo caracter a caracter sin la ayuda de los métodos de la clase String,
StringBuilder etc.

ENTRADA: Una serie de líneas, cada línea especifica l(lado) y c(caracter).   Se garantiza que l es un int y
que l>=2,.

SALIDA:  Queremos dibujar el perímetro (borde) de un cuadrado de lado l y  con caracter de dibujo c.  Para
que el dibujo sea un cuadrado aceptablemente proporcionado los caracteres de la misma linea tiene un espacio
en blanco intercalado.

Por ejemplo:

Entrada

4 =
2 @
6 &

Resultado

= = = =
=     =
=     =
= = = =
--------------------------------
@ @
@ @
--------------------------------
& & & & & &
&         &
&         &
&         &
&         &
& & & & & &

 */

fun main(){
    var lado:Int = 0
    var simbolo:Char = 'A'
    //var entrada:CharArray
    var elementos:CharArray

    do {
        var entrada = readlnOrNull()
        if (entrada.isNullOrBlank()) break
        elementos=entrada.toCharArray()
        //var elementos = entrada.split(" ")
        lado = elementos[0].digitToInt()
        simbolo = elementos[2]

        for (i in 0..lado-1) { //tapa
            if (i==0) print("$simbolo")
            else print(" $simbolo")
        }
        println()
        for (i in 0..lado-3) { //cuerpo
            print(simbolo)
            for (y in 0..lado-3) {
                print("  ")
            }
            println(" $simbolo")

        }
        for (i in 0..lado-1) { //tapa
            if (i==0) print("$simbolo")
            else print(" $simbolo")
        }
        println()
        println("--------------------------------")
    }while(true)
}

/*


fun main(){
    //var entrada
    //var elementos
    var altura:Int = 0
    var silbolo:Char = 'A'
    do {
        var entrada = readlnOrNull()!!.toCharArray()
        if (entrada[0] == '0') break
        //var elementos = entrada.split(" ")
        altura = entrada[0].digitToInt()
        silbolo = entrada[2]
//var test = ((altura/2)-(altura%2))
        for (i in 0..((altura/2))) { //piramide normal

            for (y in 0..(altura/2)-i-1) print(" ")

            for (y in 0..i*2) print(silbolo)
            println()
        }

        for (i in 0..((altura/2)-(altura%2))) { //piramide inversa

            for (y in 0..(i)) print(" ")

            for (y in 0..((altura)-2*i-3)) print(silbolo)
            println()
        }
        println("--------------------------------")
    }while(true)
}

 */