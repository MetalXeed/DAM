//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}


fun combinar(longitud: Int, numeros: List<String>): List<String> {
    val result = mutableListOf<String>()
    if (longitud == 1) {
        return numeros
    }
    val sublista = combinar(longitud - 1, numeros)

    for (numero in numeros) {
        for (numeroCombinado in sublista) {
            result.add(numero + numeroCombinado)
        }
    }
    return result
}

fun main() {
    val numeros = listOf("1", "2", "3")

    println("todas las combinaciones de 1, 2 y 3 con longitud 3")
    val longitud = 3
    val result = combinar(longitud, numeros)
    for (s in result) {
        println(s)
    }
}

 */

fun main() {
    var letra = ('Z' - 'a')
    var resultado = letra.toChar()
    println("${'Z'.code - 'A'.code}")
    val cadena = "Hola mundo y adios universo"
    println("mundo" in cadena)
    println(cadena.contains("mundo"))
    var (a, b, c, d) = listOf(1, 2, 3, 4)
    print("$a $b $c $d\n")
    var (uno, dos, tres, cuatro) = listOf(1, 2, 3, 4, 5, 6, 7)
    print("$uno $dos $tres $cuatro\n")
    val fromZeroToFive = 0.rangeTo(5)
    println(fromZeroToFive) // 0..5
    val lista = (1..5).toList()
    println(lista)
    var numPalabras = 0
    /*
    var linea = readlnOrNull()
    if(linea==null)
        println("entrada de datos finalizada")
    else
        println(linea)
    mietiqueta@
    for(i in 1..3) {
        for(j in 1..3) {
            for (k in 1..3) {
                println("$i $j $k")
                if (i ==2 && j==2 && k ==2) {
                    break@mietiqueta //rompe el for asociado a la etiqueta que es el for o que está justo debajo de la etiqueta
                }
            }
        }
    }
    for (i in 1..10){
        for (j in 1 until (i+1)){
            print("*")
        }
        println()
    }


    for (x in 1..10){
        for (j in 1 until (10 - x+1)){
            print(" ")
        }
        for (j in 1 until (x+1)){
            print("*")
        }
        println()
    }
    //multiplicacion recur
    fun multiplicar(a:Int,b:Int):Int{
        if (b==1) return a

        return a + multiplicar(a,b-1)

    }
    println(multiplicar(5,5))

    fun factorial(a:Int):Int{
        if (a==1) return 1
        return a * factorial(a-1)
    }
    println(factorial(5))


    var s = "hola"
    s = s + " mundo"
    s = "X" + s.substring(1)
    println(s)

    val sb = StringBuilder("hola")
    sb.append(" mundo")
    sb[0]='X'           // o con sb.setCharAt(0, 'X')
    println(sb)

    //es habitual pasar de StringBuilder a String y viceversa
    val s2 = "hola"
    val sb2 = StringBuilder(s2) //crear StringBuilder a partir de String, es una forma de pasar String a StringBuilder
    sb2.append(" mundo")
    val s3= sb2.toString() //pasar STringBuilder en String
    println(s3)
    var lista2 = List(1){0}

    val lista2D = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    println(lista2D.joinToString(" ").map {it.digitToInt()})




    val impares = arrayOfNulls<Int>(3)//no funciono
    for (i in 0..2){
        impares.map {it -> impares[i]=i+1}
    }
    println(impares.contentToString())

    //el tipo se infiere pero lo ponemos para visualizarlo
    val miArrayDeChar:CharArray = charArrayOf('H', 'e', 'l', 'l', 'o')

    println("Elemento en la posición 0: ${miArrayDeChar[0]}")
    println("Elemento en la posición 3: ${miArrayDeChar[3]}")

    // Convertir CharArray a String, una necesidad frecuente
    val miString: String = String(miArrayDeChar)
    println("CharArray convertido a String: $miString")

    //crear un CharArray de un tamaño especificado inicializando sus elementos a '\u0000'
    val otroArray= CharArray(5)
    for(c in otroArray) println(c)
    println("chao")



    val miMapa = mapOf(111 to "Pepe",222 to "Julieta",333 to "Romeo",444 to "Pepe",555 to "Chuly")
    var valorde111= miMapa[111]
    println(valorde111)
    valorde111=miMapa.get(111)
    println(valorde111)
    println(miMapa[9999])//no existe esta clave


    val er1=Regex("hola[0-9]")
    val er2=("[0-9]adios").toRegex()
    println(er1.matches("hola1"))
    println(er2.matches("1adios"))

     */
    val er = Regex("hola[0-9]")
    val texto = "a todos vosotros, os digo hola1 y después hola2"

    // Realiza la búsqueda
    val resultadoFind = er.find(texto)

    // Verifica si se encontró alguna coincidencia
    if (resultadoFind != null) {
        println(resultadoFind.value)
    } else {
        println("No se encontraron coincidencias")
 Regex
    }
}