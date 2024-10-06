/*

Practicando entrada por fin de fichero

Ejercicio para familizarizarse con el sistema de entrada/salida

Utiliza readlnOrNull() para resolver el ejercicio

Se introducen por teclado una serie de palabras y al terminar de teclear se indica al usuario las cantidad
 de palabras introducidas.

Entendemos por palabra un conjunto de 1 o más caracteres. Los delimitadores de palabras  para simplificar
 serán siempre exactamente un espacio en blanco.

Observa que como no se indica cuando acaban los casos de prueba, se asume que es cuando se encuentra la
 marca de fin de fichero

 */
fun main() {
    var frase = readlnOrNull() // frase a introducir por standard In
    var palabra = "test"
    var npalabra = 0
    while (frase!=null) {

        val listaPalabras = frase.split(" ")
        for (i in 0..listaPalabras.size-1) {
            palabra = listaPalabras[i]
            if (palabra  != "") {
                npalabra++
                //println("$npalabra")
            }
            else continue
            //println(npalabra)
        }

        frase = readlnOrNull()
    }
    println(npalabra)
}
