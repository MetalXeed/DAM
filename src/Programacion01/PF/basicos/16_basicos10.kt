package Programacion01.PF.basicos

/*
Para practicar la sintaxis de tipos de función.

Completa el tipo de las variables del siguiente código sin modificar las lambda. Envía la fun main() completada.



fun main() {
    val multiplicacion: /* completa el tipo aquí */ = { a, b -> a * b }
    val concatenar: /* completa el tipo aquí */ = { str1, str2 -> str1 + str2 }
    val esMayor: /* completa el tipo aquí */ = { edad1, edad2 -> edad1 > edad2 }

    println(multiplicacion(3, 4))  //
    println(concatenar("Hola", " Mundo"))
    println(esMayor(25, 18))
    println(esMayor(16, 21))
}

Por ejemplo:
Resultado

12
Hola Mundo
true
false

 */

fun main() {
    val multiplicacion: (Int,Int) -> Int = { a, b -> a * b }
    val concatenar: (String,String) -> String = { str1, str2 -> str1 + str2 }
    val esMayor: (Int,Int) -> Boolean = { edad1, edad2 -> edad1 > edad2 }

    println(multiplicacion(3, 4))  //
    println(concatenar("Hola", " Mundo"))
    println(esMayor(25, 18))
    println(esMayor(16, 21))
}