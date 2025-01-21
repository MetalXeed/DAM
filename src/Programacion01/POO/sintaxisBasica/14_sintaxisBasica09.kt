package Programacion01.POO.sintaxisBasica

/*
Clase producto para practicar field y/o back property I

intenta resolver este ejercicio con field y/o backproperty de una propiedad

Por ejemplo:
Prueba 	Resultado

val p=Producto("jamones el chuly",20)
println(p.descrip)
println(p.cantidad)



jamones el chuly
20

val p=Producto("bombones el petardo",15)
println(p.descrip)
p.cantidad=-12
println(p)
p.cantidad=-9
println(p)



bombones el petardo
bombones el petardo 0
bombones el petardo 0

val p=Producto("Calamares PescaNueva",33)
println(p.descrip)
println(p.cantidad)
println(p)



Calamares PescaNueva
33
Calamares PescaNueva 33


class Producto(var descrip:String,var cantidad:Int) {
    override fun toString(): String {
        return descrip + " "  + if(cantidad>0) cantidad else 0
    }
}
fun main(){
    val p=Producto("Calamares PescaNueva",33)
    println(p.descrip)
    println(p.cantidad)
    println(p)
}

 */