package Programacion01.arrays

/*
Teclado estropeado



http://www.aceptaelreto.com/problem/statement.php?id=144



Ya no se fabrican los teclados como antes. Después de unos pocos meses, a Ramiro el suyo le ha empezado a hacer
cosas raras. En concreto, cuando pulsa ciertas teclas el teclado parece interpretar que se han pulsado otras.

Después de un rato de análisis ha llegado a la conclusión de que la pulsación de la tecla del guión (-) tiene
el mismo resultado que si pulsa la tecla Inicio, y el cursor se le va al principio de la línea. Algo parecido
le ocurre con el +, que se lleva el cursor al final igual que la tecla Fin. Y al pulsar * se consigue el mismo
efecto que con la tecla de la flecha derecha. Pero lo peor de todo es lo que ocurre con el 3: ¡hace lo mismo
que la tecla Supr, que borra la letra que hay a la derecha del cursor!

El resultado es que cuando Ramiro se pone a copiar un texto sin mirar la pantalla, el resultado final de lo que
ha escrito puede terminar siendo muy distinto de lo que quería escribir. ¿Qué texto saldrá como resultado de la
pulsación de una serie de teclas?
Entrada

La entrada consta de un número indeterminado de líneas que deben ser consideradas independientes. Cada una
contiene la secuencia de pulsaciones de Ramiro.
Salida

Para cada caso de prueba se mostrará en una línea el texto final que obtendrá Ramiro tras pulsar las teclas
indicadas en el orden dado.

Por ejemplo:
Entrada 	Resultado

EDA         EDA
EDA-333
dD-3*A-E+   EDA
EDA-3E*3A   EDA


- INICIO
+ FINAL
* DERECHA
3 BORRA A LA DERECHA


EDA
EDA-333
dD-3*A-E+
EDA-3E*3A


var arrTemp = CharArray(arrayEntrada.size-1)

fun tecladoEstropeado(arrayEntrada:CharArray):CharArray{
    var salida:CharArray= CharArray(arrayEntrada.size)
    //var arrTemp:CharArray= CharArray(1){'0'}
    var posicionCursor=0
    var longitudSalida=0

    for (i in arrayEntrada){
        when(i){
            '-' -> posicionCursor = 0
            '+' -> posicionCursor = longitudSalida
            '*' -> if (longitudSalida > posicionCursor)posicionCursor ++
            '3' -> if (longitudSalida > posicionCursor){
                for(j in posicionCursor until longitudSalida-1){
                    salida[j] = arrayEntrada[j+1]
                }
            }
            else -> {
                for (j in (longitudSalida - 1) downTo posicionCursor) {
                    salida[j + 1] = salida[j]
                }
                salida[posicionCursor] = i
                longitudSalida++
                posicionCursor++
            }
        }
    }
    return salida
}
fun main(){
    var entrada = readLine()!!.toCharArray()
    //println(tecladoEstropeado(entrada).joinToString())
    while(entrada.isNotEmpty()){
        println(tecladoEstropeado(entrada).joinToString(""))
        entrada = readLine()!!.toCharArray()
    }
}
 */
fun tecladoEstropeado(arrayEntrada: CharArray): CharArray {
    var salida = CharArray(arrayEntrada.size)
    var posicionCursor = 0
    var longitudSalida = 0
    for (i in arrayEntrada) {
        when (i) {
            '-' -> posicionCursor = 0
            '+' -> posicionCursor = longitudSalida
            '*' -> if (posicionCursor < longitudSalida) posicionCursor++
            '3' -> if (posicionCursor < longitudSalida) {
                for (j in posicionCursor until longitudSalida - 1) {
                    salida[j] = salida[j + 1]
                }
                longitudSalida --
            }
            else -> {
                for (j in (longitudSalida - 1) downTo posicionCursor) {
                    salida[j + 1] = salida[j]
                }
                salida [posicionCursor] = i
                longitudSalida ++
                posicionCursor++
            }
        }
    }
    return salida.copyOfRange(0, longitudSalida)
}

fun main() {
    var entrada = readLine()
    while (!entrada.isNullOrEmpty()) {
        var arrayEntrada =entrada.toCharArray()
        println(tecladoEstropeado(arrayEntrada).joinToString(""))
        entrada = readLine ()
    }
}