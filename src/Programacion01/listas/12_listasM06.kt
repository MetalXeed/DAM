package Programacion01.listas

/*
Circulo en matriz

Los puntos que forma parte de una circunferencia de radio r con centro (a,b) serán los infinitos puntos (x,y) que cumplen la siguiente ecuación

O bien, elevando todo al cuadrado obtenemos la ecuación:

lo que podemos razonar gráficamente

La ecuación del círculo se obtiene  simplemente sustituyendo el = por <= para incluir todos los puntos que están “dentro”

Si te fijas,  la ecuación de la circunferencia puede entenderse como una aplicación del teorema de Pitágoras.

A menudo queremos trabajar con un círculo o circuferencia dentro de un plano. El plano lo podemos representar con una matriz.   Cada punto del plano lo representamos con una celda de la matriz de forma que las coordenadas [fila][columna] de una matriz representan a las coordenadas (x,y) de un punto del plano. No podemos por lo tanto representar con este sistema  todos los puntos del plano, ya que hay infinitos y con valores reales, y con los índices de la matriz sólo podemos representar coordenadas de números enteros, pero ya con esto podemos resolver muchos problemas.

SE PIDE:  Leer por teclado  la dimensión de una matriz cuadrada. La dimensión siempre será impar y mayor que 0,  de  una matriz cuadrada. A continuación  dibujar el mayor círculo  que puede contener  dicha matriz. El punto centro del círculo será la celda central de la matriz.  Las celdas que pertenece al círculo se  imprimen como '\u25a0'  y las que no con ' '.  Se visualizará una suerte de círculo , lógicamente para ver un círculo sin "escalones" necesitaríamos trabajar con muchos más puntos que en el test.



Por ejemplo:
Entrada 	Resultado

15



                     ■
            ■  ■  ■  ■  ■  ■  ■
         ■  ■  ■  ■  ■  ■  ■  ■  ■
      ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
   ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
   ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
   ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
   ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
   ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
   ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
      ■  ■  ■  ■  ■  ■  ■  ■  ■  ■  ■
         ■  ■  ■  ■  ■  ■  ■  ■  ■
            ■  ■  ■  ■  ■  ■  ■
                     ■

 */