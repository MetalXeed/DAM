package Programacion01.funciones

/*
Si te fijas en la codificación ASCII de las letras, se puede observar cómo la diferencia entre una letra mayúscula y su correspondiente minúscula, está en el bit 6

A   → 6510  → 0b1000001

a   → 9710  → 0b1100001

B   → 6610  → 0b1000010

b   → 9810  → 0b1100010

C   → 6710  → 0b1000011

c   → 9910  → 0b1100011

Escribe un método denominado estático flipChar() que reciba un texto y, usando las operaciones de nivel de bit, devuelva el mismo texto pero con cada carácter invertido al respecto de mayúsculas/minúsculas. El cambio sólo debería afectar a los caracteres alfabéticos (para simplificar, puedes obviar caracteres no presentes en la lengua inglesa: vocales con tilde, ñ, ¿,...)

Para la lógica de inversión de bit lo más fácil es utilizar la operación exor, pero también lo puedes resolver con "apagar y encender un bit". (ver nivel de bit)



Por ejemplo:
Prueba

println(flipChar("En un lugar de la Mancha"))
println(flipChar("El MOS6502 es un microprocesador de 8 bits de 1975"))
println(flipChar("\"Veni, vidi, vici\"; Julius Caesar 47 a.C."))

Resultado
eN UN LUGAR DE LA mANCHA
eL mos6502 ES UN MICROPROCESADOR DE 8 BITS DE 1975
"vENI, VIDI, VICI"; jULIUS cAESAR 47 A.c.

Respuesta:
 */

fun flipChar(frase:String):String{
    var posicion:Int
    var letra:String
    var respuesta:String = ""

    var elementos=frase.split("").drop(1).dropLast(1)
    val alfabeto= ('A'..'Z').joinToString("").split("").drop(1).dropLast(1)
    for (i in elementos){
        posicion = alfabeto.indexOf(i)
        if ((posicion)>alfabeto.size-1){
            var n = (posicion/alfabeto.size)
            posicion -= alfabeto.size*n}

        else if((posicion)<0) {
            var n = (posicion / alfabeto.size)

            if (n > 0) posicion += alfabeto.size * n
            else posicion += alfabeto.size
        }
        if(i in alfabeto) {
            //posicion = alfabeto.indexOf(i)+desp
            respuesta = "$respuesta${alfabeto[posicion]}"
        }
        else respuesta = "$respuesta${i}"
    }

    return respuesta
}

fun main(){
    println(flipChar("En un lugar de la Mancha"))
    println(flipChar("El MOS6502 es un microprocesador de 8 bits de 1975"))
    println(flipChar("\"Veni, vidi, vici\"; Julius Caesar 47 a.C."))
}