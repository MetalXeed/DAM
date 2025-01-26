package Programacion01.POO.sintaxisBasica

/*
Desestructuracion I

para practicar desestructuración

Las clases User y Persona tienen los campos nombre y edad.
Escribe estas clases para que funcionen los tests.

Por ejemplo:
Prueba 	Resultado

fun main() {
    val (nombreP,edadP)= Persona("Yo", 25)

    val (nombreU,edadU) = User("A", 25)
    println("$nombreP $edadP    $nombreU $edadU")
}



Yo 25    A 25

 */

data class Persona(var nombre:String, var edad:Int)

data class User(var nombre:String, var edad:Int){
    override fun toString(): String {
        return "User(nombre=$nombre, edad=$edad)"
    }
}
fun main() {
    val (nombreP,edadP)= Persona("Yo", 25)

    val (nombreU,edadU) = User("A", 25)
    println("$nombreP $edadP    $nombreU $edadU")
}

//solucion de clase
/*
data class Persona(val nombre:String, val edad:Int)
data class User(val nombre: String, val edad: Int)
 */