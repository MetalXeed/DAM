package Programacion01.POO.basica

/*
K  Punto2D

Crea una clase denominada Punto2D que nos permita definir localizaciones en una espacio bidimensional, es decir, con dos coordenadas (x, y)

Los requerimientos de diseño de dicha clase son los siguientes:

    La construcción de objetos permite crear un objeto:
        con coordenadas (0.0,,0.0) si no se indican valores para x e y
        con los valores  (x, y) indicados
        a partir de los valores (x,y) de  otro objeto Punto2D
    Proporcionará los siguientes métodos:
        flip(), que intercambiará el valor de las coordenadas X e Y del objeto
        dist(Punto2D p), que devolverá la distancia al punto pasado como parámetro, calculada como: raíz cuadrada de ((x2-x1)² + (y2-y1)²)
        manhattanDist(Punto2D p), que devuelve la distancia "Manhattan" al punto pasado como parámetro. Esta distancia se calcula como la longitud del recorrido entre ambos puntos teniendo en cuenta que sólo nos podemos desplazar de forma horizontal y vertical
        slope(Punto2D p), que devolverá la pendiente existente entre el punto actual y el punto pasado como argumento. Dicha pendiente la calcularemos como el cociente de la división de la diferencia de las coordenadas Y entre la diferencia de las coordenadas en X
    La impresión de objetos Punto2D se ajustará al siguiente formato:
        Punto2D[<valor_de_la_coordenada_X>,<valor_de_la_coordenada_Y>]



Por ejemplo:
Prueba 	Resultado

var p = Punto2D()
println(p)

p = Punto2D(3.2, -4.8)
println(p)

val p1 = Punto2D(4.5, 5.5)
val p2 = Punto2D(p1)
println(p2)



Punto2D[0.0,0.0]
Punto2D[3.2,-4.8]
Punto2D[4.5,5.5]

var p = Punto2D()
p.x=5.5
p.y=-2.0
println(p)

p = Punto2D(5.5, -2.0)
println(""+p.x + " " + p.y)

p = Punto2D(3.2, -4.8)
p.flip()
println(p)



Punto2D[5.5,-2.0]
5.5 -2.0
Punto2D[-4.8,3.2]

var p = Punto2D(-3.0, 4.0)
println(p.dist( Punto2D()))
println(p.dist( Punto2D(2.5, 1.5)))

println()
var p1 = Punto2D(-2.0, 3.0)
var p2 = Punto2D(2.0, 1.0)
println(p1.manhattanDist(p2))
println(p2.manhattanDist(p1))

println()
p1 = Punto2D(-2.0, 3.0)
p2 = Punto2D(2.0, 1.0)
println(p1.slope(p2))
p1.y=-1.0
println(p1.slope(p2))



5.0
6.041522986797286

6.0
6.0

-0.5
0.5
 */

import kotlin.math.abs
import kotlin.math.sqrt

class Punto2D(var x:Double = 0.0, var y:Double = 0.0){
    constructor(a:Punto2D):this(x=a.x,y=a.y)
    fun flip(){
        var z:Double = x
        this.x=y
        this.y=z
    }
    fun dist(p:Punto2D):Double{
        return sqrt((this.x - p.x)*(this.x - p.x)+(this.y - p.y)*(this.y - p.y))
    }
    fun manhattanDist(p:Punto2D):Double{
        return (abs(this.x - p.x) + abs(this.y-p.y))
    }
    fun slope(p:Punto2D):Double{
        return((this.y - p.y)/(this.x - p.x))
    }

    override fun toString(): String {
        return "Punto2D[${this.x},${this.y}]"
    }
}
fun main(){
    var p = Punto2D(-3.0, 4.0)
    println(p.dist( Punto2D()))
    println(p.dist( Punto2D(2.5, 1.5)))

    println()
    var p1 = Punto2D(-2.0, 3.0)
    var p2 = Punto2D(2.0, 1.0)
    println(p1.manhattanDist(p2))
    println(p2.manhattanDist(p1))

    println()
    p1 = Punto2D(-2.0, 3.0)
    p2 = Punto2D(2.0, 1.0)
    println(p1.slope(p2))
    p1.y=-1.0
    println(p1.slope(p2))
}
