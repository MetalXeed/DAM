package Programacion01.PF.basicos

/*
Usar funciones locales

Escribe una función numerosPrimos() que utilice como función local la siguiente función

numerosPrimos() es una función que acepta una lista de enteros y devuelve una nueva lista  de enterosque contiene sólo los enteros que son primos de la lista anterior.

Para escribir la función numerosPrimos() utiliz la función esPrimo() como local

fun esPrimo(numero: Int): Boolean {
 if (numero <= 1) {
 return false
 }
 for (i in 2..numero / 2) {

      if (numero % i == 0) {
          return false
}
}

return true
}



Por ejemplo:
Prueba 	Resultado

val numeros = listOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
val primos = numerosPrimos(numeros)
println(primos)



[2, 3, 5, 7]

 */
fun numerosPrimos(listado:List<Int>):List<Int>{
    var listaPrimos = mutableListOf<Int>()
    fun esPrimo(numero:Int):Boolean{
        if (numero <= 1) {
            return false
        }
        for (i in 2..numero / 2) {

            if (numero % i == 0) {
                return false
            }
        }

        return true
    }
    for (i in listado) if(esPrimo(i)) listaPrimos.add(i)
    return listaPrimos
}
fun main(){
    val numeros = listOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primos = numerosPrimos(numeros)
    println(primos)
}
/*
fun numerosPrimos(l:List<Int>):List<Int>{
    fun esPrimo(numero: Int): Boolean {
        if (numero <= 1) {
            return false
        }

        for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
            if (numero % i == 0) {
                return false
            }
        }

        return true
    }
    var nuevaLista= mutableListOf<Int>()
    for(n in l){
        if(esPrimo(n))  nuevaLista.add(n)
    }
    return nuevaLista

}
 */