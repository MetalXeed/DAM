package Programacion01.listas

/*
Sombras en el camping

https://www.aceptaelreto.com/problem/statement.php?id=207

Se acerca el verano y los aficionados a la naturaleza pasarán buena parte de él en campings, disfrutando del aire libre.

Un requisito imprescindible en los meses de calor es colocar la tienda de campaña bajo la sombra de un buen árbol para poder pasar frescos las horas de siesta. Pero, dependiendo de la zona, eso no siempre es fácil. En los campings nuevos, el número de árboles es escaso, y también lo es por tanto el número de parcelas aptas para tiendas.



Figura 1: primer ejemplo de entrada destacando las zonas de sombra

Sabiendo que cada árbol proporciona sombra a las ocho parcelas adyacentes, ¿cuántas tiendas de campaña disfrutarán de sombra en un camping?

Entrada

El programa deberá procesar múltiples casos de prueba recibidos por la entrada estándar. Cada uno representa un camping formado por una cuadrícula de parcelas de igual tamaño en los que puede haber hueco para una tienda, o un árbol.

Cada caso de prueba comienza con dos números 1 ≤ c, f ≤ 50, indicando el número de columnas y de filas de la cuadrícula de parcelas. A continuación se indica el número a de árboles del camping.

Si hay árboles, en la siguiente línea aparece la posición de todos ellos, indicando para cada uno la columna (1…c) y la fila (1…f) que ocupan. En total, aparecerán 2×a números.

La entrada termina con una línea con tres ceros (camping con dimensiones nulas y sin árboles), que no debe procesarse.

Salida

Por cada caso de prueba el programa indicará, en una línea, el número de parcelas que disfrutarán de sombra.

Por ejemplo:
Entrada 	                    Resultado

7 7 8                           22
7 2 3 3 4 3 4 4 3 5 4 5 1 7 2 7
0 0 0



7 7 8
7 2 3 3 4 3 4 4 3 5 4 5 1 7 2 7
0 0 0


*/
fun calcularSombras(matriz:MutableList<CharArray>):Int{
    //val mapa = mutableMapOf<Int,Int>() //lo uso para guardar cuantas posiciones hay rodeadas con cuantas minas
    val filas  = matriz.size
    val columnas = matriz[0].size
    var sombrasTotales = 0

    for (l in 0 until filas) {
        for (m in 0 until columnas) {
            if (matriz[l][m]=='A'){
                for (n in -1..+1){
                    for(o in -1 .. +1){
                        if((l+n) in 0 until filas && (m+o)in 0 until columnas && (matriz[l+n][m+o]!='S') && (matriz[l+n][m+o]!='A')){
                            matriz[l+n][m+o]='S'
                            sombrasTotales++
                        }
                    }
                }
            }
        }
    }
    //println(matriz)
    return sombrasTotales
}
fun main(){

    var entrada = readLine()
    while(!entrada.isNullOrBlank() && !entrada.equals("0 0 0") ){
        val lista = entrada.split(" ")
        var columnas = lista[0].toInt()
        var filas = lista[1].toInt()
        var nArboles = lista[2].toInt()
        var matriz = MutableList(filas){CharArray(columnas){'-'}} // '-' no sombra 'S' 'A' arbol

        var listaArboles = readLine()!!.split(" ").map { it.toInt() }
        for (a in 0 until nArboles){
            var columna = listaArboles[2*a]-1
            var fila = listaArboles[2*a+1]-1
            matriz [fila][columna] = 'A'
        }
        println(calcularSombras(matriz))
        entrada = readLine()
    }
}