package Programacion01.condicionales
/*

Clasificar puntuaciones

Se quiere clasificar puntuaciones de 0 a 100 según la siguiente tabla
A 	de 90 a 100
B 	de 80 hasta 90
C 	de 70 hasta 80
D 	de 0 hasta 70
X 	cualquier otro entero como 101 o -3


 Entrada 	Resultado

79          La calificación es C

110         La calificación es X


 */

fun main(){

    val puntuacion = readln().toInt()
    when(puntuacion){
        in 0..70 -> println("La calificación es D")
        in 70..80 -> println("La calificación es C")
        in 80..90 -> println("La calificación es B")
        in 90..100 -> println("La calificación es A")
        else  -> println("La calificación es X")
    }
}
