package Programacion01.bucles
/*

Contando en la arena

http://www.aceptaelreto.com/problem/statement.php?id=369

Es ampliamente conocido que escribimos los números utilizando base 10, en la que expresamos las cantidades
 utilizando 10 dígitos distintos (0…9). El valor de cada uno de ellos depende de la posición que ocupe dentro
  del número, pues cada dígito se multiplica por una potencia de 10 distinta según cuál sea esa posición.

La descomposición, por ejemplo, del número 1.234 es:

1.234 = 1×103 + 2×102 + 3×101 + 4×100

Otra base muy conocida es la base 2 al ser la utilizada por los dispositivos electrónicos. En ella sólo hay
 dos dígitos distintos (0 y 1), que se ven multiplicados por potencias de 2.

Mucho antes de que llegaran la base 2, la base 10 e incluso los números romanos, los primeros seres humanos
 contaban haciendo surcos en la arena, muescas en un trozo de madera o colocando palos en línea. Estaban,
  sin saberlo, usando base 1. En ella sólo hay un símbolo y cada dígito es multiplicado por una potencia de 1.
   Dado que 1n = 1 el resultado es que todos los dígitos tienen el mismo peso.
Entrada

La entrada estará compuesta por distintos números mayores que 0 y que nunca serán mayores que 1.000, cada
 uno en una línea.

La entrada termina con un 0, que no debe procesarse.
Salida

Para cada número se debe escribir, en una línea independiente, su codificación en base 1.

Por ejemplo:
Entrada 	Resultado

1           1
4           1111
6           111111
0

 */

fun main(){
    var n=1
    do{
        var entrada = readlnOrNull()
        if (entrada==null) break
        n = entrada!!.toInt()
        if (n > 0) {
            for (i in 0..n - 1) print(1)
        }
        println()
    }while(true)
}