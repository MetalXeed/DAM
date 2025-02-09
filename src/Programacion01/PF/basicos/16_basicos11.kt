package Programacion01.PF.basicos

/*
Para practicar pasar una función como argumento de diferentes formas

completa el siguiente código en el argumento indicado



fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // 1. Usando la fun standard sumar
    val resultado1 = aplicarOperacion(5, 3, /*argumento que es una función*/)
    println("Resultado con función estándar: $resultado1")

    // 2. Usando una función anónima
    val resultado2 = aplicarOperacion(5, 3, /*argumento que es una función*/)
    println("Resultado con función anónima: $resultado2")

    // 3. Usando una lambda
    val resultado3 = aplicarOperacion(5, 3, /*argumento que es una función*/)
    println("Resultado con lambda: $resultado3")

    // 4. Usando una lambda con sintaxis especial de último argumento
    val resultado4 = aplicarOperacion(5, 3) /*argumento que es una función con sintaxis especial lambda último argumento*/
    println("Resultado con lambda sintaxis especial: $resultado4")
}


Para el caso 4 deberás usar trailing lambda

Por ejemplo:
Resultado

Resultado con función estándar: 8
Resultado con función anónima: 8
Resultado con lambda: 8
Resultado con lambda sintaxis especial: 8

 */
fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // 1. Usando la fun standard sumar
    val resultado1 = aplicarOperacion(5, 3, ::suma)
    println("Resultado con función estándar: $resultado1")

    // 2. Usando una función anónima
    val resultado2 = aplicarOperacion(5, 3, fun(a:Int,b:Int):Int{return a+b})
    println("Resultado con función anónima: $resultado2")

    // 3. Usando una lambda
    val resultado3 = aplicarOperacion(5, 3, { a:Int,b:Int -> a+b})
    println("Resultado con lambda: $resultado3")

    // 4. Usando una lambda con sintaxis especial de último argumento
    val resultado4 = aplicarOperacion(5, 3) {a,b->a+b} /*argumento que es una función con sintaxis especial lambda último argumento*/
    println("Resultado con lambda sintaxis especial: $resultado4")
}
