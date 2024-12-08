package Programacion01.Preparacion01

/*
Sentencias Condicionales
Las sentencias condicionales permiten ejecutar bloques de código basados en ciertas condiciones.

Ejemplos:
if, else if, else

when

kotlin
fun ejemploCondicional(n: Int) {
    if (n > 0) {
        println("n es positivo")
    } else if (n == 0) {
        println("n es cero")
    } else {
        println("n es negativo")
    }
}

fun ejemploWhen(x: Int) {
    when (x) {
        1 -> println("x es uno")
        2, 3 -> println("x es dos o tres")
        in 4..10 -> println("x está entre 4 y 10")
        !in 11..20 -> println("x no está entre 11 y 20")
        else -> println("x no cumple ninguna de las condiciones anteriores")
    }
}
Bucles
Los bucles permiten ejecutar un bloque de código varias veces.

Ejemplos:
for

while

do-while

kotlin
fun ejemploFor() {
    for (i in 1..5) {
        println("Iteración $i")
    }
}

fun ejemploWhile() {
    var i = 1
    while (i <= 5) {
        println("Iteración $i")
        i++
    }
}

fun ejemploDoWhile() {
    var i = 1
    do {
        println("Iteración $i")
        i++
    } while (i <= 5)
}
Funciones
Las funciones permiten encapsular bloques de código reutilizables.

Ejemplos:
Funciones simples

Funciones con parámetros y retorno

kotlin
fun saludar() {
    println("¡Hola, mundo!")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    saludar()
    println("La suma de 3 y 4 es ${sumar(3, 4)}")
}
Listas
Las listas son colecciones ordenadas de elementos.

Métodos más importantes:
add, remove, get, set, size, contains

kotlin
val lista = mutableListOf(1, 2, 3, 4, 5)
lista.add(6)
lista.remove(2)
println(lista.get(0))
println(lista.size)
println(lista.contains(4))
Arrays
Los arrays son colecciones de tamaño fijo de elementos del mismo tipo.

Métodos más importantes:
size, get, set

kotlin
val array = arrayOf(1, 2, 3, 4, 5)
println(array.size)
array[0] = 10
println(array.get(0))
Mapas
Los mapas son colecciones de pares clave-valor.

Métodos más importantes:
put, get, remove, containsKey, containsValue, size

kotlin
val mapa = mutableMapOf("A" to 1, "B" to 2, "C" to 3)
mapa.put("D", 4)
println(mapa.get("A"))
mapa.remove("B")
println(mapa.containsKey("C"))
println(mapa.containsValue(4))
println(mapa.size)
Recursividad
La recursividad es una técnica en la que una función se llama a sí misma.

Ejemplos:
Factorial

Fibonacci

kotlin
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun fibonacci(n: Int): Int {
    return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    println("Factorial de 5: ${factorial(5)}")
    println("Fibonacci de 10: ${fibonacci(10)}")
}
Listas/Arrays 2D
Las listas y arrays 2D son colecciones bidimensionales de elementos.

Ejemplos:
Crear y acceder a elementos en listas/arrays 2D

kotlin
val matriz = arrayOf(
    intArrayOf(1, 2, 3),
    intArrayOf(4, 5, 6),
    intArrayOf(7, 8, 9)
)

for (fila in matriz) {
    for (elemento in fila) {
        print("$elemento ")
    }
    println()
}

val lista2D = mutableListOf(
    mutableListOf(1, 2, 3),
    mutableListOf(4, 5, 6),
    mutableListOf(7, 8, 9)
)

lista2D[0][0] = 10
println(lista2D[0][0])
Este esquema cubre las estructuras de datos y conceptos más importantes que has mencionado y te proporcionará una guía rápida para repasarlos antes de tu examen. Si necesitas más detalles sobre algún tema o algún ejercicio específico, ¡háblame! ¡Buena suerte en tu examen! 😊📘🚀

y stringbuilder?
¡Claro! StringBuilder es una clase muy útil en Kotlin para construir y manipular cadenas de caracteres de manera eficiente. Es especialmente útil cuando necesitas realizar múltiples operaciones de concatenación de cadenas en un bucle, ya que es más eficiente que concatenar cadenas directamente con el operador +.

Métodos y Funciones Importantes de StringBuilder
Construcción y Inicialización
StringBuilder(): Crea un StringBuilder vacío.

StringBuilder(initialCapacity: Int): Crea un StringBuilder con una capacidad inicial especificada.

StringBuilder(seq: CharSequence): Crea un StringBuilder que contiene la misma secuencia de caracteres que el argumento.

Operaciones Comunes
append(value: Any): Añade el valor especificado al final del StringBuilder.

insert(offset: Int, value: Any): Inserta la representación de cadena del argumento en la posición especificada.

delete(start: Int, end: Int): Elimina la subsecuencia de caracteres comenzando en el índice start y extendiéndose hasta el índice end - 1.

deleteCharAt(index: Int): Elimina el carácter en el índice especificado.

reverse(): Invertir los caracteres en el StringBuilder.

setCharAt(index: Int, ch: Char): Establece el carácter en la posición especificada.

toString(): Convierte el contenido del StringBuilder a una String.

Ejemplos en Kotlin
Ejemplo 1: Construcción de una Cadena
kotlin
fun main() {
    val sb = StringBuilder()
    sb.append("Hola")
    sb.append(" ")
    sb.append("mundo!")
    println(sb.toString())  // Output: Hola mundo!
}
Ejemplo 2: Inserción y Eliminación
kotlin
fun main() {
    val sb = StringBuilder("Hola mundo!")
    sb.insert(5, "hermoso ")
    println(sb.toString())  // Output: Hola hermoso mundo!

    sb.delete(5, 13)
    println(sb.toString())  // Output: Hola mundo!
}
Ejemplo 3: Invertir una Cadena
kotlin
fun main() {
    val sb = StringBuilder("Hola mundo!")
    sb.reverse()
    println(sb.toString())  // Output: !odnum aloH
}
Ejemplo 4: Reemplazar un Carácter en una Posición Específica
kotlin
fun main() {
    val sb = StringBuilder("Hola mundo!")
    sb.setCharAt(0, 'h')
    println(sb.toString())  // Output: hola mundo!
}
Ventajas de Usar StringBuilder
Eficiencia: StringBuilder es más eficiente que la concatenación de cadenas con el operador +, especialmente en bucles.

Flexibilidad: Puedes realizar varias operaciones de modificación de cadenas como inserciones, eliminaciones y reemplazos de manera sencilla.

Mutable: A diferencia de las cadenas de caracteres (String) que son inmutables, StringBuilder permite modificar el contenido sin crear nuevas instancias.

Conclusión
StringBuilder es una herramienta poderosa y eficiente para la manipulación de cadenas en Kotlin, especialmente cuando necesitas realizar múltiples modificaciones en una cadena. Si tienes algún otro tema o funcionalidad que quieras repasar, ¡háblame! 😊📘🚀

y String?
En Kotlin, las cadenas (String) son una secuencia de caracteres. Las cadenas son inmutables, lo que significa que no se pueden cambiar después de haber sido creadas. Sin embargo, Kotlin ofrece una amplia gama de métodos y funciones para trabajar con cadenas de manera eficiente y expresiva.

Métodos y Funciones Importantes de String
Creación e Inicialización
Literal de cadena:

kotlin
val cadena = "Hola, mundo"
Raw string (cadena bruta): Usa triple comillas para cadenas multilínea.

kotlin
val cadenaMultilinea = """
    Esta es una cadena
    que abarca múltiples
    líneas.
""".trimIndent()
Operaciones Comunes
Concatenación:

kotlin
val saludo = "Hola"
val nombre = "Mundo"
val mensaje = saludo + ", " + nombre + "!"
println(mensaje)  // Output: Hola, Mundo!
Acceso a caracteres:

kotlin
val cadena = "Kotlin"
val primerCaracter = cadena[0]  // 'K'
Longitud:

kotlin
val longitud = cadena.length  // 6
Subcadenas:

kotlin
val subcadena = cadena.substring(1, 4)  // "otl"
Búsqueda:

kotlin
val indice = cadena.indexOf('o')  // 1
val ultimaOcurrencia = cadena.lastIndexOf('o')  // 4
Métodos de Manipulación de Cadenas
Transformación:

kotlin
val mayusculas = cadena.toUpperCase()  // "KOTLIN"
val minusculas = cadena.toLowerCase()  // "kotlin"
Reemplazo:

kotlin
val reemplazada = cadena.replace("Kot", "Bot")  // "Botlin"
División:

kotlin
val cadena = "uno,dos,tres"
val partes = cadena.split(",")  // ["uno", "dos", "tres"]
Eliminar espacios en blanco:

kotlin
val cadenaConEspacios = "  Hola, Mundo!  "
val sinEspacios = cadenaConEspacios.trim()  // "Hola, Mundo!"
Interpolación de Cadenas
Kotlin soporta la interpolación de cadenas, lo que permite incrustar expresiones dentro de cadenas.

Ejemplo de Interpolación:
kotlin
val nombre = "Kotlin"
val saludo = "Hola, $nombre!"
println(saludo)  // Output: Hola, Kotlin!

val edad = 5
val mensaje = "Kotlin tiene $edad años."
println(mensaje)  // Output: Kotlin tiene 5 años.

val longitud = "La longitud de la cadena '$nombre' es ${nombre.length}."
println(longitud)  // Output: La longitud de la cadena 'Kotlin' es 6.
Métodos de Coincidencia y Comparación
Igualdad:

kotlin
val cadena1 = "Hola"
val cadena2 = "hola"
println(cadena1 == cadena2)  // false
println(cadena1.equals(cadena2, ignoreCase = true))  // true
Coincidencia de patrones:

kotlin
val cadena = "123-456"
val regex = "\\d{3}-\\d{3}".toRegex()
println(cadena.matches(regex))  // true
Ejemplos de Uso Completo
Concatenación y Subcadenas:
kotlin
fun ejemploCadenas() {
    val mensaje = "Bienvenido a Kotlin"
    val nombre = mensaje.substring(13)  // "Kotlin"
    println("Hola, $nombre!")  // Output: Hola, Kotlin!

    val saludo = "Hola"
    val completo = saludo + " " + nombre + "!"
    println(completo)  // Output: Hola Kotlin!
}
Manipulación de Cadenas:
kotlin
fun transformarCadena(cadena: String): String {
    val reemplazada = cadena.replace(" ", "_")
    val sinEspacios = reemplazada.trim()
    return sinEspacios.toUpperCase()
}

fun main() {
    val original = "  hola mundo   "
    val transformada = transformarCadena(original)
    println(transformada)  // Output: HOLA_MUNDO
 */