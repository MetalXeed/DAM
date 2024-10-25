package Programacion01.bucles

import Programacion01.funciones.readlnToInt
import kotlin.math.absoluteValue

/*
Los saltos de Mario
http://www.aceptaelreto.com/problem/statement.php?id=158
Mario se encuentra ante el castillo final. Puede verlo desde lo alto del muro en el que se encuentra. En breve podrá
entrar en la Cámara de Koopa, enfrentarse (y vencer) al monstruo final y salvar a la princesa.

Sin embargo, tiene ante sí una serie de muros que tendrá que sobrepasar. Para eso, saltará desde el primero de ellos,
donde se encuentra, al siguiente, y desde él al siguiente, y así sucesivamente hasta llegar al último.

La pregunta que nos hacemos es, ¿cuántos de estos saltos serán hacia arriba y cuántos hacia abajo? Mario realiza un
salto hacia arriba cuando tiene que alcanzar un muro que está por encima de él, y hacia abajo cuando tiene que
alcanzar un muro que está por debajo.
Entrada

El primer valor de la entrada es un número que indica la cantidad de casos de prueba a evaluar. Cada caso de prueba
comienza con un entero mayor que cero y no mayor que 109 que indica el número de muros del escenario (recuerda que
Mario se encuentra situado en la parte de arriba del primero). A continuación se proporciona la serie de enteros
que indican la altura de cada uno de ellos.
Salida

Para cada caso de prueba se mostrará una línea en la que aparecerán dos enteros, uno con los saltos hacia arriba y
otro con los saltos hacia abajo, separados por un espacio.

Por ejemplo:
Entrada 	        Resultado

3                   4 2
8                   0 0
1 4 2 2 3 5 3 4     4 0
2
9 9
5
1 2 3 4 5
Respuesta:
 */

fun main() {
    var ncasos = readLine()!!

    var contup = 0 //saltos arriba
    var contdo = 0 //saltos abajo

    if(ncasos != null && ncasos.isNotEmpty()){
        var valores  = ncasos.toInt()
        for (c in 0..valores-1){
        contup = 0
        contdo = 0

        var nmuros = readln().toInt()
        var altura = readln().split(" ").map { it.toInt() }

        for (i in 0..nmuros-2) {
            if (altura[i] < altura[i + 1]) contup+=1
            else if(altura[i] > altura[i + 1]) contdo+=1
        }
        println("$contup $contdo")
    }
}
}
