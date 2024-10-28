package Programacion01.listas

/*
Copiar una lista

Ya sabemos que para copiar una lista dispongo de las funciones toList() y toMutableList().  No obstante, ahora
queremos practicar el paso de listas como argumentos de una función y queremos hacer un par de funciones copiar()
"caseras".

De los tests se desprende como tienen que ser estas funciones

Por ejemplo:
Prueba 	                                    Resultado

val listaOrigen = listOf(1, 2, 3, 4, 5)     [1, 2, 3, 4, 5]
val listaDestino1 = mutableListOf<Int>()    [1, 2, 3, 4, 5]
val listaDestino2: List<Int>
copiarLista1(listaOrigen, listaDestino1)
println(listaDestino1)
listaDestino2 = copiarLista2(listaOrigen)
println(listaDestino2)
Respuesta:
 */
fun copiarLista1(lista1:List<Int>,lista2:MutableList<Int>){
    for(i in 0..lista1.size-1){
        lista2.add(lista1[i])
    }
}
fun copiarLista2(lista1:List<Int>):List<Int>{
    return lista1
}

fun main (){
    val listaOrigen = listOf(1, 2, 3, 4, 5)
    val listaDestino1 = mutableListOf<Int>()
    val listaDestino2: List<Int>
    copiarLista1(listaOrigen, listaDestino1)
    println(listaDestino1)
    listaDestino2 = copiarLista2(listaOrigen)
    println(listaDestino2)
}
/*
fun copiarLista2(lista1: List<Int>): List<Int> {
    val nuevaLista = mutableListOf<Int>()
    for (i in lista1.indices) {
        nuevaLista.add(lista1[i])
    }
    return nuevaLista
}
 */