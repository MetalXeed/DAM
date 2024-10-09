package Programacion01
/*
Tres veces el diámetro y un poquito más

El 14 de Marzo es el día internacional de PI. Todos sabemos que pi vale 3,14… De ahí la elección del día como
Marzo(mes 3) y día 14. Pero, ¿qué significado tiene realmente este número?

Para que los niños entendieran lo que es pi, un magnífico y genial maestro, un maestro de los de antes, explicaba
 a sus alumnos lo siguiente:
PI es el número 3,141516… pero no lo veas  como un número extraño y caprichoso, es un número que describe que la
 relación entre el perímetro de una circunferencia cualquiera y su radio siempre es la misma. Da igual que la
 circunferencia sea enorme o pequeñísima, si divides el perímetro de la circunferencia entre su  diámetro siempre
  obtendrás la misma cantidad: el número PI.

Y explicaba de nuevo el maestro:
Imagina que rodeas una tapa circular  con un hilo o alambre. Tienes una circunferencia de hilo. Mides su radio r , y
 por lo tanto sabes que su diámetro es 2r. si esa circunferencia de hilo la cortas y a continuación la mides, estas
  midiendo su perímetro, pues bien puedes observar que el perímetro va a ser 3 veces el diámetro y un poquito más.
   Pruebas esto con muchas circunferencias y siempre ocurre los mismo, que el perímetro es “Tres veces el diámetro
   y un poquito más”

Perímetro
—-------- = 3 y un poquito más
diámetro
El poquito más es 0,141516….   y no sabés el trabajo que le dio a matemáticos de todos los tiempos  determinar cada
 vez con más precisión ese poquito más.
Aprovechamos entonces las enseñanzas del sabio maestro y estipulamos el  poquito más(pm) de la siguiente forma:
0.1415<pm<0.1417
y pretendemos saber si dados  dos números  p>0 y d>0,  que representan respectivamente al perímetro y al diámetro
 de una supuesta circunferencia, son valores que pertenecen a una circunferencia aceptable o no según el pm que
  establecimos.
Suponemos a la hora de operar que  usamos el sistema de mayor precisión de coma flotante .

ENTRADA
La entrada comienza con una línea indicando el número de casos que pueden ser 0 o más, a continuación cada caso
 se específica en una línea con dos números  separados por un espacio en blanco. El primer número representa el
  perímetro y el segundo el diámetro.

SALIDA
La salida indicará para cada caso de entrada si p y d pertenecen a una circunferencia  con  la frase ES
CIRCUNFERENCIA, o en caso contrario con la frase PARECE UN HUEVO

Por ejemplo:

Entrada 	        Resultado

4                   ES CIRCUNFERENCIA
31.4169 10.0        PARECE UN HUEVO
31.4169 12          ES CIRCUNFERENCIA
6.2832 2            ES CIRCUNFERENCIA
31.4151 10.0

 */

fun main() {

    var nlineas:Int=0
    var nparam: MutableList<Double> = MutableList(18) { i -> i.toDouble() }
    var entradap:List<String> = List(2) { i -> "$i" }
    var resultado:Double = 0.0

    nlineas=readLine()!!.toInt()        //read n of lines
    for (n in 0..nlineas-1) {     //runs as many times as it was just input

        entradap = readln().split(" ")
        nparam[0] = entradap[0].toDouble()
        nparam[1] = entradap[1].toDouble()
        resultado = nparam[1]*3

        if (nparam[0] in 3.1415*nparam[1]..3.1417*nparam[1]) println("ES CIRCUNFERENCIA")
        else println("PARECE UN HUEVO")
    }

}
