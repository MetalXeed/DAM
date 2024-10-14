package Programacion01.funciones

/*
Rutacorrecta

Almaceno rutas en función de norte(N), sur(S), este(E) y oeste(O). Cada letra significa que hay que avanzar x metros en esa dirección.

Pero no nos importa ahora como se avanza en una ruta si no simplemente comprobar que todas las letras que describen una ruta son correctas, es decir, son N,S,E o O. Una  ruta correcta es  un conjunto de esas 4 letras y espacios en blanco que separan dichas letras.

Se pide que escribas la función esCorrecta() que describe el test.

Por ejemplo:
Prueba

 val listaRutas = listOf("S    O S O", "S O N", "S A N S O N", "E S   H O", "E N I S O")
 for (ruta in listaRutas) {
      println(if(esCorrecta(ruta)) "CORRECTA" else "INCORRECTA")
 }

Resultado

CORRECTA
CORRECTA
INCORRECTA
INCORRECTA
INCORRECTA

Respuesta:
 */
fun esCorrecta(lista:String):Boolean{
    var correcto:Boolean =true
    var elementos=lista.split(" ")
    val coordenadas = listOf("N","S","E","O"," ","")

    for (i in elementos) {
        if(coordenadas.contains(i) ){}
        else correcto = false
    }
    return correcto
}

fun main() {
    val listaRutas = listOf("S    O S O", "S O N", "S A N S O N", "E S   H O", "E N I S O")
    for (ruta in listaRutas) {
        println(if(esCorrecta(ruta)) "CORRECTA" else "INCORRECTA")
    }
}