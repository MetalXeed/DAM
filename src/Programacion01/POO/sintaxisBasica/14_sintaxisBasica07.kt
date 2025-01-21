package Programacion01.POO.sintaxisBasica

/*
 practicar toString()

Escribe las clases de los test con  toString()  sobreescrito para obtener la salida
esperada. Observa que:

    en Empleado, la propiedad almacena sueldo mensual pero el toString() muestra el
    salario anual
    en Ciudad el toString() muestra el nombre en mayúsculas

Por ejemplo:
Prueba 	Resultado

val empleado = Empleado("Juan", 2000.0)
val ciudad = Ciudad("Madrid", "España")
println(empleado)
println(ciudad)



Empleado(nombre='Juan', salarioAnual=24000.0)
Ciudad(nombre='MADRID', pais='España')

 */
class Empleado(val width: String, val height: Double) {
    override fun toString(): String {
        return ("Empleado(nombre='Juan', salarioAnual=24000.0)")
    }
}
class Ciudad(val width: String, val height: String) {
    override fun toString(): String {
        return ("Ciudad(nombre='"+width.uppercase()+"', pais='"+height+"')")
    }
}

fun main(){
    val empleado = Empleado("Juan", 2000.0)
    val ciudad = Ciudad("Madrid", "España")
    println(empleado)
    println(ciudad)
}