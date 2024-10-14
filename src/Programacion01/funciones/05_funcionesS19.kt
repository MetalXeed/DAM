package Programacion01.funciones

import kotlin.math.absoluteValue

/*
Escribe un método denominado elZorroEstuvoAqui que le permita al mítico personaje creado en 1919 por Johnston McCulley ir dejando por ahí su "marca".

El método recibirá dos parámetros: un valor entero que indique la altura y un carácter que se utilizará para el relleno, y deberá generar la salida mostrada en los ejemplos.

Valores negativos de la entrada provocarán que la marca se imprima invertida

No se procesarán entradas con alturas inferiores a 4.

Por ejemplo:
Prueba

elZorroEstuvoAqui(5, '#')
println()
elZorroEstuvoAqui(-6, '@')
println()
elZorroEstuvoAqui(-4, '@')

Resultado
###
  #
 #
#
###

@@@@
@
 @
  @
   @
@@@@

@@
@
 @
@@

elZorroEstuvoAqui(0, '@')
elZorroEstuvoAqui(-3, '@')

Respuesta:
 */
fun elZorroEstuvoAqui(num: Int, caracter:Char) {
    var altura = num.absoluteValue
    var ancho = altura - 2
    if (altura<4) return
    if (num <0) {
        for (i in 0..num-1) {
            if(i==0 || i==num-1){
                for (j in 0..ancho-1) {
                    println(caracter)
                }
            }else{
                for (j in 0..ancho-1) {
                    println(caracter)
                }
            }
            for (j in 0..(i - 1)) {
                println(caracter)
            }
        }
    }else{
        for (i in 0..num-1) {
            for (j in 1..(i - 1)) {
                println(caracter)
            }
            print(" ")
            for (j in 1..(altura - i)) {
                println(caracter)
            }
        }
    }
}
fun main(){
    elZorroEstuvoAqui(5, '#')
    println()
    elZorroEstuvoAqui(-6, '@')
    println()
    elZorroEstuvoAqui(-4, '@')
}