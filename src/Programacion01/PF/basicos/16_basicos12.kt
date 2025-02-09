package Programacion01.PF.basicos

/*
Modificación de variables externas a lambda

Recuerda el concepto de closure y escribe la lambda para demostrar que puede cambiar el valor de
la variable mensaje

fun main() {
    var mensaje = "Hola"
    val cambiarMensaje: (String) -> String = {
           //escribir lambda
    }

    println(cambiarMensaje("Mundo"))
    println(mensaje)
}

Por ejemplo:
Resultado

Mundo
Mundo

 */

fun main() {
    var mensaje = "Hola"
    val cambiarMensaje: (String) -> String = {
        nuevoMensaje ->
        mensaje = nuevoMensaje
        mensaje
    }

    println(cambiarMensaje("Mundo"))
    println(mensaje)
}