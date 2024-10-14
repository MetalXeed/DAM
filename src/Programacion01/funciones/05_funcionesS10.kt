package Programacion01.funciones

/*
Cálculo de edad

Observa los test y escribe las funciones correspondientes. ¡Sin main()!

Por ejemplo:
Prueba

//formato fechas "dd/mm/aaaa"
var edad = calcularEdad("24/09/1968", "25/09/2023")  // calcularEdad(fechaNacimiento, fechaActual)
println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
edad = calcularEdad("24/09/1968", "24/09/2023")
println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
edad = calcularEdad("24/09/1968", "23/09/2023")
println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
edad = calcularEdad("24/09/2020", "24/09/2023")
println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")

Resultado
Tu edad es: 55 años, eres mayor de edad
Tu edad es: 55 años, eres mayor de edad
Tu edad es: 54 años, eres mayor de edad
Tu edad es: 3 años, eres menor de edad

Respuesta:
 */

fun esMayorDeEdad(edad:String):String{
    if(edad.toInt() >=18)return("eres mayor de edad")
    else return ("eres menor de edad")
}

fun calcularEdad(fnac:String, fact:String):String {
    var fecha1 = fnac.split("/")
    var fecha2 = fact.split("/")
    if (fecha1[1] > fecha2[1]) {
        return ((fecha2[2].toInt() - fecha1[2].toInt() - 1).toString())
    } else if (fecha1[1] == fecha2[1]) {
        if (fecha1[0] > fecha2[0]) {
            return ((fecha2[2].toInt() - fecha1[2].toInt() - 1).toString())
        }else return ((fecha2[2].toInt() - fecha1[2].toInt()).toString())
    }else return ((fecha2[2].toInt() - fecha1[2].toInt()).toString())
}
