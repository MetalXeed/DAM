package Programacion01.POO.sintaxisBasica

/*
Desestructuracion II

Entran una serie de Strings separados por un espacio

Se imprimen los tres más pequeños

Resuelve usando desestructuración

Por ejemplo:
Entrada 	Resultado

alberto roberto norberto filiberto



alberto filiberto norberto

 */
fun main(){
    val entrada = readLine()
    if(!entrada.isNullOrBlank()){
        var listado = entrada!!.split(" ")
        val (primera, segunda, tercera) = listado.sorted().take(3)
        println("$primera $segunda $tercera")
    }
}
//solucion de clase
/*
fun main() {
    val (uno,dos,tres)= readln().split(" ").sorted()
    println("$uno $dos $tres")
}
 */