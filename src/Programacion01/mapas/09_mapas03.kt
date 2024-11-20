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



Junior
Buenisimos 3 Malisimos 0
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
fun procesarResultados(resultados: List<String>): MutableMap<String, Int> {
    val puntuaciones = mutableMapOf<String, Int>()
    for (resultado in resultados) {
        val datos = resultado.split(" ")
        val parejaCasa = datos[0]
        val setsCasa = datos[1].toInt()
        val parejaVisitante = datos[2]
        val setsVisitante = datos[3].toInt()
    // Inicializar puntuaciones si no están presentes
    puntuaciones.putIfAbsent(parejaCasa, 0)
        puntuaciones.putIfAbsent(parejaVisitante, 0)
    // Actualizar puntuaciones
    if (setsCasa > setsVisitante) {
        puntuaciones[parejaCasa] = puntuaciones[parejaCasa]!! + 2
        puntuaciones[parejaVisitante] = puntuaciones[parejaVisitante]!! + 1 }
    else { puntuaciones[parejaCasa] = puntuaciones[parejaCasa]!! + 1
        puntuaciones[parejaVisitante] = puntuaciones[parejaVisitante]!! + 2 } }
    return puntuaciones }
fun contarNoJugados(totalEquipos: Int, totalResultados: Int): Int {
    val totalPartidosEsperados = totalEquipos * (totalEquipos - 1)
    return totalPartidosEsperados - totalResultados }
fun contarEquipos(resultados: List<String>): Int {
    val equipos = mutableListOf<String>()
    for (resultado in resultados) {
        val datos = resultado.split(" ")
        val parejaCasa = datos[0]
        val parejaVisitante = datos[2]
        if (!equipos.contains(parejaCasa)) {
            equipos.add(parejaCasa) }
        if (!equipos.contains(parejaVisitante)) {
            equipos.add(parejaVisitante) } }
    return equipos.size }
fun main() { val categorias = mutableMapOf<String, MutableList<String>>()
    var linea: String
    linea = readLine()!!
    while (linea != "FIN") {
        val nombreCategoria = linea
        val resultados = mutableListOf<String>()
        linea = readLine()!!
        while (linea != "FIN") {
            resultados.add(linea)
            linea = readLine()!!
        }
        categorias[nombreCategoria] = resultados
        linea = readLine()!! }
    for ((categoria, resultados) in categorias) {
        val totalEquipos = contarEquipos(resultados)
        val puntuaciones = procesarResultados(resultados)
        val partidosNoJugados = contarNoJugados(totalEquipos, resultados.size)
    // Determinar la pareja ganadora
    val maxPuntos = puntuaciones.values.maxOrNull()
        val ganadores = puntuaciones.filterValues { it == maxPuntos }.keys
        val resultado = if (ganadores.size == 1) ganadores.first() else "EMPATE"
        println("$resultado $partidosNoJugados") }
}



