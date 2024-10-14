package Programacion01.funciones

/*
Escribir un método que imita al indexOf de forma que se le pasa un string y un caracter y devuelve el índice de la
               primera ocurrencia de  dicho caracter o bien -1 si el caracter no tiene está en el string.

Evidentemente se pretende que resuelvas el problema procesando el String en un bucle, ¡sin usar el método indexOf()!

El método se llamará  myIndexOf() y su funcionamiento se ejemplifica a continuación. El método debes definirlo como
      static.



Por ejemplo:
Prueba                              	Resultado

println(myIndexOf("hola a todos",'s'))  11
println(myIndexOf("hola a todos",' '))  4
println(myIndexOf("hola a todos",'H'))  -1
println(myIndexOf("hola a todos",'a'))  3
println(myIndexOf("DAM",'M'))           2
println(myIndexOf("1234",'4'))          3

Respuesta:
 */
fun myIndexOf(a: String, b: Char): Int {
    val elementos = a.split("")
    for (i in 0..elementos.size-1) {
        if (elementos[i] == b.toString()) return i-1
    }
    return -1
}
fun main(){
    println(myIndexOf("hola a todos",'s'))
    println(myIndexOf("hola a todos",' '))
    println(myIndexOf("hola a todos",'H'))
    println(myIndexOf("hola a todos",'a'))
    println(myIndexOf("DAM",'M'))
    println(myIndexOf("1234",'4'))
}