package Programacion01

/*
imc con ayuda de funciones

recuerda la fórmula imc

imc = pesoKg / (alturaMetros * alturaMetros)

y recuerda la tabla IMC

imc < 18.5 -> "Bajo peso"
imc < 24.9 -> "Peso normal"
imc < 29.9 -> "Sobrepeso"
else -> "Obesidad"

Se pide que escribas las funciones calcularIMC e interpretarIMC descritas en el test
no tienes que escribir ninguna función main, sólo el código de las funciones.

Por ejemplo:
Prueba

val peso = 74.0 // en kilogramos
val altura = 1.66 // en metros
val imc=calcularIMC(peso, altura)
val descripcion=interpretarIMC(imc)
println("$imc , $descripcion")

Resultado
26.854405574103644 , Sobrepeso

Respuesta:
 */
fun calcularIMC(peso:Double,altura:Double):Double {
    return (peso/(altura*altura))
}
fun interpretarIMC(imc: Double): String{
    when(imc){
        in 0.0..18.49->return ("Bajo peso")
        in 18.5..24.89->return ("Peso normal")
        in 24.9..29.89->return ("Sobrepeso")
        else ->return ("Obesidad")
    }
}