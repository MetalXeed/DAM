package Programacion01.Preparacion01

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


fun main(){
    println(esAnagrama("casa","saca"))
}
fun esAnagrama(palabra1:String,palabra2:String):Boolean{
    var tamano1 = palabra1.length
    var tamano2 = palabra2.length
    var mapa1 = mutableMapOf<Char,Int>()
    var mapa2 = mutableMapOf<Char,Int>()

    if (palabra1 == palabra2) return false
    if (palabra1.length != palabra2.length) return false

    for(i in palabra1){
        mapa1[i] = mapa1.getOrDefault(i, 0) + 1
    }
    for (j in palabra2){
        mapa2[j] = mapa2.getOrDefault(j, 0) + 1
    }
    //return mapa1 == mapa2
    return palabra1.lowercase().toCharArray().sortedArray().contentEquals(palabra2.lowercase().toCharArray().sortedArray())
}