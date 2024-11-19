package Programacion01.listas

/*
Generar el tablero de buscaminas





Cuando jugamos al buscaminas, el progreso del juego se va dirigiendo en base a un tablero precalculado que contiene las minas y la cantidad de celdas vecinas con minas que tiene cada celda.
Entrada:

Una serie de tableros.

Cada tablero se describe con dos líneas. En la primera se indica las dimensiones de filas F con F>0 y de columnas C con C>0 separadas por un espacio. En la segunda fila, separadas por un espacio en blanco,  se indican las coordenadas (f,c) de las minas del tablero con valores 0<= f < F y 0 <= c < C. Se garantiza que los valores de la entrada son congruentes, por ejemplo, las dimensiones no son negativas ni las minas que se colocan fuera del tablero.
Salida:

Tablero una vez colocadas las minas de la entrada. Las minas se representan con el dígito 9. Las celdas sin minas alrededor con 0.

Por ejemplo:
Entrada

8 8
0 0 0 1 0 2 1 0 1 2 2 0 2 1 2 2 5 5
6 6
3 3 3 4 4 3 4 4
10 10
0 9 0 7 1 8 5 3 6 4

Resultado

9 9 9 2 0 0 0 0
9 8 9 3 0 0 0 0
9 9 9 2 0 0 0 0
2 3 2 1 0 0 0 0
0 0 0 0 1 1 1 0
0 0 0 0 1 9 1 0
0 0 0 0 1 1 1 0
0 0 0 0 0 0 0 0
------------------------------------
0 0 0 0 0 0
0 0 0 0 0 0
0 0 1 2 2 1
0 0 2 9 9 2
0 0 2 9 9 2
0 0 1 2 2 1
------------------------------------
0 0 0 0 0 0 1 9 3 9
0 0 0 0 0 0 1 2 9 2
0 0 0 0 0 0 0 1 1 1
0 0 0 0 0 0 0 0 0 0
0 0 1 1 1 0 0 0 0 0
0 0 1 9 2 1 0 0 0 0
0 0 1 2 9 1 0 0 0 0
0 0 0 1 1 1 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
------------------------------------

 */