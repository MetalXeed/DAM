package Programacion01.PF.basicos

/*
Mejorar MyLittleDecimal

En POO resolvimos un problema con la clase MyLittleDecimal. Aquí usamos  una versión reducida de la clase MyLittleDecimal. Esta clase se incluye en el test.

Se quiere extender su funcionalidad de forma que puedan sumarse dos objetos MyLittleDecimal con el operador + tal y como pretende hacer  main(), que dará error de compilación hasta que se extienda esta característica.

Por ejemplo:
Prueba 	Resultado

class MyLittleDecimal(valorEnString: String) {
    var valor: Int = 0

    init {

        this.valor = valorEnString.replace(",", "").toInt()
    }

    fun sumar(otro: MyLittleDecimal): MyLittleDecimal {
        val suma = this.valor + otro.valor
        return MyLittleDecimal(suma.toString())
    }

}

fun main() {
    val sumando1 = MyLittleDecimal("2,12")
    val sumando2 = MyLittleDecimal("0,10")
    val suma1=sumando1.sumar(sumando2)
    println(suma1.valor )
    val suma2=sumando1 + sumando2
    println(suma2.valor)

}



222
222
 */