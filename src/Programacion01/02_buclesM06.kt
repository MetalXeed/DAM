package Programacion01

/*

Verificador de 4/4

Uno de los compases más usados en música es el 4/4 o compás de compasillo. La unidad
básica de medida
 en este compas es la negra y se suele definir un 4/4 como un compas con  4 partes
 (tiempos) donde cada
  parte es una negra.

Además sabemos que hay las siguientes figuras musicales donde cada una de ellas
representa un tiempo
 diferente en un 4/4:

    una redonda equivale a cuatro negras
    una blanca equivale a dos negras
    dos corcheas son una negra
    dos semicorcheas son una corchea

Nos olvidamos de fusas, semifusas, silencios, puntillos, etc.

Y por lo tanto inferimos que en un compas de 4/4 "caben":

    1 redonda
    2 blancas
    4 negras
    8 corcheas
    16 semicorcheas
    y otras muchas combinaciones mezclando figuras como por ejemplo 7 corcheas y 2
    semicorcheas

Graficamente utilizando el himno de la alegría observamos lo comentando
Nuestro objetivo es saber si dado un compás de 4/4,  éste es  correcto o incorrecto
en lo relativo al
 tiempo de las figuras que contiene, es decir, si contiene cuatro negras o cualquier
 otro conjunto de figuras
  que sea equivalente en tiempo a cuatro negras.

ENTRADA: Consiste en una serie de compases.. "FIN" indica que no hay que procesar más
compases..  Cada
 compás es descrito en una linea como una secuencia de notas: Redonda(R), Blanca(B),
 Negra(N), Corchea(C)
  o Semi corchea(S) separadas entre sí por uno o muchos espacios en blanco.

SALIDA:

    CORRECTO si el compas contiene 4 negras o equivalente.
    EXCESO si el compas contiene  un tiempo total superior a 4 negras o equivalente.
    DEFECTO si el compas contiene un tiempo total inferior a 4 negras o equivalente.

Por ejemplo:
Entrada

N    N N N
N N   N
N N N N    N
B   N  N
N B N
FIN

R
R R
N   C S S   B
N C S B
FIN

Resultado

CORRECTO
DEFECTO
EXCESO
CORRECTO
CORRECTO

CORRECTO
EXCESO
CORRECTO
DEFECTO

 */