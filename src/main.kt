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

 */
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