package Programacion01
/*
Ocurrencias de un caracter y fin por <>

Diseña un programa que, en primer lugar, le pida al usuario que escriba un carácter
 cualquiera (letra, dígito,...). A continuación, aceptará entradas del usuario hasta
  que éste escriba la secuencia “<>”.  Puedes usar las funciones de String que quieras
  para ayudarte a resolver el problema.

El programa mostrará cuántas ocurrencias del carácter se produjeron en el texto
introducido hasta la aparición de dicha secuencia.

ADVERTENCIA: este ejercicio tiene test ocultos, es decir, si no los pasas, te dirá
que está mal pero no te dirá en que fallaste, esto hace mucho más dificil resolver
el problema, pero es mucho más realista. Por otro lado, tiene 7 tests,  por lo cual
la respuesta es muy lenta y tienes que tener paciencia.

Por ejemplo:


Entrada 	    Resultado

a               3
Hola, qué tal?
Así, así
<>

 */


fun main(){
    var entrada:String?
    var simbolo:String
    var elementos:List<String>
    var contador:Int = 0

    simbolo = readln()
    do{
        entrada = readlnOrNull()
        if (entrada.isNullOrBlank()) break
        elementos = entrada.split("")

        for (i in 0..entrada.length){
            if (elementos[i] == ">" && elementos[i-1]=="<") {
                println(contador.toString())
                break

            }
            if ((simbolo.toString()) == elementos[i]){
                contador++

            }
        }

    }while(true)
}