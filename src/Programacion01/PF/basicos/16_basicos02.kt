package Programacion01.PF.basicos

/*
Función concatenar genérica

Escribe una función concatenar() que concatene en un String los valores de una lista de cualquier tipo



Por ejemplo:
Prueba 	Resultado

val listaEnteros = listOf(1, 2, 3, 4, 5)
val resultadoEnteros = concatenar(listaEnteros)
println(resultadoEnteros)



12345

val listaCadenas = listOf("Hola", "Mundo", "!")
val resultadoCadenas = concatenar(listaCadenas)
println(resultadoCadenas)



HolaMundo!

 */

fun <T> concatenar(vararg listado:List<T>):String{
    var resultado=""
    for(i in listado) resultado=i.joinToString("")
    return resultado
}
fun main(){
    val listaEnteros = listOf(1, 2, 3, 4, 5)
    val resultadoEnteros = concatenar(listaEnteros)
    println(resultadoEnteros)

}
//solucion clase
//fun <T> concatenar(l:List<T>)= l.joinToString("")