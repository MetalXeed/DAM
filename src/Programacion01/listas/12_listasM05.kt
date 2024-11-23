package Programacion01.listas

/*
 I love you, Baby

En el contexto de los sistemas Unix/Linux  un "banner" puede referirse a un mensaje o diseño en modo de texto. En lugar de ser gráficos elaborados, estos banners de texto suelen ser representaciones artísticas o mensajes en ASCII que se muestran en la terminal por ejemplo antes de que un usuario inicie sesión.

Hoy en día los banner tienen un halo "retro" y molan tanto que  incluso hay un comando linux para generarlos

Ahora que ya sabemos lo que es un banner vamos a  lo realmente importante.  Winchi es un programador de lo más enamoradizo. Trabaja en  una empresa de software gigante en la que no paran de entrar y salir emplead@s y ...  chica que llega, chica de la que se enamora. No lo puede evitar y  tiene que declararse o enferma. Sabe  que a las chicas programadoras les va el retro y al muy pillín se le ocurrió enviar  a la chica pretendida un mensaje de amor en formato banner. Ya pensará como hacerselo llegar,  en papel , con sorprendente script, ...., se verá.

Con tanto amor que viene y va, se propone  hacer un generador automático  de banners  para hacer pruebas y decidirse por el banner final.

En el banner,  cada letra  se representa en una matriz de 5x5. Para simplificar usaremos sólo las letras A-Z (sin ñ) y a  mayores los caracteres espacio en blanco ,  guión y coma.

 Ejemplos de letras en matriz, utilizando el caracter  @

A @ 	@ 	@ 	@
@ 	  	  	@
@ 	@ 	@ 	@
@ 	  	  	@
@ 	  	  	@

M @ 	  	  	  	@
@ 	@ 	  	@ 	@
@ 	  	@ 	  	@
@ 	  	  	  	@
@ 	  	  	  	@

Observa que la letra A, sólo ocupa 4 columnas y se le añade una  última columna a blancos para que todas las
matrices sean de 5x5. Vamos a ayudar a hacer el programa a Winchi, pero no tienes que preocuparte por las matrices
de letras que las hizo Winchi el fin de semana.  Las matrices están dentro de una clase llamada ABC directamente
disponibles en esta pregunta.. Podemos acceder a las matrices:

    a la letra A con ABC.A
    a la letra B con ABC.B
    .........
    a la letra Z con ABC.Z
    la coma ',' con ABC.COMA
    la exclamación de cierre '!' con ABC.EXCLAMACION
    al espacio en blanco con ABC.BLANCO
    al guión con ABC.GUION

Puedes visualizar si lo deseas las matrices que usa la pregunta consultando su código

ENTRADA:
En la primera línea un mensaje de amor
En la segunda línea el nombre de la amada.
Se puede indicar indiferentemente el texto en mayúsculas o minúsculas, la letra siempre se traduce a la misma
matriz de caracteres.

SALIDA:
Un banner con el formato: mensaje, nombreamada.

Por ejemplo:
Entrada

I love you
baby


Resultado
   @         @     @@@@@ @   @ @@@@        @   @ @@@@@ @   @             @@@@  @@@@  @@@@  @   @
   @         @     @   @ @   @ @            @ @  @   @ @   @             @  @  @  @  @  @   @ @
   @         @     @   @ @   @ @@@           @   @   @ @   @             @@@@  @@@@  @@@@    @
   @         @     @   @  @ @  @             @   @   @ @   @  @          @  @  @  @  @  @    @
   @         @@@@  @@@@@   @   @@@@          @   @@@@@ @@@@@ @           @@@@  @  @  @@@@    @

  @       @    @@@@@@   @@@@@      @   @@@@@@@   @     @@@@ @@@@ @@@@ @   @
  @       @    @   @@   @@          @ @ @   @@   @     @  @ @  @ @  @  @ @
  @       @    @   @@   @@@@         @  @   @@   @     @@@@ @@@@ @@@@   @
  @       @    @   @ @ @ @           @  @   @@   @ @   @  @ @  @ @  @   @
  @       @@@@ @@@@@  @  @@@@        @  @@@@@@@@@@@    @@@@ @  @ @@@@   @
   @         @     @@@@@ @   @ @@@@        @   @ @@@@@ @   @
   @         @     @   @ @   @ @            @ @  @   @ @   @
   @         @     @   @ @   @ @@@           @   @   @ @   @
   @         @     @   @  @ @  @             @   @   @ @   @  @
   @         @@@@  @@@@@   @   @@@@          @   @@@@@ @@@@@ @


 */
fun generarBanner(mensaje:String, nombre:String): Array<CharArray>{
    val abecedario = arrayOf( ABC.A, ABC.B, ABC.C, ABC.D, ABC.E, ABC.F, ABC.G, ABC.H, ABC.I, ABC.J, ABC.K, ABC.L, ABC.M, ABC.N, ABC.O, ABC.P, ABC.Q, ABC.R, ABC.S, ABC.T, ABC.U, ABC.V, ABC.W, ABC.X, ABC.Y, ABC.Z )
    val caracteres    = mensaje.uppercase() + ", " + nombre.uppercase()
    val listaMatrices = mutableListOf<Array<CharArray>>()
    for (caracter in caracteres){
        val matrizCaracter = when(caracter){
            in 'A'..'Z' -> abecedario[caracter - 'A']
            ' ' -> ABC.BLANCO
            ',' -> ABC.COMA
            '-' -> ABC.GUION
            else -> ABC.BLANCO
        }
        listaMatrices.add(matrizCaracter)
    }
    val filas = 5
    val columnasLetra = 5
    val totalColumnas = listaMatrices.size * (columnasLetra+1) //para el desplazamiento que introduzco despues de cada letra

    val banner = Array(filas) {CharArray(totalColumnas) {' '} }
    for (i in 0 until filas){
        var columnaActual = 0

        for (matriz in listaMatrices){
            for (j in 0 until columnasLetra) {
                banner[i][columnaActual] = matriz[i][j]
                columnaActual++
            }
            columnaActual++//desplazo la posicion para que quede un espacio entre letras
        }
    }
    return banner
}


fun printBanner(banner:Array<CharArray>){
    var filas = banner.size
    var columnas = banner[0].size
    for(i in 0 until filas){
        print(" ") //espacacio antes de nada
        for (j in 0 until  columnas) {
            print("${banner[i][j]}")
            //if (j % 4 == 0) print(" ")
        }
        println()
    }
}
fun main(){
    var input = readLine()
    var name  = readLine()

    if (!input.isNullOrBlank() && !name.isNullOrBlank()){
        printBanner(generarBanner(input, name))
    }
}