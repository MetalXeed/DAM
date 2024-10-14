package Programacion01.funciones

/*
Imprimir tabla de multiplicar

Escribe una función imprimirTabla() que imprime la tabla de multiplicar del primer argumento. La tabla acaba donde indica el segundo argumento.

Por ejemplo:
Prueba

imprimirTabla(3,4)
imprimirTabla(6,5)

Resultado

Tabla de multiplicar del 3 hasta el 4
======================================
3*1=3
3*2=6
3*3=9
3*4=12

Tabla de multiplicar del 6 hasta el 5
======================================
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
 */
fun imprimirTabla(num1:Int, num2:Int){
    println("Tabla de multiplicar del $num1 hasta el $num2")
    println("======================================")
    for (i in 1..num2) {
        println("$num1*$i=${num1*i}")
    }
    println()
}