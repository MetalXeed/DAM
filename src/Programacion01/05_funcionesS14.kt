package Programacion01

/*
zodiaco

Horóscopo: fechas de cada signo

    Aries: del 21 de marzo al 19 de abril
    Tauro: del 20 de abril al 20 de mayo
    Géminis: del 21 de mayo al 20 de junio
    Cáncer: del 21 de junio al 22 de julio
    Leo: del 23 de julio al 22 de agosto
    Virgo: del 23 de agosto al 22 de septiembre
    Libra: del 23 de septiembre al 22 de octubre
    Escorpio: del 23 de octubre al 21 de noviembre
    Sagitario: del 22 de noviembre al 21 de diciembre
    Capricornio: del 22 de diciembre al 19 de enero
    Acuario: del 20 de enero al 18 de febrero
    Piscis: del 19 de febrero al 20 de marzo

Se pide escribir dos funciones. Un dado un nombre de mes lo pasa a su número de mes correspondiente (del 1 al 12).
Otra dado un día y un número de mes calcula el signo del zodiaco. Se podía hacer todo en la función zodiaco() pero
se deben evitar las funciones con varios cometidos para mejorar la calidad del código y además así practicamos la
 interacción entre funciones.

Observa el test para escribir las funciones correspondientes en tu solución.

Por ejemplo:
Prueba

fun main(){
println(zodiaco(15, mesANumero("MAYO")))
println(zodiaco(21, mesANumero("DICIEMBRE")))
println(zodiaco(13, mesANumero("FEBRERO")))
println(zodiaco(14, mesANumero("OCTUBRE")))
println(zodiaco(16, mesANumero("SEPTIEMBRE")))
}

Resultado:
Tauro
Sagitario
Acuario
Libra
Virgo

Respuesta:
 */
fun zodiaco(ndia:Int,nmes:Int):String {
    if (nmes==1&&ndia<=19)return "Capricornio"
    else if (nmes==1&&ndia>=19)return "Acuario"
    else if (nmes==2&&ndia<=18)return "Acuario"
    else if (nmes==2&&ndia>=19)return "Piscis"
    else if (nmes==3&&ndia<=20)return "Piscis"
    else if (nmes==3&&ndia>=21)return "Aries"
    else if (nmes==4&&ndia<=19)return "Aries"
    else if (nmes==4&&ndia>=20)return "Tauro"
    else if (nmes==5&&ndia<=20)return "Tauro"
    else if (nmes==5&&ndia>=21)return "Géminis"
    else if (nmes==6&&ndia<=20)return "Geminis"
    else if (nmes==6&&ndia>=21)return "Cáncer"
    else if (nmes==7&&ndia<=22)return "Cáncer"
    else if (nmes==7&&ndia>=23)return "Leo "
    else if (nmes==8&&ndia<=22)return "Leo"
    else if (nmes==8&&ndia>=23)return "Virgo"
    else if (nmes==9&&ndia<=22)return "Virgo"
    else if (nmes==9&&ndia>=23)return "Libra"
    else if (nmes==10&&ndia<=22)return "Libra"
    else if (nmes==10&&ndia>=23)return "Escorpio"
    else if (nmes==11&&ndia<=21)return "Escorpio"
    else if (nmes==11&&ndia>=22)return "Sagitario"
    else if (nmes==12&&ndia<=21)return "Sagitario"
    else if (nmes==12&&ndia>=22)return "Caprivornio"
    else return ""
}
fun mesANumero(nmes:String):Int{
    when (nmes.lowercase()) {
        "enero"->return 1
        "febrero"->return 2
        "marzo"->return 3
        "abril"->return 4
        "mayo"->return 5
        "junio"->return 6
        "julio"->return 7
        "agosto"->return 8
        "septiembre"->return 9
        "octubre"->return 10
        "noviembre"->return 11
        "diciembre"->return 12
        else->return 0
    }
}

fun main(){
    println(zodiaco(15, mesANumero("MAYO")))
    println(zodiaco(21, mesANumero("DICIEMBRE")))
    println(zodiaco(13, mesANumero("FEBRERO")))
    println(zodiaco(14, mesANumero("OCTUBRE")))
    println(zodiaco(16, mesANumero("SEPTIEMBRE")))
}