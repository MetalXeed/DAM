package Programacion01.POO.sintaxisBasica

/*
Clase Coordenadas 1

Queremos practicar el uso de una clase con el constructor predeterminado, definción
 de propiedades y funciones miembros

Escribe una clase que encapsule las típicas coordenadas x y  en un objeto.
Las coordenadas siempre son enteras.

Observa los test para escribir la clase correspondiente y ten en cuenta que:

    sumar()  devuelve la suma de las coordenadas x e y
    dividir()  devuelve la división de las coordenadas x e y
    intercambiar() devuelve una nueva coordenada  con   los valores x e y
    intercambiados

Por ejemplo:
Prueba 	Resultado

val c = Coordenadas()
println("(" + c.x + "," + c.y + ")")
c.x = 3
c.y = 8
println("(" + c.x + "," + c.y + ")")

(0,0)
(3,8)

val c = Coordenadas()
c.x = 5
c.y = 5
println(c.sumar())
c.x = 10
c.y = 8
println(c.dividir())
val c2=c.intercambiar()
println("${c.x}  ${c.y}  ${c2.x}  ${c2.y} ")

10
1.25
10  8  8  10



class Coordenadas(){
    var x:Int=0
    var y:Int=0
    fun sumar():Int{
        return x+y
    }
    fun dividir():Double{
        return x.toDouble()/y.toDouble()
    }
    fun intercambiar():Coordenadas{
        var a = Coordenadas()
        var z = x
        a.x=y
        a.y=z
        return a
    }
}
fun main(){
    val c = Coordenadas()
    println("(" + c.x + "," + c.y + ")")
    c.x = 3
    c.y = 8
    println("(" + c.x + "," + c.y + ")")
    c.x = 5
    c.y = 5
    println(c.sumar())
    c.x = 10
    c.y = 8
    println(c.dividir())
    val c2=c.intercambiar()
    println("${c.x}  ${c.y}  ${c2.x}  ${c2.y} ")
}

 */