package Programacion01.bucles
/*

EL CUMPLE DE FRAN

Fran tiene grandes amigos que siempre invita a su cumpleaños. Sus amigos tiene dos características: les encanta la
 pizza y son terriblemente celosos. Todos los años por su cumple Fran invita a sus amigos  a pizza. Compra unas pizzas,
   las parte en trozos y le asigna a cada amigo un trozo. Ojo, todos los trozos deben ser del mismo tamaño para evitar
   peleas y dicho trozo tiene que ser el más grande posible teniendo en cuenta las pizzas disponibles. También hace la
    repartición de forma que nunca falte o sobre uno o más trozos para evitar peleas y escenas desagradables que ya
     tienen arruinado su cumpleaños en años anteriores. Por otro lado, hoy en día las pizzas están por las nubes y
      tiene que darle al coco para decidir entre las combinaciones buenas con cual se queda según sus posibilidades
       económicas.  Fran es un reputado programador de Python, pero últimamente esta algo desanimado con la tensión
       del cumple así que nos encarga a nosotro  escribir el código que resuelve el problema.

La entrada del programa consiste en una serie de casos de prueba. Cada caso de prueba consiste en dos líneas. En la
 primera línea contiene  un entero relativo a la  cantidad de pizzas y en la segunda línea otro entero que indica la
  cantidad de amigos del cumple. Como la vida está muy cara, se garantiza que jamás habrá más pizzas que amigos. Los
  casos de prueba de la entrada terminan cuando la entrada de pizzas es 0


La salida consistirá en indicar un número entero que representa  el número de trozos en los que hay que repartir las
pizzas de forma que todos sus amigos tienen asignado un único trozo y es el más grande posible, si la asignación no
 puede ser exacta de forma que sobra o falta algún trozo indicamos PELEA para alertar a Fran que rechace esta
  combinación.

Entrada 	Resultado

2           3
6
2           PELEA
5
0

 */

fun main(){
                                                 //var elementos:List<String>?
    var salida:MutableList<String> = mutableListOf("","","","","","","")
    var resultado:Int
    var contador:Int = 0

    var npiz:Int //= readlnOrNull()!!.toIntOrNull()
    var nper:Int //= readlnOrNull()

    do{
        resultado=0
        var npiz = readln().toInt()
        if(npiz<=0) break               //salimos del bucle si introducen nº pizzas 0
        nper = readln().toInt()
                                        //if (entrada == null) break
                                        //elementos = entrada!!.split(" ")
        when (nper%npiz) {
            0 -> salida[contador] = (nper / npiz).toString() //ES DIVISIBLE
            else -> salida[contador] = "PELEA" //NO ES DIVISIBLE
        }
        println(salida[contador])
        contador++
    }while(true)
}