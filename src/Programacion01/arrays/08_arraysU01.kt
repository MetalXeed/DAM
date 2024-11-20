package Programacion01.arrays

/*

La abuela María

https://www.aceptaelreto.com/problem/statement.php?id=337



Tiene 106 años y tiene el pelo blanco, de nieve. Tiene un vestido negro y, de madera, negros pendientes.
Quince hijos parió su duro cuerpo, y trece amamantó del mismo pecho.

Con esta dilatada vida, no es de extrañar que su sonrisa ya no sea lo que era. Aquellos dientes de blanco
marfil que se adivinan en su foto de boda se han ido mellando y ahora apenas quedan unos pocos en su sitio
que a duras penas la permiten comer algo que no sea líquido.

Todas las mañanas, con el paso tranquilo, se dirige hacia el espejo y junta los pocos dientes que le quedan
arriba con los de abajo. Se le endulzan los ojos cuando recuerda su sonrisa de antaño, cómo se juntaban unos
con otros formando una preciosa muralla blanca. Ahora, según van mellando, a veces la casualidad hace que
encajen perfectamente y que pueda cerrar la sonrisa sin dejar huecos, mientras que otras veces dos de ellos
chocan primero y no permiten que todos los de arriba entren en contacto con su pareja de abajo.
Entrada

La entrada estará formada por distintos casos de prueba, cada uno representando la configuración de dientes
de un día en la vida de la abuela María. El número total de casos aparece en la primera línea de la entrada.

Los casos siguen a continuación, cada uno formado por dos líneas. La primera contiene el alto de los seis
dientes superiores responsables de la sonrisa (incisivos y caninos) de izquierda a derecha. De forma
equivalente, la segunda línea contiene la información de los seis inferiores. Todos ellos son números
enteros entre 0 y 2.000.
Salida

Para cada caso de prueba se escribirá SI si los dientes de arriba encajan perfectamente con los de abajo y
no quedan huecos entre ninguno de ellos, o NO en caso contrario.

Por ejemplo:
Entrada 	Resultado

2           SI
1 3 1 3 1 3 NO
3 1 3 1 3 1
1 1 1 1 1 1
1 2 1 1 1 1



 */


fun cierra(arDientesSup:Array<Int>, arrayDientesInf:Array<Int>):String{
    var suma= arDientesSup[0]+arrayDientesInf[0]
    var sumaActual = 0
    for(i in 1..5){
        sumaActual= arDientesSup[i]+arrayDientesInf[i]
        if (suma !=sumaActual) return "NO"
    }
    return "SI"
}
fun main(){
    val nentras = readLine()!!.toInt()
    var diestesSup = Array<Int>(6) {0}
    var dientesInf = Array<Int>(6) {0}
    var lDientesSup:List<Int>
    var lBientesInf:List<Int>


    for(i in 0..nentras-1){
        lDientesSup=readLine()!!.split(" ").map { it.toInt() }
        lBientesInf=readLine()!!.split(" ").map { it.toInt() }
        diestesSup=lDientesSup.toTypedArray()
        dientesInf=lBientesInf.toTypedArray()
        println(cierra(diestesSup,dientesInf))
    }
}
