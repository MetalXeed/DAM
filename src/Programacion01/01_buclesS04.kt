package Programacion01
/*

Sumar n números multiples veces hasta que no hay más datos

Ejercicio para familizarizarse con el sistema de entrada/salida

Similar al ejercicio de que hace sumas hasta que n vale 0 pero ahora no hay un n con valor 0, se detecta
 directamente el final de los datos. Usamos para ello la función readlnONull() que se comporta como readln()
  pero detecta el fin de la entrada y cuando esto ocurre devuelve null.

Entrada 	Resultado

3           6
1 2 3       15
1           3
15
4
1 1 1 0

2           2
1 1         3
3
1 1 1


 */

fun main() {

    var elementos:List<String>?
    var salida: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)
    var resultado:Int
    var contador:Int = 0

    var n:Int? //= readlnOrNull()!!.toIntOrNull()
    var entrada:String? //= readlnOrNull()

    do{
        resultado=0
        var intermedio = readlnOrNull()
        if (intermedio == null) break
        n = intermedio?.toInt()
        entrada = readlnOrNull()
        if (entrada == null) break
        elementos = entrada!!.split(" ")

        if(n!=null) {
            for (i in 0..n-1) {
                resultado+=elementos[i].toInt()
                salida[contador] = resultado
            }
        }
        println(salida[contador])
        contador++
    }while(true)
}

/*   var elementos:List<String>?
   var salida: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)
   var resultado:Int = 0
   var contador:Int = 0

   var n:Int? = readlnOrNull()!!.toIntOrNull()
   var entrada:String? = readlnOrNull()

   while((entrada != null && entrada!!.isNotEmpty() && n != null)){
       var intermedio = readlnOrNull()
       n = intermedio.toIntOrNull()
       entrada = readlnOrNull()
       elementos = entrada!!.split(" ")
       if (n != null) {
           for (i in 0..n-1) {
               salida[contador] = resultado + elementos!![i].toInt()
           }
       }
       print(salida[contador])
       contador++
   }

}*/