package Programacion01.PF.basicos

/*
La funcion infija saludarA

Una funcion miembro saludarA() de la clase Persona es capaz de funcionar de forma infija como indica el test

Por ejemplo:
Prueba 	Resultado

val juan = Persona("Juan")
val maria = Persona("Maria")
juan.saludarA(maria)
juan saludarA maria



Hola Maria, soy Juan.
Hola Maria, soy Juan.

 */
class Persona(var nombre:String=""){
    infix fun saludarA(p:Persona){
        println("Hola ${p.nombre}, soy ${this.nombre}.")
    }
}
fun main(){
    val juan = Persona("Juan")
    val maria = Persona("Maria")
    juan.saludarA(maria)
    juan saludarA maria
}
/*
Clase
class Persona(val nombre:String){
    infix fun saludarA(otra:Persona) = println("Hola " + otra.nombre+", soy " + this.nombre+".")
}
 */