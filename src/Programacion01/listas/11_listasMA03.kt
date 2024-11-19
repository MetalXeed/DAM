package Programacion01.listas

/*
Campo de minas

https://www.aceptaelreto.com/problem/statement.php?id=176



Aunque existieron antecedentes previos, el juego Buscaminas comenzó a ser famoso cuando se incluyó en la versión 3.1 de Windows, en el lejano 1992. Corre el rumor de que fue incluído para que los usuarios se entretuvieran mientras, sin saberlo, cogían práctica utilizando un dispositivo por aquel tiempo apenas conocido: el ratón.

Hoy el juego es archiconocido (y el dispositivo también). El número de variantes e implementaciones es inmenso, y sigue estando incluído en la gran mayoría de los sistemas de escritorio.

El juego consiste en un tablero rectangular con celdas, algunas de las cuales ocultan minas. El usuario debe ir destapando las celdas con cuidado para no seleccionar ninguna mina. Como ayuda, cada vez que destapa una celda libre, se le muestra cuántas minas tiene alrededor.

En este problema os daremos la configuración de un tablero de Buscaminas totalmente descubierto, y os pedimos que nos digáis cuántas celdas vacías tienen al menos 6 minas a su alrededor.




Entrada

La entrada estará compuesta de múltiples casos de prueba. Cada uno comienza con una línea conteniendo dos números enteros positivos, menores que 1.000, que indican, respectivamente, el ancho y el alto del tablero. A continuación vendrá una línea por cada fila del tablero. Cada celda se representa con un * indicando que en esa celda hay una mina, o con un - indicando que está libre.

La entrada termina con un tablero de ancho o alto 0.



Salida

Para cada caso de prueba se debe indicar, en una única línea, el número de celdas vacías con al menos 6 minas alrededor.

Por ejemplo:
Entrada 	Resultado

5 4         0
*--**       3
---*-
---**
***--
4 5
**-*
****
*--*
**-*
-***
0 0




 */