package Programacion01.POO.sintaxisBasica

/*
Clase Coordenadas 4

Queremos practicar el uso de una clase con  bloque init de
forma que si se detecta una coordenada negativa la convierte
en  0

Observa los test para escribir la clase correspondiente

Por ejemplo:
val c1= Coordenadas(5,-10)
val c2=Coordenadas(-9)
val c3=Coordenadas()
println("${c1.x}  ${c1.y} ")
println("${c2.x}  ${c2.y} ")
println("${c3.x}  ${c3.y} ")

5  0
0  77
88  77



class Coordenadas(var x:Int,var y:Int){
    init{
        if (x<0) {
            x=0
        }
        if (y<0){
            y=0
        }
    }

    constructor(x:Int): this(x,0) {
        if (x<0){
            this.x=0
            this.y=77
        }
    }
    constructor(): this(88, 77) {
    }
}
fun main(){
    val c1= Coordenadas(5,-10)
    val c2=Coordenadas(-9)
    val c3=Coordenadas()
    println("${c1.x}  ${c1.y} ")
    println("${c2.x}  ${c2.y} ")
    println("${c3.x}  ${c3.y} ")
}

 */

//solucion de clase
/*
class Coordenadas(var x:Int=88,var y:Int=77){
    init{
        if(x<0) x=0
        if(y<0) y=0
    }
}
 */