package Programacion01.bucles

/*
CUANTAS ME LLEVO

Cuando aprendemos a sumar números pronto nos cuentan aquello de "llevarse una": cuando los dos dígitos que sumamos
llegan a la decena tenemos "acarreo" que debemos sumar a los siguientes dígitos (de la izquierda).

Cuando nuestros maestros nos ponían ejercicios, antes tenían que contar cuántas veces tendríamos que "llevarnos una"
y en base a eso medían la dificultad del ejercicio.

¿Puedes hacer un programa que automatice esa tarea?

Entrada

La entrada estará compuesta de numerosos casos de prueba, cada uno de ellos en una línea. En cada línea apareceran
dos números positivos separados por un espacio. Se garantiza que los números no tendrán más de 1000 dígitos.

Los casos de prueba terminan con el caso especial 0 0, que no provocará salida.

Salida

Para cada caso de prueba hay que escribir en una línea el número de veces que hay "acarreo" en la suma.

Por ejemplo:
Entrada 	Resultado

123 456     0
555 555     3
123 594     1
0 1         0
1 0         0
699 11      2
11 699      2
19 1        1
0 0
Respuesta:
 */
fun sumaString(a:String,b:String):Int{
    val maxleght = maxOf(a.length, b.length)
    val pada = a.padStart(maxleght,'0').reversed()
    val padb = b.padStart(maxleght, '0').reversed()
    val resultado = StringBuilder()
    var carreo = 0
    var ncarreo =0

    for (i in 0 until maxleght){
        var cifra1 = pada[i] - '0' // convierte a entero.
        var cifra2 = padb[i] - '0'
        val suma = cifra1 + cifra2 + carreo
        carreo = suma/10
        resultado.append(suma%10)
        if (carreo>0) ncarreo++
    }
    if (carreo >0) resultado.append(carreo)
    return ncarreo
}

fun main(){
    var entrada = readLine()!!.split(" ")

    while (!(entrada[0]=="0" && entrada[1]=="0")){
        println(sumaString(entrada[0], entrada[1]))
        entrada = readLine()!!.split(" ")
    }
}