package Programacion01.PF.basicos

/*
Una de tail recursion

Si  utilizas  esta función recursiva

fun multiplicar(a: Int, b: Int): Int {
     return if (b == 1) a else a + multiplicar(a, b - 1)
}

el segundo test provoca desbordamiento ya que se generan 100000 entradas en la pila

SE PIDE: que envies una versión tailrec de la función anterior para comprobar que no da stackoverflow

Por ejemplo:
Prueba 	Resultado

println(multiplicar(100000,2))



200000

println(multiplicar(2,100000))



200000

 */