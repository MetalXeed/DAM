package Programacion01.POO.basica

/*
MyScanner

Se trata de escribir una clase Kotlin que llamaremos MyScanner,  una versión sencilla de la famosa clase Scanner del
API java.

Nuestros objetos MyScanner sólo trabajan con los Strings introducidos en el constructor. No trabaja con teclado, ni
ficheros.  Los caracteres delimitadores que utiliza para hacer su trabajo son los mismos que usa por defecto la clase
Scanner: \n \t y ' ' .


La solución debe basarse en el recorrido y tratamiento del String datos, por descontado, no se permite utilizar la clase
Scanner en el interior de MyScanner para solucionar el problema.  Puedes usar los métodos de  String que consideres
oportunos.

 Para realizar su trabajo, MyScanner avanza en su análisis de caracter en caracter de forma que necesita almacenar cual
 es la posición en la que continuar en el próximo escaneo. En el resto del enunciado llamaremos a esa posición "pos".

MyScanner consta  de las siguientes funciones:

    hasNextLine(). Devuelve true si quedan más caracteres por escanear que constituyan una línea . En caso contrario
    devuelve false. Si entre la posición actual del escaneo y el final del String hay al menos un  caracter siempre
    se va a poder devolver un String que se considera una línea, aunque sea el string vacío.
    hasNext(). Devuelve true si  queda algun token en los datos por analizar, es decir, sihay algun caracter no
    delimitador entre pos y datos.length(). En caso contrario devuelve false
    nextLine(). Devuelve un String que se corresponde con  la línea leida.  Recuerda la posibilidad de que nextLine()
    devuelva el string vacío "" cuando se encuentra inmediatamente un \n.
    next(). Devuelve un String que se corresponde con el  token leido. Token es un conjunto  caracteres contiguos
    delimitador por un caracter delimitador que no se considera parte del token.
    nextInt(). Devuelve un int que se corresponde con el  token leido.

Ten encuenta, que el funcionamiento de next(), nextInt() y nextLine() es similar al de la clase Scanner que se asume
que conoces y entiendes.  Observa en los ejemplos,  que si  nextLine()  y next()  en su procesamiento de caracteres,
llegan al final del string datos,   devuelve los caracteres correspondientes aun que no hubieran llegado  a un
delimitador,. Así es además como funciona el Scanner del API java.

Observa que en las pruebas las lecturas que se hacen son siempre posibles, no generan errores. Si hicieramos lecturas
incorrectas, por ejemplo intentando leer en un String vacio deberíamos lanzar una excepción, pero todavía no sabemos
manejar excepciones.

Por ejemplo:
Prueba 	Resultado

var ms=MyScanner("hola a todas")
println(ms.pos)
println(ms.datos)
println(ms.hasNextLine())
ms= MyScanner("")
println(ms.pos)
println(ms.hasNextLine())



0
hola a todas
true
0
false

var ms= MyScanner("hola a todos\ny adios")
println(ms.hasNextLine())
ms.nextLine()
println(ms.pos)
println(ms.datos)
ms= MyScanner("hola a todas\n y hola a todos")
println(ms.hasNextLine())
println(ms.nextLine())
println(ms.hasNextLine())
println(ms.nextLine())
println(ms.hasNextLine())
println(ms.pos)
ms= MyScanner("hola a todas\n y hola a todos\n")
println(ms.nextLine())
println(ms.nextLine())
println(ms.pos)
println(ms.hasNextLine())



true
13
hola a todos
y adios
true
hola a todas
true
 y hola a todos
false
28
hola a todas
 y hola a todos
29
false

var ms= MyScanner("hola a todos")
while(ms.hasNextLine()){
    println(ms.nextLine())
}
ms= MyScanner("hola a todas \ny también hola a todos")
while(ms.hasNextLine()){
   println(ms.nextLine())
}
ms=  MyScanner("hola a todas \ny también hola a todos\n")
while(ms.hasNextLine()){
   println(ms.nextLine())
}
ms= MyScanner("hola a todas \n\ny también hola a todos\n");
while(ms.hasNextLine()){
   println(ms.nextLine());
}



hola a todos
hola a todas
y también hola a todos
hola a todas
y también hola a todos
hola a todas

y también hola a todos

var ms= MyScanner("hola a todos")
println(ms.pos)
println(ms.next())
println(ms.pos)
println(ms.next())
println(ms.pos)
println(ms.hasNext())
ms= MyScanner("HOLA \t \n A TODOS \n\t   \n")
println(ms.next())
println(ms.pos)
println(ms.next())
println(ms.pos)
println(ms.next())
println(ms.pos)
println(ms.hasNext())



0
hola
4
a
6
true
HOLA
4
A
10
TODOS
16
false

var ms= MyScanner("2 3 4")
var suma=0
while(ms. hasNext()) suma+=ms.nextInt()
println(suma)
ms= MyScanner("2 \t3 \n4\n")
suma=0
while(ms. hasNext()) suma+=ms.nextInt()
println(suma)
ms=  MyScanner("2 3 4\n\t")
suma=0
while(ms. hasNext()) suma+=ms.nextInt()
println(suma)
ms= MyScanner("2 \nmi mama me mima")
println(ms.nextInt())
ms.nextLine()//limpiar enter
println(ms.nextLine())



9
9
9
2
mi mama me mima
 */

//elementos delimitadores: \n \t y ' ' .
//almacenar la posicion en la que necesita continual el proximo escaneo.
class MyScanner(var datos:String=""){
    var pos:Int
    val delimitadores:List<Char> = listOf('\n', '\t', ' ')

    init {
        pos=0
        //var letra = datos[pos]
    }
    //true si tien caracteres a cont
    fun hasNextLine():Boolean{
        return (datos.length > pos)
    }
    // true si hai caracter delimitador entre pos y datos.length()
    fun hasNext():Boolean{
        for(i in pos until datos.length){
           if (!delimitadores.contains(datos[i])) return true
        }
        return false
    }

    fun nextLine():String{
        if (!hasNextLine()) return ""
        val posInit = pos

        while (pos < datos.length && datos[pos] != '\n') {
            pos++
        }

        // Avanzamos la posición para el próximo carácter después del salto de línea
        if (pos < datos.length && datos[pos] == '\n') {
            pos++
        }
        return datos.substring(posInit, pos).trimEnd('\n')

    } //

    fun next():String{
        //salta delimitadores
        while (pos < datos.length && delimitadores.contains(datos[pos])) {
            pos++
        }
        val posInit = pos

        while (pos < datos.length && !delimitadores.contains(datos[pos])) {
            pos++
        }
        return datos.substring(posInit, pos)
    } //

    fun nextInt():Int{
        //avanza la posicion si la pos corresponde a un delimitador
        while (pos < datos.length && delimitadores.contains(datos[pos])) {
            pos++
        }
        val posInit = pos
        while (pos < datos.length && !delimitadores.contains(datos[pos]) && datos[pos].isDigit()) {
            pos++
        }
        // Devuelve el número encontrado
        return datos.substring(posInit, pos).toInt()
    } //

}

fun main(){

    var ms= MyScanner("hola a todos")
    println(ms.pos)
    println(ms.next())
    println(ms.pos)
    println(ms.next())
    println(ms.pos)
    println(ms.hasNext())
    ms= MyScanner("HOLA \t \n A TODOS \n\t   \n")
    println(ms.next())
    println(ms.pos)
    println(ms.next())
    println(ms.pos)
    println(ms.next())
    println(ms.pos)
    println(ms.hasNext())
}