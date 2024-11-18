package Programacion01.mapas

/*
Referencias cruzadas

http://www.aceptaelreto.com/problem/statement.php?id=291

Dado un texto organizado por líneas, el problema de las referencias cruzadas consiste en producir un listado de
palabras ordenado alfabéticamente, donde cada palabra del texto va acompañada de una lista de referencias que
contiene los números de todas las líneas del texto en las que aparece la palabra en cuestión, ordenados de
menor a mayor.

Entrada
La entrada consta de diversos casos de prueba. Cada caso comienza con el número N de líneas que forman el texto
(entre 1 y 10.000). A continuación, aparecen N líneas con las palabras (entre 1 y 30) del texto, donde se han omitido
los signos de puntuación o tildes. Las palabras tienen como mucho 10 letras. La entrada termina cuando N es 0.
Salida

Para cada caso de prueba se escribirán las referencias cruzadas, donde solamente se tendrán en cuenta palabras con
más de 2 letras y no se tendrán en cuenta las mayúsculas. En las listas de números de línea no habrá repeticiones
(aunque la palabra aparezca varias veces en la misma línea). Tras procesar cada caso se escribirá una línea más con
----.

Por ejemplo:
Entrada

4
Guerra tenia una parra y Parra tenia una perra
la perra de Parra rompio la parra de Guerra y Guerra aporreo con la porra a la perra
Si la perra de Parra no hubiera roto la parra de Guerra
este no hubiera aporreado con la porra a la perra de Parra
0

Resultado

aporreado 4
aporreo 2
con 2 4
este 4
guerra 1 2 3
hubiera 3 4
parra 1 2 3 4
perra 1 2 3 4
porra 2 4
rompio 2
roto 3
tenia 1
una 1
----
 */