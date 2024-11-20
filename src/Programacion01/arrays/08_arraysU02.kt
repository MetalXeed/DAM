package Programacion01.arrays

/*
K Insertar y borrar en arrays

Ya sabes que la gran diferencia entre lista y array es que un array tiene un tamaño fijo. La forma de
redimensionar un array es crear uno nuevo. con el tamaño y los datos actualizados a partir del array original.

Si nos empeñamos en utilizar arrays en lugar de listas podríamos escribir unas funciones como las de los
test de este ejemplo. Se entiende que quieres evitar listas, trabajando sólo con arrays, sin ni siquiera
valerse del uso de listas temporales.

Supón que los indices que reciben  las funciones siempre son correctos. No precisas depurarlos. Ten
encuenta, eso sí, que se puede insertar un nuevo elemento al final del array y si se borra un elemento de
un array de un único elemento nos queda un array vacío y esto es correcto.

Por ejemplo:
Prueba 	                                    Resultado

var a1 = charArrayOf('a', 'b', 'c', 'd')    a, b, c, X, d
a1 = miAdd(a1, 3, 'X')                      a, b, X, d
println(a1.joinToString())
a1 = miRemoveAt(a1, 2)
println(a1.joinToString())






 */

fun miAdd(arrChar:CharArray,num:Int,entrada:Char):CharArray{
    var arrTemp = arrChar.copyOf(arrChar.size +1)
    arrTemp[num]=entrada
    for (i in num  .. arrChar.size-1){
        arrTemp[i+1]=arrChar[i]
    }
    return arrTemp
}
fun miRemoveAt(arrChar:CharArray,num:Int):CharArray{
    var arrTemp = arrChar.copyOf(arrChar.size -1)
    //arrTemp[num]=entrada
    for (i in num  .. arrChar.size-2){
        arrTemp[i]=arrChar[i+1]
    }
    return arrTemp
}
fun main(){
    var a1 = charArrayOf('a', 'b', 'c', 'd')
    a1 = miAdd(a1, 3, 'X')
    println(a1.joinToString())
    a1 = miRemoveAt(a1, 2)
    println(a1.joinToString())

/*
    var a1 = charArrayOf()
    a1 = miAdd(a1, 0, 'A')
    println(a1.joinToString())
    a1 = miRemoveAt(a1, 0)
    println(a1.joinToString())
    a1 = miAdd(a1, 0, 'X')
    println(a1.joinToString())
    a1 = miAdd(a1, 1, 'Z')
    println(a1.joinToString())
    */
}