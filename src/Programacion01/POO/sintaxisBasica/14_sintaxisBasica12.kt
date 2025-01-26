package Programacion01.POO.sintaxisBasica

/*
data class

Las clases User y Persona tienen los campos nombre y edad.
Escribe estas clases para que funcionen los tests.

Por ejemplo:
Prueba 	Resultado

fun main() {
    val p1= Persona("Yo", 25)
    val p2= Persona("Yo", 25)
    println(p1==p2)
    val user1 = User("A", 25)
    val user2 = User("B", 30)
    val user3 = User("A", 25)


    println(user1 == user2)
    println(user1 == user3)

    val user4 = user1.copy()
    println(user4)

    val user5 = user1.copy(edad = 35)
    println(user5)
}



false
false
true
User(nombre=A, edad=25)
User(nombre=A, edad=35)


class Persona(var nombre:String, var edad:Int)

data class User(var nombre:String, var edad:Int){
    override fun toString(): String {
        return "User(nombre=$nombre, edad=$edad)"
    }
}
fun main() {
    val p1= Persona("Yo", 25)
    val p2= Persona("Yo", 25)
    println(p1==p2)
    val user1 = User("A", 25)
    val user2 = User("B", 30)
    val user3 = User("A", 25)


    println(user1 == user2)
    println(user1 == user3)
    println(user1)
    println(user2)
    println(user3)



        val user4 = user1.copy()
        println(user4)

        val user5 = user1.copy(edad = 35)
        println(user5)


}

 */

//Solucion de clase
/*
class Persona(val nombre:String, val edad:Int)
data class User(val nombre: String, val edad: Int)
 */