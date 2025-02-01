package Programacion01.POO.basica

/*
MINI STRINGBUILDER

Es famosa la ineficiencia de los Strings cuando concatenamos cadenas de caracteres en el cuerpo de un
bucle ya que la continua creación y destrucción de objetos genera un lastre en el rendimiento. Si la
eficiencia prima sobre la seguridad podemos usar en este tipo de situaciones StringBuilder.

StringBuilder se basa al igual que String en la manipulación interna de un array de caracteres pero
lo hace de forma diferente ya que su contexto de uso es diferente.

StringBuilder utiliza  un array de caracteres a modo de buffer para almacenar los caracteres de la
cadena,   de forma que en el momento de crear el objeto StringBuilder,  el buffer va a ser siempre
mayor que la cadena de caracteres que quiere almacenar. Si posteriormente  queremos que la cadena
crezca, los nuevos caracteres  pueden ocupar las posiciones libres del buffer sin necesidad de crear
un nuevo buffer de más capacidad. Lógicamente, si no hay suficientes posiciones libres entonces no
queda más remedio que crear un nuevo buffer con más capacidad. Eligiendo un tamaño apropiado de buffer
se consigue reducir drásticamente la generación de nuevos buffer sin provocar un estropicio en el
consumo de memoria.  Observa que cada vez que se crea un nuevo buffer porque el viejo se nos queda
pequeño se copia la información del viejo en el nuevo y  se incorpora la nueva información  y finalmente  quedarán posiciones libres para futuras inserciones.

Nuestra clase MiniSB

Queremos escribir una clase MiniSB que emule en cierta medida a las famosas StringBuilder de java y
kotlin para ello:

    la clase gestionará un  buffer basado en un array de caracteres

    se llevara la cuenta de la zona efectivamente ocupada en un momento a traves de un indice apuntador
    que llamaremos contentSize. ContenSize indica el tamaño de la zona ocupada, si lo interpretas como
    un índice, es el índice donde comienzan las posiciones libres del buffer.

    cuando se crea un MiniSB: se crea un buffer con el doble del tamaño del string que tiene que alojar
    de inmediato, le quedarán por tanto posiciones libres para ser usadas en el futuro

     cuando se añaden caracteres a un MiniSB ya existente: puede ocurrir que no existan suficientes
     posiciones libres para almacenar a todos. En este caso necesito crear dentro del MiniSB un buffer
     mayor y se calcula su tamaño igual que en el constructor del MiniSB,  con el doble del tamaño
     necesario para la cadena final que quiero almacenar.

     el resto de la operativa se deduce de los test de prueba.



Por ejemplo:
Prueba 	Resultado

var miniSB = MiniSB("123")
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
println(miniSB)
miniSB.append("456")
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
println(miniSB)
miniSB.append("7")
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
println(miniSB)
miniSB = MiniSB()
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
println(miniSB)
miniSB.append("12")
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
println(miniSB)



6, 3
123
6, 6
123456
14, 7
1234567
0, 0

4, 2
12

val miniSB = MiniSB("Eran dos tipos requete finos")
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
miniSB.deleteFromIndex(4)
println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
println(miniSB)
miniSB.reverse()
println(miniSB)



56, 28
56, 4
Eran
narE

 */

data class MiniSB(var entrada:String=""){
    var contentSize:Int
    var buffer: CharArray

    init{
        contentSize=entrada.length
        buffer = CharArray(contentSize * 2)

        for (i in entrada.indices) {
            buffer[i] = entrada[i]
        }

    }

    fun append(entrada:String){
        for (i in entrada) {
            this.buffer[] = this.buffer + i
            contentSize++
        }

    }
    fun deleteFromIndex(){}
    fun reverse(){}

    override fun toString(): String {
        return String(buffer, 0, contentSize)
    }
}

fun main(){
    var miniSB = MiniSB("123")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.append("456")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.append("7")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB = MiniSB()
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
    miniSB.append("12")
    println(""+miniSB.buffer.size + ", " + miniSB.contentSize)
    println(miniSB)
}
