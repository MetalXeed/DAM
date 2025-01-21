package Programacion01.POO.sintaxisBasica

/*
Clase Coordenadas 6

Queremos seguir practicando el  el uso de this

Ahora escribimos la clase coordenadas añadiendo una funcion
mover(dx.,dy) que desplaza el valor de x sumándole un
desplazamiento dx y análogamente y se desplaza sumando
un valor dy. Todos los valores enteros son válidos.

Por ejemplo:
Prueba 	Resultado

val c1 = Coordenadas(5, 5)
c1.actualizar(10, 20).mover(3, -5)
println("x: ${c1.x}, y: ${c1.y}")

val c2 = Coordenadas(0, 0)
c2.mover(10, 10).actualizar(5, 5)
println("x: ${c2.x}, y: ${c2.y}")



x: 13, y: 15
x: 5, y: 5

 */
class Coordenadas(var x:Int,var y:Int){
    init{
        if (x<0) {
            x=0
        }
        if (y<0){
            y=0
        }
    }
    fun actualizar(x:Int,y:Int):Coordenadas{
        this.x=x
        this.y=y
        return this
    }
    fun mover(x:Int,y:Int):Coordenadas{
        this.x += x
        this.y += y
        return this
    }
}
fun main(){
    val c1 = Coordenadas(5, 5)
    c1.actualizar(10, 20).mover(3, -5)
    println("x: ${c1.x}, y: ${c1.y}")

    val c2 = Coordenadas(0, 0)
    c2.mover(10, 10).actualizar(5, 5)
    println("x: ${c2.x}, y: ${c2.y}")
    }