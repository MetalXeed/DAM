package Programacion01.bucles

/*
Quinto milenio

http://www.aceptaelreto.com/problem/statement.php?id=178

Túker Chiménez ve cosas escondidas en cualquier lado. Una mancha de humedad en la pared se le antoja la cara de
 la anterior propietaria de una casa; el sonido del viento le parece un susurro venido del más allá; una nube
  con forma peculiar le convence de la existencia de vida extraterrestre...

Ahora le ha dado por ver mensajes ocultos en cualquier sitio. Por poner un ejemplo, si lee el siguiente titular:
"El presidente del Gobierno se somete esta noche al escrutinio de varios periodistas en Televisión Española.",
se las ingenia para leer un "te odio" oculto que le mantiene en vela toda la noche:

El presidenTE del Gobierno se sOmete esta noche al escrutinio De varIos periOdistas en Televisión Española.

Ahora quiere automatizar la tarea de la búsqueda de estos mensajes.
Entrada

La entrada comenzará con un entero que indica el número de casos de prueba. Cada uno de ellos está formado por
dos líneas; la primera indica el titular donde buscar un mensaje oculto y la segunda indica el mensaje a buscar.
La longitud de cada una de las cadenas no excederá los 2000 caracteres. Ten en cuenta que no hace falta distinguir
entre mayúsculas y minúsculas y que los espacios del mensaje oculto no son relevantes, es decir, no hace falta
que existan en el mensaje original, pero sí deben aparecer el resto de caracteres (signos de puntuación,
comillas, etc.). Se garantiza que el mensaje oculto a buscar no empieza ni termina por espacios.

La entrada contendrá únicamente letras del alfabeto inglés, por lo que no aparecerán vocales con tilde. Además,
podrían aparecer múltiples espacios consecutivos.
Salida

Para cada caso de prueba el programa escribirá SI si el mensaje buscado aparece en el titular y NO en caso
contrario.

Por ejemplo:
Entrada 	                                        Resultado

4                                                   SI
...dente ...somete ... de varios periodistas ...    SI
te odio.                                            NO
Teo dijo "si".                                      SI
te odio.
Y adios, que ya viene el alba.
te odio.
Teo    subio  al    podio.
te          odio.
Respuesta:
 */
fun main(){
    var ncasos = readLine()!!.toInt()
    var mensaje = readLine()!!.replace(" ","").uppercase().split("").drop(1).dropLast(1)
    var titulo = readLine()!!.replace(" ","").uppercase().split("").drop(1).dropLast(1)
    var resultado = "NO"
    var contador = 0

    for (i in 0..ncasos-1){
        resultado = "NO"
        contador = 0
        for (z in titulo){
            resultado="NO"
            for (y in mensaje){
                resultado="NO"
                contador+=1
                if (y == z) {
                    resultado = "SI"
                    //mensaje=mensaje.subList(contador,mensaje.size)
                    break
                }
            }
            if (resultado=="NO") break
            mensaje=mensaje.subList(contador,mensaje.size)
            contador=0
            println(mensaje)
        }
        println(resultado)
        if(i!=ncasos-1) {
            mensaje = readLine()!!.replace(" ","").uppercase().split("").drop(1).dropLast(1)
            titulo = readLine()!!.replace(" ","").uppercase().split("").drop(1).dropLast(1)
        }
    }
}