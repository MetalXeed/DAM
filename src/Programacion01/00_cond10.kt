package Programacion01
/*

calcular letra DNI

Haz un programa para calcular la letra del DNI. Solicitará al usuario la introducción del número de DNI. Se comprobará
 que es de 8 dígitos, mostrando el mensaje "DNI no válido" en caso de que no lo sea (ten en cuenta que pueden existir
 números deDNI que empiecen con 0)

PISTA:

El cálculo se hace de la forma siguiente: dividimos el número del DNI entre 23 y nos quedamos con el resto, que estará
 entre 0 y 22. Ese valor lo usaremos para obtener la letra a partir de la siguiente tabla:

 T R W A G M Y F P D X  B  N  J  Z  S  Q  V  H  L  C  K  E
 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22

ENTRADA: Un número entero que representa un DNI sin letra.

SALIDA: La letra.

Entrada 	Resultado

12345678    Z

1234        DNI no válido

 */

fun main() {
    var nletra:Int
    var regla = "TRWAGMYFPDXBNJZSQVHLCKE"
    val dni = readln().toInt()

    if (dni.toString().length==8) {
        nletra=dni%23
        println(regla[nletra])
    }else println("DNI no válido")
}