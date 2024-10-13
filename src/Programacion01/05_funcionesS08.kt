package Programacion01

/*
función readlnToInt()

Escribe la función readlnToInt() que convierte una línea del teclado en un entero. Por supuesto se
asume que la línea que se teclea contiene un entero correcto.

Por ejemplo:
Prueba                              	Entrada 	                    Resultado

println(readlnToInt() + readlnToInt())  2                               5
                                        3
Respuesta:
 */
fun readlnToInt():Int {
    return readln().toInt()

}