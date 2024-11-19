package Programacion01.mapas

/*
Liga de pádel

http://www.aceptaelreto.com/problem/statement.php?id=109



Los organizadores de las ligas de pádel de Hill Valley no conocen los ordenadores, de manera que siguen anotando los
resultados de cada enfrentamiento en un cuaderno, algo increíble teniendo en cuenta que las ligas que manejan pueden
tener hasta 2000 parejas distintas.

Al final de la temporada, terminan teniendo tanto lío, que no saben qué pareja es la ganadora de cada categoría. Por
si eso fuera poco, durante el invierno, bien debido a las inclemencias meteorológicas o a lesiones de los participantes,
algunos de los partidos de cada jornada no se disputan. El problema es que los jugadores no lo avisan, por lo que los
organizadores no apuntan nada en el cuaderno. Afortunadamente, se sabe que todas las parejas han llegado a jugar algún
partido.

Haz un programa que ayude a aclarar la situación al final de la temporada.
Entrada

Como entrada, recibirá el nombre de la categoría, seguido de todos los resultados anotados sobre ella. Un resultado se
compondrá del nombre de la pareja que juega "en casa", el número de sets que ha ganado, seguido del nombre de la pareja
visitante, y el número de sets ganados, separados por espacio. Tanto los nombres de las categorías como de las parejas
estarán compuestos de una única palabra de un máximo de 16 letras.

Cada categoría acabará con la palabra FIN.

Por su parte, la entrada terminará con una categoría de nombre FIN.
Salida

La salida del programa indicará, para cada categoría, el nombre de la pareja ganadora. En caso de empate, se mostrará
EMPATE. Por cada victoria, la pareja se llevará 2 puntos, por cada derrota se llevará 1, y la no asistencia no sumará
ningún punto. Recuerda que en pádel no hay posibilidad de que un partido acabe empatado.

Además de la pareja ganadora (si la hay), también indicará el número de partidos no jugados al final de la liga. Ten en
cuenta que las ligas tienen ida y vuelta.





Por ejemplo:
Entrada 	                Resultado

Junior                      Buenisimos 2
Buenisimos 3 Malisimos 0    EMPATE 0
Buenillos 2 Malillos 1
Buenillos 3 Malisimos 0
Buenisimos 3 Malillos 0
Buenisimos 2 Buenillos 1
Malisimos 0 Buenisimos 3
Malillos 1 Buenillos 2
Malisimos 0 Buenillos 3
Malillos 0 Buenisimos 3
Buenillos 1 Buenisimos 2
FIN
Senior
Abuelos 3 Abueletes 0
Abueletes 2 Abuelos 1
FIN
FIN


 */

/*solucion sin utilizar mapas
fun procesarCategoria(entradas: List<String>, indexInicial: Int): Int {
    var index = indexInicial
    val categoria = entradas[index]
    index ++
    val resultados = mutableMapOf<String, Int>()
    val partidos = mutableMapOf<Pair<String, String>, Boolean>()
    var totalPartidos =
        0 // Procesamos cada línea hasta encontrar "FIN"
    while (index < entradas.size) {
        val line = entradas[index]
        if (line == "FIN") {
            index++
            break
        }
        // Dividimos la línea en partes y extraemos los datos
        val parts = line.split(" ")
        val equipoLocal = parts[0]
        val setsLocal = parts[1].toInt()
        val equipoVisitante = parts[2]
        val setsVisitante = parts[3].toInt()
        // Actualizamos los puntos de las parejas según el resultado del partido
        if (setsLocal > setsVisitante) {
            resultados[equipoLocal] = resultados.getOrDefault(equipoLocal, 0) + 2
            resultados[equipoVisitante] = resultados.getOrDefault(equipoVisitante, 0) + 1
        } else {
            resultados[equipoVisitante] = resultados.getOrDefault(equipoVisitante, 0) + 2
            resultados [equipoLocal] =
            resultados.getOrDefault(equipoLocal, 0) + 1
        }
// Registramos el partido en el mapa de partidos
        partidos[Pair(equipoLocal, equipoVisitante)] = true
        partidos [Pair(equipoVisitante, equipoLocal)] = true
        totalPartidos ++
        index++
    }
// Determinamos el ganador de la categoría
    val maxPuntos = resultados.maxByOrNull { it.value }?.value ?: 0
    val ganadores = resultados.filter { it.value == maxPuntos }.keys
// Imprimimos el resultado según si hay empate o no
    if (ganadores.size > 1) {
        println("EMPATE ${totalPartidos - partidos.size / 2}")
    } else {
        println("${ganadores.first()} ${totalPartidos - partidos.size / 2}")
    }
    return index
}

fun main() {
// Leemos todas las entradas de una vez
    val entradas = generateSequence(::readLine).toList()
    var index = 0
// Procesamos las entradas hasta encontrar "FIN"
    while (index < entradas.size) {
        val categoria = entradas[index] if (categoria == "FIN") break
// Procesamos cada categoría y actualizamos el índice
        index = procesarCategoria(entradas, index)

 */