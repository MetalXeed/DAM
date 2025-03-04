package Programacion01.bucles

import kotlin.system.exitProcess

/*
CONTAR HASTA EL FINAL

El día que, con cuatro años, Clara averiguó que los números son infinitos no le gustó nada. Le había costado mucho
tiempo aprender a contar hasta 100, estaba empezando a entender cómo llegar hasta 1.000, y de repente se había
enterado de que siempre tendría más y más números que aprender.

Le gustó tan poco ese descubrimiento que no pudo aceptarlo. A cualquier adulto que veía le preguntaba, sin previo
aviso, por qué los números nunca se acaban. Aunque la respuesta era invariablemente la misma (un inquietante "porque
siempre se puede sumar uno más a cualquier número"), ella no perdía la esperanza de que finalmente se rindieran y
confesaran que todo había sido una broma de mal gusto.




Un año después, en clase de religión, encontró la incrongruencia que estaba buscando. Esta tarde, en cuanto llegara a
su casa pillaría a su padre en un renuncio y le obligaría a reconocer que, efectivamente, había un último número. La
pregunta que le haría resonaba en su mente...

— Papá, ¿Dios puede contar hasta el final?

Entrada

La entrada está compuesta por distintos casos de prueba cada uno en una línea.

Cada línea, de como mucho 1.000 caracteres, contiene un número entero utilizando el punto para separar los millares.

Salida

Por cada caso de prueba se escribirá el resultado de sumar uno al número leído usando el mismo formato que en la entrada.

nota del profe: del  enunciado original se desprende que podrían mandar números negativos, pero no lo hacen.

Por ejemplo:
Entrada 	Resultado

1           2
9           10
1.345       1.346
1.234.567   1.234.568
Respuesta:
*/
fun main(){
    var carreo:Boolean = true
    var entrada:String? = readLine()
    while (entrada!=null) {
        if(entrada.isNotEmpty()){
            val cifras = mutableListOf<Int>()
            for (c in entrada) {
                if (c != '.') {
                    cifras.add(c.toString().toInt())
                }
            }
            carreo = true
            var i = cifras.size - 1

            while (carreo && i >= 0) {
                cifras[i]+=1
                if (cifras[i] == 10) {
                    cifras[i] = 0
                    i -= 1
                } else
                    carreo = false
            }
            //si terminamos el listado de cifras y nos llevamos una añadimos uno al principio 9 + 1 = 10
            if (carreo) {
                cifras.add(0, 1)
            }
            // Formatear el resultado con puntos para los millares
            val resultado = cifras.joinToString("").reversed().chunked(3).joinToString(".").reversed()
            println(resultado)
        }
        entrada = readLine()

    }
}
