package Programacion01.POO.sintaxisBasica
/*
Queremos practicar el uso de una clase con el constructor
primario y valores por defecto

Observa los test para escribir la clase correspondiente

Por ejemplo:
Prueba 	                        Resultado

val c1= Coordenadas(5,5)        5  5
val c2=Coordenadas(9)           9  77
val c3=Coordenadas()            88  77
println("${c1.x}  ${c1.y} ")
println("${c2.x}  ${c2.y} ")
println("${c3.x}  ${c3.y} ")

class Coordenadas(){
    var x:Int=88
    var y:Int=77
    constructor(p:Int,l:Int) : this() {
        this.x=p
        this.y=l
    }
    constructor(p:Int) : this() {
        this.x=p
    }
}
fun main(){
    val c1= Coordenadas(5,5)
    val c2=Coordenadas(9)
    val c3=Coordenadas()
    println("${c1.x}  ${c1.y} ")
    println("${c2.x}  ${c2.y} ")
    println("${c3.x}  ${c3.y} ")
}
 */