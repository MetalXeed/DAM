package Programacion01.bucles
/*

 Fin de mes

A mí no me asusta el fin del mundo; me asusta el fin de mes, porque no siempre consigo que mis ingresos lleguen
 conmigo. Los gastos se acumulan, y no sé qué más hacer para estirar mi triste sueldo.

Creo que el primer paso para mejorar mi situación es hacer una estimación de lo bien o lo mal que me va a ir
 un mes, en función de los ingresos y los gastos previstos. Sé cuánto dinero tengo en el banco al principio,
  y sé cuánto va a variar. ¿Me ayudas a saber si llegaré a fin de mes con dinero en el banco?

Entrada

La entrada comienza con un número que indica cuántos casos de prueba vendrán a continuación. Cada caso contiene
 dos números, −10.000 ≤ s,c ≤ 10.000 indicando, respectivamente, el saldo en mi cuenta bancaria el primer día
  del mes, y el cambio estimado (ingresos menos gastos) durante el mes.

Salida

Para cada caso de prueba, se escribirá SI si llego a fin de mes con saldo mayor o igual que cero, y NO en otro
caso.

Por ejemplo:
Entrada 	Resultado

4           SI
100 -10     NO
-10 -100    SI
-10 100     NO
100 -1000

 */

fun main(){
    var n = readln().toInt()

    for (i in 0..n-1){
        var entrada = readln().split(" ")
        var sini= entrada[0].toInt()
        var sfin = entrada[1].toInt()

        if (sfin + sini>0) println("SI")
        else println("NO")
    }

}
