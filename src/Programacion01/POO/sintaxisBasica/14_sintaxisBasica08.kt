package Programacion01.POO.sintaxisBasica

/*
Una clase persona con constructor secundario

Para resolver los siguientes tests puede ser útil escribir
un constructor secundario.

Por ejemplo:
Prueba 	Resultado

 val p1 = Persona("Yo", 55)
 println("p1 es " + p1.nombre + " y su edad es " + p1.edad)



p1 es Yo y su edad es 55

val p1=Persona("yo",44)
val p2=Persona(p1) // los valores de p1 se copian en p2
println("p2 es " + p2.nombre + " y su edad es " + p2.edad)



p2 es yo y su edad es 44


class Persona(val nombre:String, val edad:Int){
    constructor(persona: Persona) : this(persona.nombre,persona.edad){
    }
}
fun main(){
    val p1 = Persona("Yo", 55)
    println("p1 es " + p1.nombre + " y su edad es " + p1.edad)

    //val p1=Persona("yo",44)
    val p2=Persona(p1) // los valores de p1 se copian en p2
    println("p2 es " + p2.nombre + " y su edad es " + p2.edad)
}

 */