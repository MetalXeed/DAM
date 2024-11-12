import java.io.File

fun saveResultado(nsecreto:String){
    var resultado = File("ultimaJugada.txt").appendText("Número secreto:${nsecreto}\n")
}
fun saveResultado(intento:Int){
    var resultado = File("ultimaJugada.txt").appendText("Acertado el número secreto en el intento ${intento}")
}
fun saveResultado(jugada:String, aciertosP:Int,aciertosV:Int,intento:Int){
    var resultado = File("ultimaJugada.txt").appendText("Intento: ${intento}: ${jugada}, Aciertos: ${aciertosP}, Coincidencias: ${aciertosV}\n")
}
fun getResultado():String{
    val resultado = File("ultimaJugada.txt").readText()
    return resultado
}
fun clearResultado(){ //elimina el contenido del fichero
    File("ultimaJugada.txt").writeText("")
}