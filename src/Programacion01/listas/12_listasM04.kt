package Programacion01.listas

/*
Doblando un papel

(En kotlin)

Hay distintos tipos de simetrías,   la simetría respecto a una recta o simetría axial quizá sea la más conocida
y es la que vamos a usar en este problema.

Decimos que una figura es simétrica respecto a una recta cuando cada punto a un lado de esa recta tiene otro punto
al otro lado y a la misma distancia de esa recta.

Si queremos saber si una imagen presenta simetría respecto a una recta y la tenemos en una hoja de papel solo
tenemos que doblarla por la recta. Si al doblar la hoja las figuras coinciden es que son simétricas respecto a
esa recta. Si no coinciden, no lo son. La recta para establecer la simetría puede ser vertical, horizontal o
diagonal con cualquier inclinación. En este problema usaremos una recta vertical.

Pero nosotros lo haremos con matrices de caracteres .... Escribe las funciones que necesitan los test
siguientes..

Por ejemplo:
Prueba

fun main() {
    var original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', '*', '*')
    )
    imprimirFiguras(original, getSimetrica(original))

    original = arrayOf(
        charArrayOf(' ', '*',' ',' '),
        charArrayOf('*', '*','*','*'),
        charArrayOf(' ', '*',' ',' ')
    )
    imprimirFiguras(original, getSimetrica(original))
    original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', '*'),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', ' '),
    )
    imprimirFiguras(original, getSimetrica(original))
}

Resultado
*         *
* *     * *
* * * * * *

  *         *
* * * * * * * *
  *         *

*         *
* *     * *
*   * *   *
* *     * *
*         *
 */

fun imprimirFiguras(figura:Array<CharArray>,simetrica: Array<CharArray>){
    var filas     = figura.size
    var columnas  = figura[0].size
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${figura[i][j]} ")

        }

        for (j in 0 until columnas) {
            print("${simetrica[i][j]} ")
        }
        println()
    }
    println()
}
fun getSimetrica(figura:Array<CharArray> ):Array<CharArray>{
    var filas     = figura.size
    var columnas  = figura[0].size
    var simetrica = Array(filas) { CharArray(columnas) }

    for (i in figura.indices){
        for (j in figura[0].indices){
            simetrica[i][j]=figura[i][columnas-j-1]
        }
    }
    return simetrica
}

fun main() {
    var original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', '*', '*')
    )
    imprimirFiguras(original, getSimetrica(original))

    original = arrayOf(
        charArrayOf(' ', '*',' ',' '),
        charArrayOf('*', '*','*','*'),
        charArrayOf(' ', '*',' ',' ')
    )
    imprimirFiguras(original, getSimetrica(original))
    original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', '*'),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', ' '),
    )
    imprimirFiguras(original, getSimetrica(original))
}