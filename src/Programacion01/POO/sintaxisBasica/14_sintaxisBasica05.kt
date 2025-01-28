package Programacion01.POO.sintaxisBasica

/*
Clase Coordenadas 5

Queremos practicar el uso de this

Para eso escribimos una función actualizar(x,y) que las
coordenadas x, y. Si  el valor de actualización es  negativo
le da el valor 0

A la hora de escribir la función actualizar fuerza a que los
parámetros de actualizar se llamen x,y igual que las
propiedades de la clase

Observa los test para escribir la clase correspondiente

Por ejemplo:
Prueba 	                        Resultado

 val c1 = Coordenadas(5, 5)     7  0
 val c2 = Coordenadas(10,10)    0  90

 c1.actualizar(7, -3)
 c2.actualizar(-1, 90)

 println("${c1.x}  ${c1.y} ")
 println("${c2.x}  ${c2.y} ")


class Coordenadas(var x:Int,var y:Int){
    init{
        if (x<0) {
            x=0
        }
        if (y<0){
            y=0
        }
    }
    fun actualizar(x:Int,y:Int){
        if (x<0){
            this.x=0
            this.y=y
        }
        if (y<0){
            this.x=x
            this.y=0
        }
    }

}
fun main(){
    val c1 = Coordenadas(5, 5)
    val c2 = Coordenadas(10,10)

    c1.actualizar(7, -3)
    c2.actualizar(-1, 90)

    println("${c1.x}  ${c1.y} ")
    println("${c2.x}  ${c2.y} ")
}

 */

//solucion de clase
/*
class Coordenadas(var x: Int, var y: Int) {

    fun actualizar(x: Int, y: Int) {
        this.x = if (x < 0) 0 else x
        this.y = if (y < 0) 0 else y
    }
}
 */