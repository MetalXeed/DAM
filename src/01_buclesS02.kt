/*

Sumar n números muchas veces hasta que n es 0

Ejercicio para familizarizarse con el sistema de entrada/salida

Similar a la anterior pero ahora mi programa tiene que ser capaz de responder a múltiples envíos.

De nuevo, si el enunciado no nos explica con detalle como es la entrada y la salida me tengo que
basar en los ejemplos de entrada/salida. En este caso observo que me pueden enviar muchas tandas
de números para sumar. Cada tanda esta compuesta por dos líneas: la primera línea indica el número
de númeos a sumar n y en la segunda vienen los números que hay que sumar. ¿Cuando  paro de leer?
En este ejemplo se establece la convención de que cuando n vale 0 ya no hay que sumar más números

Si el enunciado hiciera muchas descripciones, entonces hay que leerlas con atención pues puede
describir detalles que no se aprecian en los ejemplos de entrada salida.

 */
fun main() {
    var cero = 1
    while (cero != 0) {
        var resultado = 0
        //println("Introduce n de Int a sumar:")
        var n = readln().toInt()//nº de valores
        if (n == 0) break
        //println("Introduce n a sumar separados por espacio:")
        var listan = readln()//listado de nº
        val lista2 = listan.split(" ")

        for (i in 0..(lista2.size-1)){
            resultado = resultado + lista2[i].toInt()
        }
        println(resultado)
    }

}