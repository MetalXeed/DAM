package Programacion01
/*

Perimetro de un rectángulo

basado en https://www.aceptaelreto.com/problem/statement.php?id=155

El perímetro de un polígono es la suma de la longitud de todos sus lados. ¿Eres capaz de calcular el perímetro
 de un rectángulo?
Entrada

La entrada consta de una serie de casos de prueba. Cada uno contiene, en una sola línea, la definición de un
 rectángulo. Un rectángulo se especifica proporcionando las coordenadas de la esquina superior derecha. Se
 debe considerar que la esquina inferior izquierda está siempre en el origen de coordenadas, es decir en (0, 0). Se garantiza que la longitud de un lado no superará 108.
Ejemplo de perímetro

El último caso de prueba, que no debe procesarse, contendrá un valor negativo en alguno de los ejes.

El formato de cada línea vamos suponer que siempre es:  entero primera coordenada+ espacio blanco + entero segunda coordenada

Salida

Para cada caso de prueba se escribirá, en una línea independiente, el perímetro del rectángulo.

Por ejemplo:
Entrada 	Resultado

3 2
5 4
-9 3



10
18

 */

fun main(){
    while (true){

        var entrada = readln().split(" ")
        var cordx = entrada[0].toInt()
        var cordy = entrada[1].toInt()
        if (cordx < 0 || cordy < 0) break
        var perimetro = cordx*2 + cordy*2
        println(perimetro)
    }

}