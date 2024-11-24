package Programacion01.listas

/*
Matrices triangulares

https://aceptaelreto.com/problem/statement.php?id=160


Se dice que una matriz cuadrada, es decir que tiene el mismo número de filas que de columnas, es triangular cuando
todos los valores que están por encima o por debajo de la diagonal principal son cero. También son triangulares
aquellas matrices que cumplen estas dos condiciones a la vez.

Realiza un programa que diga si una matriz cuadrada dada es o no triangular.
Entrada

La entrada consta de una serie de casos de prueba. Cada caso comienza con un número que representa el número de
filas, mayor que cero y menor o igual que 50, de la matriz cuadrada. A continuación se dan los elementos que
forman la matriz.

La entrada terminará con una matriz de 0 filas.
Salida

Para cada caso de prueba se indicará SI si la matriz es triangular y NO en caso contrario.

Por ejemplo:
Entrada 	Resultado

3           SI
1 2 3       NO
0 6 4       NO
0 0 5
3
1 0 0
2 3 0
4 5 6
3
1 1 1
1 1 1
0 0 1
0



3
1 2 3
0 6 4
0 0 5
3
1 0 0
2 3 0
4 5 6
3
1 1 1
1 1 1
0 0 1
0


 */

fun esTriangulo(matriz:MutableList<List<Int>>):String{
    var respuestaSup = "SI"
    var respuestaInf = "SI"
    val alto  = matriz.size
    val ancho = matriz[0].size

    if (alto != ancho) return "NO" //para descartar matrices no cuadradas,
    //triangulo superior
    for(i in 0 until alto) {
        //triangulo superor
        for (j in 0 until i) {
            if (matriz[i][j] != 0) {
                respuestaSup = "NO"
                break
            }
        }
    }
        //triangulo inferior
    for(i in 0 until alto) {
        //triangulo superor
        for (j in i+1 until ancho ) {
            if (matriz[i][j] != 0) {
                respuestaInf = "NO"
                break
            }
        }
    }
    return if (respuestaSup =="SI"|| respuestaInf =="SI") "SI" else "NO"
}
fun main(){

    var entrada = readLine()
    while(!entrada.isNullOrBlank() && entrada!= "0"){
        var dimension = entrada.toInt()
        var matriz = MutableList(dimension){List(dimension){0}}
        for(n in 0 until dimension){
            var linea = readLine()!!.split("  "," ").map { it.toInt() }
            matriz[n] = linea
        }
        println(esTriangulo(matriz))
        entrada = readLine()
    }
}