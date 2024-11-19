package Programacion01.listas

/*
Bocatas de Calamares

Tengo un plano de la ciudad cuyo punto central es mi casa. El mapa consiste en una matriz donde cada celda  suponemos que tiene un alto y  ancho  de 1 hectómetro en la realidad. La matriz es cuadrada y de dimensión  d impar. Estoy obsesionado con los bocatas de calamares y el mapa almacena los puntos de venta de bocatas de calamares alrededor de mi casa. Siempre pasa lo mismo, que los bocatas más ricos y más baratos suelen estar lejos de mi casa pero por otro lado soy muy perezoso así que según las ganas con las que me encuentre de andar querré ir a uno u a otro buscando una solución de compromiso según mi momento. Cada celda del mapa puede almacenar:

    CX para indicar que es un punto de venta de bocatas de calamares. X es un número entero para identificar el punto de venta. Se garantiza que no habrá dos puntos de venta con la misma  X y que  siempre X<99 y X<d.

    NI (no interesa)para indicar  cualquier otra cosa que no me interesa en absoluto.

Me gustaría que me hicieras un programa de forma que yo le indique un mapa y un radio y el programa me indique los punto de venta de bocatas de calamares dentro del radio indicado. Recuerda que mi casa está en el centro del plano.

 ENTRADA:

En la primera línea un entero que indica  la dimensión d  de la matriz con d>0 y a continuación en la misma línea separada por un espacio un número real para indicar el radio de búsqueda con r>0.0 en hectómetros, por ejemplo un radio de 2.5 hectómetros se corresponde con 250 metros Por último vienen d líneas que describen  el mapa.

SALIDA:

Una lista de los puntos de venta de bocadillos de calamares dentro del radio. Cada línea de la salida contendrá un punto de bocata de calamares sleccionado junto con la distancia en hectómertos a la que se encuentra.

Por ejemplo:
Entrada

5 2.5
C1 C2 NI NI NI
NI NI NI C3 NI
NI C4 NI NI C5
NI C6 NI NI NI
NI C7 NI NI C8


Resultado
C2 a 2.23606797749979
C3 a 1.4142135623730951
C4 a 1.0
C5 a 2.0
C6 a 1.4142135623730951
C7 a 2.23606797749979

 */