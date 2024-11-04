package Programacion01.listas

/*
Calculo de la mediana

https://www.aceptaelreto.com/pub/problems/v001/61/st/statements/Spanish/index.html



Dado un conjunto (o muestra) de valores positivos ordenados, se define la mediana como el valor que ocupa la posición
central de los datos dados:

En el caso de tener un número impar de valores, la mediana está clara: será aquel valor que tenga el mismo número de
valores más pequeños y más grandes que él en la muestra. En el caso de tener un número par de valores, habría dos
candidatos a ser mediana. En vez de decidirnos por uno, en este caso la mediana viene dada por la media aritmética
de esos dos valores que ocupan las posiciones centrales.

Dada una colección de números positivos, nos piden calcular la mediana. Para evitar tener que trabajar con números
decimales en algunos casos, habrá que calcular su doble.
Entrada

La entrada consta de una serie de casos de prueba. Cada uno comienza con un número, menor o igual que 25.000, que
indica la cantidad de valores que tiene la muestra. A continuación se dan los valores de la muestra, todos números
enteros positivos, de los que habrá que calcular la mediana multiplicada por dos.

La entrada terminará con una serie de 0 valores.
Salida

Para cada caso de prueba se mostrará el doble de la mediana de los valores dados.


Por ejemplo:
Entrada                         	Resultado

11                                  44
1 2 6 17 18 22 35 46 109 153 200    6
5                                   9
5 3 1 2 8
4
4 5 9 2
0
 */

fun main(){
    var ncifras = readLine()!!.toInt()
    var entradas:List<Int> = listOf(0)
    var centro =0
    while (ncifras != 0) {

            centro =0
            entradas= readLine()!!.split(" ").map { it.toInt() }
            centro =ncifras/2
            println(centro)
            println(entradas[centro])

        if (ncifras%2==1){
            println(entradas[centro]*2)
        }else{
            println( ((entradas[centro-1])+(entradas[centro+1])))
        }
        ncifras = readLine()!!.toInt()
    }
}