package Programacion01
/*

Polisílaba es polisílaba

La palabra "polisílaba" es polisílaba ya que tiene más de tres sílabas. Este curioso fenómeno de una palabra
describiéndose a sí misma también se da en otros vocablos que describen propiedades de las palabras. Por
 ejemplo, tenemos que "esdrújula" es esdrújula y que "llana" es llana.

Si vamos a palabras con más de un significado, el mismo esquema de frase aparentemente tautológica podemos
 tenerlo por ejemplo al afirmar que la naranja es naranja.

Sea como sea, si alguien no sabe el significado de polisílaba o de esdrújula las frases anteriores serán,
efectivamente, simples tautologías vacías de contenido.

Entrada

La entrada comienza con una línea con un número indicando cuántos casos hay que procesar.

Cada caso tiene una frase con el esquema "X es Y" en la que tanto X como Y son palabras sin espacios con
hasta 20 caracteres del alfabeto inglés.

Salida

Por cada caso de prueba se escribirá TAUTOLOGIA si la frase es una tautología (sin distinguir entre
 mayúsculas y minúsculas) y NO TAUTOLOGIA en caso contrario.

Por ejemplo:
Entrada 	                Resultado

3                           TAUTOLOGIA
Polisilaba es polisilaba    TAUTOLOGIA
NARANJA es naranja          NO TAUTOLOGIA
Mandarina es naranja



 */

fun main(){

    var n = readln().toInt()
    for (i in 0..n-1){
        var entrada = readln().split(" ")
        var palabra1 = entrada[0].lowercase()
        var palabra2 = entrada[1].lowercase()
        var palabra3 = entrada[2].lowercase()
    if(palabra1 == palabra3) println("TAUTOLOGIA")
    else println("NO TAUTOLOGIA")
    }

}