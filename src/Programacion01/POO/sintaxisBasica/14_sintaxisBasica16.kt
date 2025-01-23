package Programacion01.POO.sintaxisBasica
/*
[fuente: aceptaelreto.com (441)]

CONTAR HASTA EL FINAL

Recuerda este ejercicio ya hecho. Queremos practicar usar clases java desde kotlin.
Resuelvelo ahora el ejercicio desde Kotlin pero usando la clase Scanner para la
entrada salida y BigInteger para cómodamente sumar 1 a un número que puede ser gigante.

El día que, con cuatro años, Clara averiguó que los números son infinitos no le gustó
nada. Le había costado mucho tiempo aprender a contar hasta 100, estaba empezando a
entender cómo llegar hasta 1.000, y de repente se había enterado de que siempre
tendría más y más números que aprender.

Le gustó tan poco ese descubrimiento que no pudo aceptarlo. A cualquier adulto que
veía le preguntaba, sin previo aviso, por qué los números nunca se acaban. Aunque
la respuesta era invariablemente la misma (un inquietante "porque siempre se puede
sumar uno más a cualquier número"), ella no perdía la esperanza de que finalmente
se rindieran y confesaran que todo había sido una broma de mal gusto.


Un año después, en clase de religión, encontró la incrongruencia que estaba buscando.
Esta tarde, en cuanto llegara a su casa pillaría a su padre en un renuncio y le
obligaría a reconocer que, efectivamente, había un último número. La pregunta que le
haría resonaba en su mente...

— Papá, ¿Dios puede contar hasta el final?

Entrada

La entrada está compuesta por distintos casos de prueba cada uno en una línea.

Cada línea, de como mucho 1.000 caracteres, contiene un número entero utilizando el
punto para separar los millares.

Salida

Por cada caso de prueba se escribirá el resultado de sumar uno al número leído usando el
mismo formato que en la entrada.

 nota del profe: del  enunciado original se desprende que podrían mandar números
 negativos, pero no lo hacen.

Por ejemplo:
Entrada 	Resultado

1
9
1.345
1.234.567



2
10
1.346
1.234.568
 */


//Scanner y big Integer. desde kotlin.
//corregir lo de sacar puntos.
/*
import java.util.Scanner
import java.math.BigInteger
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

fun main() {
    val entrada = Scanner(System.`in`)
    val symbols = DecimalFormatSymbols().apply {
        groupingSeparator = '.'
        decimalSeparator = ','
    }
    val formatter = DecimalFormat("#,###", symbols)

    while (entrada.hasNext()) {
        val linea = entrada.nextLine().replace(".", "")
        val numero = BigInteger(linea).add(BigInteger("1"))
        println(formatter.format(numero))
    }
}
 */
import java.util.Scanner;
import java.math.BigInteger
fun main(){
    var entrada = Scanner(System.`in`)
    while(entrada.hasNext()){
        val linea = entrada.nextLine().replace(".", "")
        val numero = BigInteger(linea).add(BigInteger("1"))
        println(numero)
    }
}