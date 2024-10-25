package Programacion01.recursividad

/*
LA MULTIPLICACIÓN RUSA  (CON RECURSIVIDAD)

Ya hicimos este ejercicio con bucle. Ahora toca con recursividad.

Hay muchos algoritmos que permiten multiplicar dos números. Uno de ellos es el llamado método de los campesinos
rusos (o simplemente, de los campesinos o Rusa). Los únicos conocimientos requeridos son saber sumar y saber dividir
y multiplicar por dos.
Se generan  dos columnas de números. Comenzamos escribiendo los dos multiplicandos al principio de sendas columnas. En
 la de la izquierda, iremos duplicando progresivamente el valor del número obtenido, y en la de la derecha iremos
  dividiendo por dos, redondeando a la baja cuando sea necesario. Cuando en la columna de la derecha lleguemos al uno,
   detenemos el proceso

Ejemplo: 105x68

105 | 68
210 | 34
420 | 17
840 | 8
1680 | 4
3360 | 2
6720 | 1

A continuación, despreciamos todas las filas para las cuales el número de la derecha sea par.

105 | 68

210 | 34
420 | 17
840 | 8
1680 | 4
3360 | 2
6720 | 1

Por último,  sumamos todas las filas restantes de la columna izquierda, y obtenemos el resultado.

420 + 6720 = 7140, que es exactamente el valor de 105×68

SE PIDE RESOLVER CON RECURSIVIDAD: Escribir un función recursiva mulRusa() tal y como se infiere de los casos ejemplo.
 Los argumentos serán números enteros mayores que cero y se garantiza que los casos de prueba enviados nunca van a
 generar un resultado mayor que  109.

Por ejemplo:
Prueba 	                    Resultado

println(mulRusa(105,1))     105
println(mulRusa(1,105))     105
println(mulRusa(1999,33))   65967
println(mulRusa(210,10000)) 2100000
println(mulRusa(105,68))    7140

 */