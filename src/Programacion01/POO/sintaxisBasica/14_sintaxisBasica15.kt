package Programacion01.POO.sintaxisBasica

/*
Desestructuracion III

Escribe la función calcularEstadísticas

Puedes usar las funciones de listas min(), max() y average() para simplificar

Por ejemplo:
Prueba 	Resultado

fun main() {
    var numeros = listOf(10, 20, 30, 40, 50)
    var (menor, mayor, media) = calcularEstadisticas(numeros)
    println("Menor: $menor, Mayor: $mayor, Media: $media")
    numeros= listOf(10,9,8,7,6,5,4,3,2,1)

    //(menor, mayor, media) = calcularEstadisticas(numeros)     //no es posible
    var (menor2, mayor2, media2) = calcularEstadisticas(numeros)
    println("Menor: $menor2, Mayor: $mayor2, Media: $media2")
}

Menor: 10.0, Mayor: 50.0, Media: 30.0
Menor: 1.0, Mayor: 10.0, Media: 5.5

 */

fun calcularEstadisticas(numeros: List<Int>): Triple<Double, Double, Double> {
    val menor = numeros.min()*1.0
    val mayor = numeros.max()*1.0
    val media = numeros.average()*1.0
    return Triple(menor, mayor, media)
}

fun main() {
    var numeros = listOf(10, 20, 30, 40, 50)
    var (menor, mayor, media) = calcularEstadisticas(numeros)
    println("Menor: $menor, Mayor: $mayor, Media: $media")
    numeros= listOf(10,9,8,7,6,5,4,3,2,1)

    //(menor, mayor, media) = calcularEstadisticas(numeros)     //no es posible
    var (menor2, mayor2, media2) = calcularEstadisticas(numeros)
    println("Menor: $menor2, Mayor: $mayor2, Media: $media2")
}