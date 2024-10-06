/*

Buscar el mayor de 3 números

se aceptan 3 números enteros introducidos por teclado separados entre ellos por un espacio en blanco y:

    muestre el mensaje “3 iguales” si los tres números son iguales

    muestre el mayor de los 3 en caso de que no sean iguales


 */

fun main() {
    val entrada = readln()
    val elementos = entrada.split(" ")
    var primero = elementos[0].toInt()
    var segundo = elementos[1].toInt()
    var tercero = elementos[2].toInt()

    if(((primero == segundo)&&(primero == tercero))) println("3 iguales")
    else if (primero > segundo){
        if (primero > tercero) println(primero)
        else println(tercero)
    }
    else if (primero < segundo){
        if (segundo > tercero) println(segundo)
        else println(tercero)
    }
    else if (tercero > segundo){
        if (tercero > primero) println(tercero)
        else println(primero)
    }

}