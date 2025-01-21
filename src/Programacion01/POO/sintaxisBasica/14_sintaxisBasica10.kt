package Programacion01.POO.sintaxisBasica

/*
Clase producto  para practicar field y/o back property II

intenta resolver este ejercicio con field y/o backproperty

Por ejemplo:
Prueba 	Resultado

val p=Producto("jamones el chuly",20)
println(p.descrip)
println(p.cantidad)



JAMONES EL CHULY
20

val p=Producto("bombones el petardo",15)
println(p.descrip)
p.cantidad=-12
println(p)
p.cantidad=-9
println(p)



BOMBONES EL PETARDO
bombones el petardo 0
bombones el petardo 0

val p=Producto("Calamares PescaNueva",33)
println(p.descrip)
println(p.cantidad)
println(p)



CALAMARES PESCANUEVA
33
Calamares PescaNueva 33

 */
class Producto(var descripcion:String,var cantidadIni:Int) {
    var descrip: String = descripcion
        get() = field.uppercase()
        private set
    var cantidad: Int = cantidadIni
        get() = if (field < 0) 0 else field // Si la cantidad es negativa, devuelve 0
        set(value) {
            field = if (value < 0) 0 else value
        } // Si el valor es negativo, establece 0

    override fun toString(): String {
        return "$descripcion ${cantidad}"
    }
}
fun main(){
    val p=Producto("bombones el petardo",15)
    println(p.descrip)
    p.cantidad=-12
    println(p)
    p.cantidad=-9
    println(p)
}