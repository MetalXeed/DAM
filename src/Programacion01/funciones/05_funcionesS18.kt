package Programacion01.funciones

/*
Serie de Nilakantha

El número Pi (π) es uno de los más importantes y fascinantes de las matemáticas. Equivale aproximadamente a 3,14 y es una constante que se utiliza para calcular la circunferencia de un círculo a partir del radio.

También es un número irracional, lo que significa que se pueden calcular un número infinito de decimales que no tienen un patrón repetitivo. Esto hace que sea difícil, pero no imposible, calcular con precisión el valor de Pi.

Un método para conocer su valor es la serie infinita de Nilakantha:

de forma que, cuantos más términos añadamos a la serie, más nos aproximaremos al valor real de Pi

Escribe un método estático denominado piNilakantha que reciba como argumento el número de términos de la serie empleados en el cálculo y que nos devuelva el valor de Pi resultante. En caso de que el argumento no sea un número natural {1,2,3,...}, se devolverá como resultado el valor 3.0



Por ejemplo:
Prueba 	                    Resultado

println(piNilakantha(0))    3.0
println(piNilakantha(1))    3.1666666666666665
println(piNilakantha(4))    3.1396825396825396
println(piNilakantha(-2))   3.0
println(piNilakantha(50))   3.1415907698497954

Respuesta:
 */

fun piNilakantha(num:Int):Double {
    var resultado:Double = 3.0

    for(i in 1..num){
        var x = i*2
        if (i%2==0){
            resultado-=(4.0/((x)*(x+1.0)*(x+2.0)))
        }else{
            resultado+=(4.0/((x)*(x+1.0)*(x+2.0)))}
    }
    return resultado
}
fun main(){
    println(piNilakantha(0))
    println(piNilakantha(1))
    println(piNilakantha(4))
    println(piNilakantha(-2))
    println(piNilakantha(50))
}