package Programacion01.bucles
/*

La fiesta aburrida

Tinín es un tipo bastante peculiar. No le gustan nada las fiestas, ni las celebraciones, ni las cenas familiares
 o con amigos. Nada. Es sorprendente que, a pesar de sus pocas ganas de interactuar con gente, haya encontrado
  novia.

Cuando ésta consigue sacarle de casa para llevarle a algún tipo de celebración y la gente le dice "Hombre, Tinín,
 ¡pero si has venido!" él siempre suelta su mítica frase "Yo soy más traído que venido.".

Una de las cosas que más le molesta es tener que ir saludando a todos los presentes,
sobre todo si no le conocen. Eso de que se le acerquen y le digan "Soy Lotario" y que él tenga que saludar no
        lo soporta. ¿Puedes ayudarle?

Entrada

La entrada comienza con un número que indica la cantidad de gente a la que Tinín no conoce en la fiesta en
la que está. A continuación viene una línea por cada una de esas personas en la que se presenta indicando
su nombre: "Soy Lotario". La línea siempre tendrá el mismo formato; una primera palabra "Soy" seguida del
nombre de la persona que será simple (no será un nombre compuesto por varias palabras) y formado por como
mucho 100 letras del alfabeto inglés.

Salida

Para cada persona que se le aproxima, se debe escribir la cadena "Hola, [nombre]."

Por ejemplo:
Entrada 	Resultado

3               Hola, Lotario.
Soy Lotario     Hola, Aldonza.
Soy Aldonza     Hola, Ender.
Soy Ender

 */

fun main() {

    var n = readln().toInt()
    for (i in 0..n-1) {
        var entrada = readln().split(" ")
        var nombre = entrada[1]
        println("Hola, $nombre.")
    }

}