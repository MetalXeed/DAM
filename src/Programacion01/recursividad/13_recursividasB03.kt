package Programacion01.recursividad

/*
¡Mire lo que me hizo su hijo!



Imprimación EPOXI 2C (Suelos con Humedad)

Mi vecino tiene una piscina increible ya que  a través de un complicado sistema de tabiques  móviles puede hacer dentro de la piscina subpiscinas sin comunicación de aguas entre sí. Un día la divide en dos para separar  niños de mayores, otro día hace pocitas individuales etc.

Como buen tiquismiquis,  le echa al agua de la piscina el  famoso  producto que detecta si alguien vierte de alguna forma líquido sucio (ya me entiendes a que líquido me refiero) a la piscina  en cuyo caso tiñe de rojo el agua para avisar de que algo indeseable ocurre en la zona de baño. Mi vecino echa tal concetración de producto, que de detectarse suciedad sospechosa se tiñe de rojo todo el agua de  la subpiscina afectada. Como las subpiscinas están aisladas por los tabiques entre sí la contaminación de una piscina no afecta a las otras.

Cuando mi hijo se entero de esto, el muy gamberrete se compró un tirachinas y lanzaba bolas de papel impregnadas en  líquido sucio hacia la piscina. Si conseguía que una bola cayera en una de las subpiscinas esta se teñía de rojo. Al poco tiempo de que mi hijo daba en el blanco, tenía al vecino en la puerta de mi casa enseñándome una  foto de  la pisicina  diciéndome ¡Mire lo que me hizo su hijo!.

Queremos realizar un programa  que ejemplifique esta situación  para poder explicarselo al psicologo de mi hijo. La piscina la representamos como una matriz de caracteres. Cada celda de la matriz de entrada  puede valer  el caracter 'A' para indicar que tiene agua limpia o 'T' para indicar que es un tabique. Recuerda que con los tabiques generamos subpiscinas aisladas entre sí. Si a nuestro programos le indicamos la coordenada de la celda en la que cae una bola de papel contaminante,  nos devolverá "la foto" en la que se aprecia la superfice de la piscina contaminada. Sí la bola cae fuera de la piscina o encima de un tabique no habrá ninguna subpiscina contaminada.


ENTRADA: Una serie de casos. Cada caso consta de una  primera que línea contiene  dos enteros separados por un espacio. El primero indica la cantidad  de  filas y el segundo la cantidad de columnas. A continuación viene f filas que describen la matriz. La última fila contiene  dos enteros separados por un espacio que indican las coordenadas de la celda donde cayó la bola contaminante.  La serie de casos termina cuando la primera linea de un caso indica 0 filas y 0 columnas.


SALIDA: Matriz con las celdas contaminadas descritas con el caracter R. Por ejemplo, el siguiente gráfico se corresponde con el último caso de prueba




Por ejemplo:
Entrada

3 3
ATA
TAT
ATA
0 1
3 3
ATA
TAT
ATA
2 2
5 5
AAAAA
AAAAA
TTTTT
AAAAA
AAAAA
1 2
5 7
AAATAAA
AAATAAA
AATAAAT
ATTTTTA
TAAAAAA
1 6
0 0


Resultado
ATA
TAT
ATA
---------------------------------------------
ATA
TAT
ATR
---------------------------------------------
RRRRR
RRRRR
TTTTT
AAAAA
AAAAA
---------------------------------------------
AAATRRR
AAATRRR
AATRRRT
ATTTTTA
TAAAAAA
---------------------------------------------

 */