package Programacion01.listas

/*
¿Es matriz identidad?


https://aceptaelreto.com/problem/statement.php?id=151&cat=14

Se dice que una matriz es identidad cuando todos sus elementos son cero a excepción de la diagonal principal, que
se encuentra rellena de unos:

Para que una matriz sea identidad debe de ser cuadrada, es decir, tener el mismo número de filas que de columnas.
Entrada

La entrada consta de una serie de casos de prueba. Cada uno comienza con un número que representa el número de
filas, como máximo 50, de una matriz cuadrada. Tras él, aparecen los elementos que forman la matriz, que serán
valores entre -1.000 y 1.000 (incluídos).

La entrada terminará con una matriz de 0 filas.
Salida

Para cada caso de prueba se indicará SI si la matriz es identidad y NO en caso contrario.

Por ejemplo:
Entrada 	Resultado

3           SI
1 0 0       NO
0 1 0       NO
0 0 1
2
0 1
1 0
5
1 0 0 0 0
0 5 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
0



3
1  0  5
0  1  0
0  0  1
0


2
0 1
1 0
5
1 0 0 0 0
0 5 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
0


 */
fun esIdentidad(matriz:MutableList<List<Int>>):String{
    var respuesta = "SI"
    val alto  = matriz.size
    val ancho = matriz[0].size

    if (alto != ancho) return "NO" //para descartar matrices no cuadradas,
    for(i in 0 until alto){
        for(j in 0 until alto){
            print(matriz[i][j])
            if ((i == j) && matriz[i][j] != 1) return "NO"
            else if (i == j) continue
            else if (matriz[i][j]!=0) {
                respuesta="NO"
                break
            }
        }
        println()
    }
    return respuesta
}
fun main(){

    var entrada = readLine()
    while(!entrada.isNullOrBlank()&&!entrada.equals(0.toString())){
        var dimension = entrada.toInt()
        var matriz = MutableList(dimension){List(dimension){0}}
        for(n in 0 until dimension){
            var linea = readLine()!!.split("  "," ").map { it.toInt() }
            matriz[n] = linea
        }
        println(esIdentidad(matriz))
        entrada = readLine()
    }

}




































