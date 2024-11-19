package Programacion01.listas

/*
Una de gatos y ratones

Una casa esta formada por plantas y habitaciones. La casa se representa por una matriz de caracteres. Cada fila de la matriz es una planta y cada habitación es una  celda  de dicha planta. Las habitaciones de representan con una 'X' excepto las habitaciones que contienen un gato que rodea a una rata que se representan por 'G' y la habitación que contienen una  rata que se representa por 'R'.  Sólo hay una rata en la casa y se entiende que un gato rodea a una rata si está en una habitación adyacente a la rata.  Las habitaciones están llenas de agujeros y la Rata pasa de una a otra así que los gatos de la casa deciden rodearla esperando taimadamente en las habitaciones adyacentes. Dependiendo de la ubicación de la rata pueden entrar en juego hasta 8 gatos para rodearla.

La casa más pequeña posible  consta de una única planta y una única habitación. Si la casa fuera de una única planta y una única habitación se considera automáticamente rodeada la rata, no son necesarios gatos.

Entrada: Una serie de casos. Cada caso es una única linea que contiene cuatro enteros que indican el número de plantas, número de habitaciones por planta y la planta y habitación donde se encuentra la rata.  Las plantas y habitaciones comienzan a numerarse desde 1.

Salida: para cada caso,  plano de la casa en la que se observa como los gatos rodean a la rata en las celdas adyacentes. Ten encuenta que puede haber hasta 8 celdas adyacentes y que solo se representan los gatos que están en las habitaciones adyacentes. Cada plano se separa del siguiente por una línea en blanco.  Cada habitación se imprime entre []

Por ejemplo:
Entrada 	Resultado

4 5 4 5
4 5 1 1
3 3 2 2



[X][X][X][X][X]
[X][X][X][X][X]
[X][X][X][G][G]
[X][X][X][G][R]

[R][G][X][X][X]
[G][G][X][X][X]
[X][X][X][X][X]
[X][X][X][X][X]

[G][G][G]
[G][R][G]
[G][G][G]


 */