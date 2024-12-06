package Programacion01.recursividad

/*
El laberinto, el ratón y el queso

150+ Ratón Y Queso Maze Ilustraciones de Stock, gráficos ...

El laberinto del ratón y el queso es un juego clásico que ha entretenido a niños y adultos durante décadas y es una herramienta pedagógica efectiva que puede ser utilizada para estudiar la toma de decisiones y las estrategias de resolución de problemas.

Nuestro laberinto será una matriz de caracteres y se trata de encontrar una solución (un camino)  desde un punto inicial desde que partiría el ratón hasta llegar a  Q(queso), teniendo en cuenta que  # es una pared y 0 representa una celda transitable.

La solución será un string que contiene la lista de coordenadas del camino solución.

Se garantiza que siempre habrá una solución, pero puede haber muchas soluciones. La solución obtenida no tiene porque ser la mejor(la más corta), si no que será aquella que se genera  en el siguiente orden de exploración: norte,  este, sur y oeste.

SE PIDE: función hayCamino()

Por ejemplo:
Prueba

val laberinto = listOf(
        mutableListOf('R', '#', '0', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('#', '#', '#', '0', '0'),
        mutableListOf('0', '0', '0', '0', '#'),
        mutableListOf('0', '0', '#', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('0', '#', '0', '#', '#'),
        mutableListOf('0', '0', 'Q', '#', '0')
    )

    // Ratón sale de 0,0
    println(hayCamino(0, 0, laberinto))


Resultado
(0,0)(1,0)(1,1)(1,2)(0,2)(0,3)(0,4)(1,4)(2,4)(2,3)(3,3)(3,2)(3,1)(4,1)(5,1)(5,2)(6,2)(7,2)

val laberinto = listOf(
        mutableListOf('R', '#', '0', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('#', '#', '#', '0', '0'),
        mutableListOf('0', '0', '0', '0', '#'),
        mutableListOf('0', '0', '#', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('0', '#', '0', '#', '#'),
        mutableListOf('0', '0', 'Q', '#', '0')
    )

    // Ratón sale de 7,0
    println(hayCamino(7, 0, laberinto))


Resultado
(7,0)(6,0)(5,0)(4,0)(3,0)(3,1)(4,1)(5,1)(5,2)(6,2)(7,2)

 */
fun hayCamino(fila:Int,columna:Int,laberinto:List<MutableList<Char>>):MutableList<List<Int>>{
    var listaSolucion = mutableListOf<List<Int>>()
    if(laberinto[fila][columna]=='Q'){
        listaSolucion.add(listOf(fila,columna))
        return listaSolucion
    }
    laberinto[fila][columna]='V' //posicion ya recorrida.
    var nfila=fila
    var ncolumna=columna

    while (nfila+1 in 0..laberinto.size-1 && ncolumna+1 in 0..laberinto[0].size-1){
        for (i in -1..1){
            if (laberinto[nfila+i][ncolumna]!='#'){
                listaSolucion.add(listOf(nfila+i,ncolumna))
                hayCamino(nfila+i,ncolumna,laberinto)
                nfila=nfila+i
            }
            else if (laberinto[nfila][ncolumna+i]!='#'){
                listaSolucion.add(listOf(nfila,ncolumna+i))
                hayCamino(nfila,ncolumna+i,laberinto)
                ncolumna = ncolumna+i
            }
        }

    }
    return mutableListOf(listOf(0)) // no se encontro Q
}
fun main(){
    val laberinto = listOf(
        mutableListOf('R', '#', '0', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('#', '#', '#', '0', '0'),
        mutableListOf('0', '0', '0', '0', '#'),
        mutableListOf('0', '0', '#', '0', '0'),
        mutableListOf('0', '0', '0', '#', '0'),
        mutableListOf('0', '#', '0', '#', '#'),
        mutableListOf('0', '0', 'Q', '#', '0')
    )

    // Ratón sale de 0,0
    println(hayCamino(0, 0, laberinto))
}