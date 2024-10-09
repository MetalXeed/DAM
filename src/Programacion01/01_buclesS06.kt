package Programacion01
/*

El 6 de mayo de 1949, Maurice Wilkes creó el primer programa almacenado en una máquina lo suficientemente potente para
 realizar cálculos matemáticos de forma práctica. Esta máquina, llamada EDSAC, calculó e imprimió la tabla de cuadrados
  de los primeros 100 números (0-99) mostrada a continuación:

Haz un programa que genere la misma salida que el programa de Wilkes.

Fíjate que cada resultado está formateado a cuatro dígitos y la separación entre columnas es de dos espacios.

Por ejemplo:
Resultado

0000  0001  0004  0009  0016  0025  0036  0049  0064  0081
0100  0121  0144  0169  0196  0225  0256  0289  0324  0361
0400  0441  0484  0529  0576  0625  0676  0729  0784  0841
0900  0961  1024  1089  1156  1225  1296  1369  1444  1521
1600  1681  1764  1849  1936  2025  2116  2209  2304  2401
2500  2601  2704  2809  2916  3025  3136  3249  3364  3481
3600  3721  3844  3969  4096  4225  4356  4489  4624  4761
4900  5041  5184  5329  5476  5625  5776  5929  6084  6241
6400  6561  6724  6889  7056  7225  7396  7569  7744  7921
8100  8281  8464  8649  8836  9025  9216  9409  9604  9801

 */

fun main(){
    var lnumeros= List(100){i -> i*i}
    for (i in lnumeros.indices){
        if (i%10 ==0 && i>0) println()
        print("${lnumeros[i].toString().padStart(4,'0')}  ")

    }
}