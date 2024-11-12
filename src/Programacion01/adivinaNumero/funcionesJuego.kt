
//declaración de funciones:
fun generarNumero():List<Int>{                     //devuelve una lista de 4 cifras sin repetidos.
    var nposibles = (1..6).toList()          //valores posibles del 1 al 6
    var cifra= nposibles.shuffled().take(4)     //tomo 4 valores unicos
    return cifra
}
fun comprobarNumeros(lista1: List<Int>,lista2: List<Int> ):Pair<Int,Int>{ //devuelve los numeros desordenados.
    var aciertosValor = 0
    var aciertosPosicion = 0
    var listaJugada = lista1.toMutableList()
    var listaGenerada = lista2.toMutableList()

    //comprobarmos aciertos de posicion y los quitamos de la lista.
    for (i in listaJugada.indices){
        if (listaJugada[i] == listaGenerada[i]) {
            aciertosPosicion ++
            //println(aciertosPosicion) borrar
            listaJugada[i]=0 // 0 no está dentro de los posibles valores.
        }
    }
    //comprobarmos aciertos de valor
    for (i in listaJugada.indices){
        if (listaJugada[i] in listaGenerada) {
            aciertosValor ++
        }
    }
    return Pair(aciertosPosicion, aciertosValor)
}

fun aListaDigitos(n:String): List<Int>{ //convertimos los valores
    return n.map { it.toString().toInt()}
}
fun mostrarResultado(jugada:String,aciertos:Int,coincidencias:Int){
    println("${BOLD}${CYAN}JUGADA${RESET}  | ${BOLD}${GREEN}ACIERTOS${RESET}  | ${BOLD}${YELLOW}COINCIDENCIA${RESET}")
    println("---------------------------------")
    println("${BOLD}${CYAN}${jugada}${RESET}      ${BOLD}${GREEN}${aciertos}${RESET}           ${BOLD}${YELLOW}${coincidencias}${RESET}")
}
fun jugar(){
    var aciertos =0
    var coincidencias = 0
    var intentos = 3                                     //total 4 intentos.
    var nsecreto = generarNumero()                       //Lo que el jugador intenta adivinar
    saveResultado(nsecreto.joinToString(""))    //guardado en el registro

    //ENTRADA DE DATOS
    print("teclea un numero de 4 cifras sin números repetidos: ")
    var entrada = readLine()!!
    var jugada = aListaDigitos(entrada)
    var (aP1, aV1) = comprobarNumeros(jugada,nsecreto)
    aciertos = aP1
    coincidencias= aV1

    while ((aciertos < 4) && (intentos > 0)){

        saveResultado(jugada.joinToString(""),aciertos,coincidencias,4-intentos)
        mostrarResultado(jugada.joinToString(""),aciertos,coincidencias)

        //ENTRADA DE DATOS
        print("Teclea un numero de 4 cifras sin digitos repetidos: ")
        entrada = readLine()!!
        jugada = aListaDigitos(entrada)

        var (aP2, aV2) = comprobarNumeros(jugada,nsecreto)
        aciertos = aP2
        coincidencias= aV2
        intentos --
        //saveResultado(jugada.joinToString(""),aciertos,coincidencias,4-intentos)
    }

    mostrarResultado(jugada.joinToString(""),aciertos,coincidencias)
    if (aciertos == 4){
        saveResultado(4-intentos)
        println("Enorabuena, has acertado el númeo secreto ${nsecreto.joinToString("")} en ${4-intentos} intentos")
    }else{
        saveResultado(jugada.joinToString(""),aciertos,coincidencias,4-intentos)
        println("Los siento, no has acertado el númeo secreto ${nsecreto.joinToString("")} en 4 intentos")
    }
}