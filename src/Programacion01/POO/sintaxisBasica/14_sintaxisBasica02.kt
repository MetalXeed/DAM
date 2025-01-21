package Programacion01.POO.sintaxisBasica

/*
Clase Coordenadas 2

Queremos practicar el uso de una clase con el constructor primario

Observa los test para escribir la clase correspondiente

    las coordenadas siempre son enteros
    sumar() que devuelve un entero que corresponde la suma de las coordenadas x e y
    sumar(c). c es un objeto coordenadas que se pasa como argumento y la función
    devuelve un nuevo objeto Coordenadas con la suma de las x e y respectivas del
    objeto actual y c

Por ejemplo:
Prueba 	                        Resultado

val c1= Coordenadas(5,5)        7  8
val c2=Coordenadas(2,3)
val c3=c1.sumar(c2)
println("${c3.x}  ${c3.y} ")



class Coordenadas(p:Int,l:Int){
    var x:Int=p
    var y:Int=l
    fun sumar(c:Coordenadas):Coordenadas{
        var z = Coordenadas(0,0)
        z.x = c.x + x
        z.y = c.y + y
        return z
    }
}
fun main(){
    val c1= Coordenadas(5,5)
    val c2= Coordenadas(2,3)
    val c3= c1.sumar(c2)
    println("${c3.x}  ${c3.y} ")
}



 */