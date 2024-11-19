package Programacion01.listas

/*
K recorrer celdas adyacentes

Una necesidad muy habitual para resolver problemas con matrices es recorrer las celdas adyacentes. A las celdas adyacentes también se les llama  vecinas.  El problema a resolver es el que determina para una celda [i][j] quienes son sus vecinas, pero la situación más general es hablar de que una celda tiene 8 posibles celdas vecinas: la de su izquierda, su derecha, la que está arriba,  la de abajo y 4 en diagonal que "limitan" simplemente en un punto pero que a menudo interesa considerar como vecinos.  En el dibujo se aprecian los 8 vecinos de  [i][j]

Pero aun considerando  8 posibles vecinos puede tener menos debido a los límites de la matriz. En el dibujo se aprecian que  [i][j] sólo tiene 5 vecinos

Con estas consideraciones en mente, SE PIDE, escribir la función descrita en los test que suma el valor de sus vecinos

Por ejemplo:
Prueba 	                    Resultado

fun main() {                14
    val matriz = listOf(    6
        listOf(2, 1, 3),    3
        listOf(4, 1, 0),
        listOf(1, 2, 1)
    )

    println(sumarVecinos(matriz, 1, 1))
    println(sumarVecinos(matriz, 0, 0))
    println(sumarVecinos(matriz, 2, 2))
}



 */