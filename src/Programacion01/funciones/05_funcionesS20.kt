package Programacion01.funciones

/*
Veni, vidi, vici

En criptografía, el cifrado César es una de las técnicas de cifrado más simples y más usadas. Es un tipo de cifrado por sustitución en el que una letra en el texto original es reemplazada por otra letra que se encuentra un número fijo de posiciones más adelante en el alfabeto. Por ejemplo, con un desplazamiento de 3, la A sería sustituida por la D (situada 3 lugares a la derecha de la A), la B sería reemplazada por la E, etc. Para descifrar el mensaje, no tenemos más que realizar el mismo desplazamiento pero en sentido contrario. Este método debe su nombre a Julio César, que lo usaba para comunicarse con sus generales.

Deberás implementar un método denominado cesar que aceptará dos parámetros: el texto a cifrar y el desplazamiento. El método devolverá el texto cifrado en mayúsculas. Se omitirá el cifrado de cualquier carácter no alfabético (dígitos, signos de puntuación, espacios,...), que se mantendrán en el texto tal cuál están.

Debes tener en cuenta que el alfabeto de sustitución es rotativo, es decir, con el desplazamiento de 3 caracteres del ejemplo anterior, una X se convertiría en una A, una Y en una B y una Z en una C.

Con objeto de simplificar el problema, se garantiza que las entradas sólo contienen caracteres del alfabeto inglés, aunque podría haber mayúsculas y minúsculas y que el desplazamiento d  cumple que // -26<=d<=26

Por ejemplo:
Prueba

println(cesar("Alea iacta est", 3))
println(cesar("Ave, Caesar, morituri te salutant", 7))
println(cesar("VW VCODKGP, DTWVQ?", -2))
println(cesar("a",-1))
println(cesar("a",-26))


Resultado:
DOHD LDFWD HVW
HCL, JHLZHY, TVYPABYP AL ZHSBAHUA
TU TAMBIEN, BRUTO?
Z
A

Respuesta:
 */
fun cesar(frase:String,desp:Int):String{
    var posicion:Int
    var letra:String
    var respuesta:String = ""

    var elementos=frase.uppercase().split("").drop(1).dropLast(1)
    val alfabeto= ('A'..'Z').joinToString("").split("").drop(1).dropLast(1)
    for (i in elementos){
        posicion = alfabeto.indexOf(i)+desp
        if ((posicion)>alfabeto.size-1){
            var n = (posicion/alfabeto.size)
            posicion -= alfabeto.size*n}

        else if((posicion)<0) {
            var n = (posicion / alfabeto.size)

            if (n > 0) posicion += alfabeto.size * n
            else posicion += alfabeto.size
        }
        if(i in alfabeto) {
            //posicion = alfabeto.indexOf(i)+desp
            respuesta = "$respuesta${alfabeto[posicion]}"
        }
        else respuesta = "$respuesta${i}"
    }

    return respuesta
}

fun main(){
    println(cesar("Alea iacta est", 3))
    println(cesar("turi te salutant", 7)) //Ave, Caesar, mori
    println(cesar("VW VCODKGP, DTWVQ?", -2))
    println(cesar("a",-1))
    println(cesar("a",-26))
}