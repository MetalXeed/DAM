package Programacion01.POO.sintaxisBasica

/*
Baraja por palos

Para practican enum

Creo una baraja sin 8s y 9s.

Una baraja encapsula una lista de objetos Carta. Cada  carta se describe por su palo y
su número

Por ejemplo:
Prueba 	Resultado

 val baraja = Baraja()
 println(baraja.cartas)//usa toString de lista
 val c:Carta=baraja.cartas[0]
 println(c.palo.ordinal)



[(BASTOS, 1), (BASTOS, 2), (BASTOS, 3), (BASTOS, 4), (BASTOS, 5), (BASTOS, 6), (BASTOS, 7), (BASTOS, 10), (BASTOS, 11), (BASTOS, 12), (COPAS, 1), (COPAS, 2), (COPAS, 3), (COPAS, 4), (COPAS, 5), (COPAS, 6), (COPAS, 7), (COPAS, 10), (COPAS, 11), (COPAS, 12), (ESPADAS, 1), (ESPADAS, 2), (ESPADAS, 3), (ESPADAS, 4), (ESPADAS, 5), (ESPADAS, 6), (ESPADAS, 7), (ESPADAS, 10), (ESPADAS, 11), (ESPADAS, 12), (OROS, 1), (OROS, 2), (OROS, 3), (OROS, 4), (OROS, 5), (OROS, 6), (OROS, 7), (OROS, 10), (OROS, 11), (OROS, 12)]
0
 */
enum class Palos{
    BASTOS, COPAS, ESPADAS, OROS
}
class Carta(var palo:Palos, var numero:Int){
    override fun toString(): String {
        return "($palo, $numero)"
    }
}
class Baraja(){
    val p = Palos.values()
    var cartas:MutableList<Carta> = mutableListOf()//lista de cartas
    init{

        for (f in p){
            for (i in 1..7){
                cartas.add(Carta(f,i))

            }
            for (j in 10..12){
                cartas.add(Carta(f,j))

            }
        }
    }

    override fun toString(): String {
        return cartas.toString()
    }
}
fun main(){
    val baraja = Baraja()
    println(baraja.cartas)//usa toString de lista
    val c:Carta=baraja.cartas[0]
    println(c.palo.ordinal)
}

//solucion de clase
/*
enum class Palo {
    BASTOS, COPAS, ESPADAS, OROS,
}

class Carta(val palo: Palo, val numero: Int) {
    override fun toString(): String {
        return "($palo, $numero)"
    }
}


class Baraja {
    //baraja española de 40 cartas. No hay 8 y 9.

    var cartas= mutableListOf<Carta>()


    init {
        //crea una baraja  por palos y números
        val numeros= mutableListOf(1,2,3,4,5,6,7,10,11,12)
        for (p in Palo.values()) {//en ultimas versiones se puede usar entries
            for (n in numeros) {
                cartas.add(Carta(p, n))
            }
        }
    }


}
 */