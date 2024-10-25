package Programacion01.recursividad

/*
Algoritmo de Euclides

El algoritmo de Euclides es un procedimiento para calcular el m.c.d. (máximo común divisor) de dos números. Para
simplificar suponemos que está garantizado que los dos números son mayores que cero y que el primer parámetro es
mayor o igual que el segundo, es decir, m.c.d(a,b) con a>=b>0

Los pasos del algoritmo de Euclides son:

    Se divide el número mayor entre el menor.

    Si:

        La división es exacta, el divisor es el m.c.d.
        La división no es exacta, dividimos el divisor entre el resto obtenido y se continúa de esta forma hasta
        obtener una división exacta, siendo el último divisor el m.c.d.

Ejemplo: calcular el m.c.d de 72 y 16

División

m.c.d. (72, 16) = 8

SE PIDE: función mcd recursiva que  implemente el algoritmo anterior

Por ejemplo:
Prueba 	                                                                Resultado

 println(""+mcd(20,10)+", "+mcd(20,8)+", "+mcd(20,6)+", "+mcd(72,16))   10, 4, 2, 8
 */