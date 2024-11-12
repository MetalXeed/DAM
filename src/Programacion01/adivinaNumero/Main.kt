
// Código menú principal
fun mostrarMenu(){
    println("${BOLD}${CYAN}_____________MENU_____________")
    println("1. Jugar")
    println("2. Ver traza de último intento")
    println("3. Salir")
    print("opción: ${RESET}")
}
fun main() {
    clearResultado()//vaciamos fichero de resultados
    mostrarMenu()
    var inputMenu:Int= readLine()!!.toInt()
    while(inputMenu != 3){
        when (inputMenu){
            1 -> jugar()
            2 -> println(getResultado())
        }
        mostrarMenu()
        inputMenu= readLine()!!.toInt()
    }
    println("Gracias por jugar")
    clearResultado()//vaciamos fichero de resultados
}