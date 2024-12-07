package Programacion01.recursividad

/*
Jugando al buscaminas

 https://www.aceptaelreto.com/problem/statement.php?id=315



Hoy vamos a jugar al Buscaminas. Seguro que lo conoces. En un tablero dividido en celdas se esconde cierto número de bombas. El objetivo es encontrarlas todas. Para ello hay que destapar todas las celdas que no esconden bombas. Como ayuda, cuando se descubre una celda sin bombas, aparece en ella el número de bombas en las (como mucho) 8 celdas colindantes. Así, si al descubrir una celda aparece un 3 eso significa que de las 8 celdas que hay alrededor 3 de ellas esconden una bomba y 5 no. Cuando se descubre una celda que no tiene bombas alrededor, en vez de un 0 la celda se deja vacía y se descubren de forma automática las 8 celdas colindantes (ahorrando al jugador tener que descubrirlas por sí mismo sin ningún riesgo). Esto provoca que en ocasiones se descubran muchas celdas de golpe. Si se descubre una celda con una bomba, se pierde la partida.

La figura muestra el estado del juego después de haber descubierto consecutivamente las cuatro esquinas del tablero.

Lo que queremos es conocer el estado del juego después de que el jugador haya descubierto una serie de celdas.
Entrada

La entrada constará de una serie de casos de prueba. Cada caso comienza con una línea con los números de filas F y columnas C del tablero (1 ≤ F, C ≤ 50). A continuación aparecen F líneas, cada una con C caracteres: un * significa que en la celda correspondiente se esconde una bomba; las casillas vacías se indican con -. Después aparece el número K de celdas a descubrir, seguido de K líneas que indican las coordenadas de cada celda descubierta: una fila entre 1 y F y una columna entre 1 y C. Pueden intentarse descubrir celdas ya descubiertas anteriormente (quizás de forma automática), en cuyo caso el estado del tablero no cambia. Si al descubrir una celda aparece una bomba, esa será la última celda a descubrir que aparezca en la entrada para ese caso.

Los casos de prueba terminan cuando F y/o C  vale 0.
Salida

Para cada caso de prueba, se escribirá el tablero después de haber descubierto todas las celdas indicadas en la entrada (y las que lo hayan hecho de forma automática). Por cada celda descubierta se escribirá un número indicando el número de bombas que hay alrededor, salvo que este sea 0, que se escribirá -. Las celdas sin descubrir se indicarán con X.

Si durante el juego se ha descubierto una bomba, se escribirá GAME OVER en vez del tablero final.

Por ejemplo:
Entrada


8 8
-*---*--
--------
**------
---*----
---*---*
-*--*---
----*---
--------
4
1 1
1 8
8 8
8 1


Resultado
1XXXXX1-
XXXX111-
XXXX1---
XXXX2-11
XXXX311X
XXXXX211
1112X2--
---1X1--

 */

/*
fun contarBombasAdyacentes(tablero: Array<CharArray>, fila: Int, columna: Int, F: Int, C: Int): Int {
    val direcciones = listOf(
        listOf(-1, -1), listOf(-1, 0), listOf(-1, 1),
        listOf(0, -1), /*CELDA*/ listOf(0, 1),
        listOf(1, -1), listOf(1, 0), listOf(1, 1)
    )
    var contador = 0
    for (dir in direcciones) {
        val nfila = fila + dir[0]
        val ncolumna = columna + dir[1]
        if (nfila in 0 until F && ncolumna in 0 until C && tablero[nfila][ncolumna] == '*') {
            contador++
        }
    }
    return contador
}

fun descubrirCeldas(tablero: Array<CharArray>, descubierto: Array<CharArray>, fila: Int, columna: Int, F: Int, C: Int) {
    if (fila !in 0 until F || columna !in 0 until C || descubierto[fila][columna] != 'X') {
        return
    }
    val bombas = contarBombasAdyacentes(tablero, fila, columna, F, C)
    descubierto[fila][columna] = if (bombas == 0) '-' else bombas.toString()[0]

    if (bombas == 0) {
        val direcciones = listOf(
            listOf(-1, -1), listOf(-1, 0), listOf(-1, 1),
            listOf(0, -1), /*CELDA*/ listOf(0, 1),
            listOf(1, -1), listOf(1, 0), listOf(1, 1)
        )
        for (dir in direcciones) {
            val nfila = fila + dir[0]
            val ncolumna = columna + dir[1]
            descubrirCeldas(tablero, descubierto, nfila, ncolumna, F, C)
        }
    }
}

fun main() {
    var entrada = readLine()
    while (entrada != null && entrada != "0 0") {
        val (F, C) = entrada.split(" ").map { it.toInt() }
        val tablero = Array(F) { readLine()!!.toCharArray() }
        val descubierto = Array(F) { CharArray(C) { 'X' } }

        val K = readLine()!!.toInt()
        var gameOver = false

        for (i in 0 until K) {
            val (fila, columna) = readLine()!!.split(" ").map { it.toInt() - 1 }
            if (tablero[fila][columna] == '*') {
                gameOver = true
                break
            } else {
                descubrirCeldas(tablero, descubierto, fila, columna, F, C)
            }
        }

        if (gameOver) {
            println("GAME OVER")
        } else {
            for (fila in descubierto) {
                println(fila.joinToString(""))
            }
        }

        entrada = readLine()
    }
}
 */