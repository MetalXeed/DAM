package Programacion01.POO.basica

/*
MyLittleDecimal
Queremos simular el funcionamiento de la clase java BigDecimal creando una versión de pacotilla de la misma que se llamará MyLittleDecimal. Nuestro MyLittleDecimal será capaz de ofrecer al usuario números decimales de coma fija, pero con muchas limitaciones, por ejemplo, siempre trabaja con dos decimales.  El funcionamiento de MyLittleDecimal se basará en que opera internamente con int, nunca con float ni double(para evitar los consabidos problemas de la aritmética flotante). En esta práctica, en ni una sóla línea de código pueden aparecer los tipos double o float.

Internamente, el objeto MyLittleDecimal almacena un int que representa un número con dos decimales. Por ejemplo:

entero almacenado 	decimal representado
0 	0,00
1 	0,01
10 	0,10
100 	1,00
1000 	10,00


La parte entera no tiene límite de cifras salvo las impuestas por el almacenamiento con 32 bits del valor (int)

Por lo tanto,  MyLittleDecimal tiene un atributo int que representa como indicamos la cantidad decimal y ese atributo debe ser private. Es su único atributo y cumplir esto es obligatorio.

A continuación comentamos los servicios que debe ofrecer la clase.

Creación de objetos MyLittleDecimal

Los objetos se crean a través de  un constructor con  parámetro tipo String que contenga el número tal cual lo teclea el usuario por ejemplo: “333,22” “45,00”   “1,01” etc.. Recuerda que el usuario siempre tiene que teclear dos decimales, ni más ni menos y se asumé que siempre lo hará bien. Por tanto,   el trabajo  del constructor será pasar este string a un int. El int  es lo que se  almacenará en el  atributo de la clase. Por ejemplo  para “333,22”  el constructor lo guarda en el atributo  como 33322   “45,00” cómo 4500   “1,01” como 101 etc.

toString()

El objeto almacena el decimal como un int pero  al usuario se lo presenta como un número con coma decimal , por ejemplo, si internamente almacena 10499 lo devuelve como 104,99. Es decir, hace lo contrario que el constructor.

sumar()

suma dos MyLittleDecimal y devuelve el resultado en un nuevo objeto MyLittleDecimal

restar()

resta dos MyLittleDecimal y devuelve el resultado en un nuevo objeto MyLittleDecimal

multiplicar()

Recuerda que almacenamos sólo dos decimales. Si multiplicamos dos números de dos decimales el resultado es un número con 4 decimales. Desprecia los dos decimales menos significativos. Devuelve el resultado en un nuevo objeto MyLittleDecimal

dividir()

Podemos trabajar fácilmente con los enteros internos para obtener un resultado con prescisión 2.

D*100/d= D/d

Devuelve el resultado en un nuevo objeto MyLittleDecimal

Por ejemplo:
Prueba 	Resultado

var mld1 = MyLittleDecimal("200,22")
var mld2 = MyLittleDecimal("10,11")
var mld3=mld1.sumar(mld2);
println(""+mld1.valor+" "+mld2.valor+" "+mld3.valor)
println(mld3)
mld1 = MyLittleDecimal("5000,05")
mld2 = MyLittleDecimal("2,00")
mld3=mld1.multiplicar(mld2)
println(mld3)
mld1 = MyLittleDecimal("100,00")
mld2 = MyLittleDecimal("300,00")
mld3=mld1.dividir(mld2)
println(mld3)



20022 1011 21033
210,33
10000,10
0,33

var mld1 = MyLittleDecimal("-200,22")
var mld2 = MyLittleDecimal("10,11")
var mld3=mld1.sumar(mld2)
println(""+mld1.valor+" "+mld2.valor+" "+mld3.valor)
println(mld3)
mld1 = MyLittleDecimal("-200,22")
mld2 = MyLittleDecimal("10,11")
mld3=mld1.restar(mld2)
println(mld3)
mld1 = MyLittleDecimal("-1,00")
mld2 = MyLittleDecimal("3,00")
mld3=mld1.multiplicar(mld2)
println(mld3)
mld1 = MyLittleDecimal("-1,00")
mld2 = MyLittleDecimal("-3,00")
mld3=mld1.multiplicar(mld2)
println(mld3)



-20022 1011 -19011
-190,11
-210,33
-3,00
3,00
 */
/* intento
class MyLittleDecimal(var numero:String="0"){
    val numSeparado = numero.split(",")
    val enteros = numSeparado[0].padStart(2,'0')
    val decimales = numSeparado[1].padEnd(2, '0').take(2)
    var valor: Int = "$enteros$decimales".toInt()


    fun sumar(n:MyLittleDecimal):MyLittleDecimal{
        val resultado=MyLittleDecimal()
        resultado.valor = this.valor + n.valor
        return  resultado

    }
    fun restar(n:MyLittleDecimal):MyLittleDecimal{
        val resultado=MyLittleDecimal()
        resultado.valor = this.valor - n.valor
        return  resultado

    }
    fun multiplicar(n:MyLittleDecimal):MyLittleDecimal{
        val resultado=MyLittleDecimal()
        resultado.valor = this.valor * n.valor
        resultado.valor = resultado.valor.toString().dropLast(2).toInt()
        return  resultado
    }
    fun dividir(n:MyLittleDecimal):MyLittleDecimal{
        var y=MyLittleDecimal()
        y.valor = this.valor*100 / n.valor
        return  y
    }

    override fun toString(): String {
        val valorStr = valor.toString().padStart(3, '0') // Asegura al menos tres dígitos
        val enteros = valorStr.dropLast(2)
        val decimales = valorStr.takeLast(2)
        return "$enteros,$decimales"
    }
}

 */
class MyLittleDecimal(var numero: String = "0") {
    // Asegura que siempre haya dos decimales
    var valor: Int = numero.replace(",", "").toInt()


    fun sumar(n: MyLittleDecimal): MyLittleDecimal {
        val resultado = MyLittleDecimal()
        resultado.valor = this.valor + n.valor
        return resultado
    }

    fun restar(n: MyLittleDecimal): MyLittleDecimal {
        val resultado = MyLittleDecimal()
        resultado.valor = this.valor - n.valor
        return resultado
    }

    fun multiplicar(n: MyLittleDecimal): MyLittleDecimal {
        val resultado = MyLittleDecimal()
        resultado.valor = (this.valor * n.valor) / 100
        return resultado
    }

    fun dividir(n: MyLittleDecimal): MyLittleDecimal {
        val resultado = MyLittleDecimal()
        resultado.valor = (this.valor * 100) / n.valor
        return resultado
    }

    override fun toString(): String {
        val valorStr:String
        if (this.valor<0){
            val tempString = valor.toString().replace("-", "").padStart(3, '0')
            valorStr = "-"+ tempString //valor.toString().replace("-", "").padStart(3, '0').padStart(4,'-') // Asegura al menos tres dígitos
        }else valorStr = valor.toString().padStart(3, '0') // Asegura al menos tres dígitos
        val enteros = if(valorStr.contains("-")) valorStr.dropLast(2) else valorStr.dropLast(2)
        val decimales = valorStr.takeLast(2)
        return "$enteros,$decimales"
    }
}
fun main(){
    var mld1 = MyLittleDecimal("-200,22")
    var mld2 = MyLittleDecimal("10,11")
    var mld3=mld1.sumar(mld2)
    println(""+mld1.valor+" "+mld2.valor+" "+mld3.valor)
    println(mld3)
    mld1 = MyLittleDecimal("-200,22")
    mld2 = MyLittleDecimal("10,11")
    mld3=mld1.restar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("-1,00")
    mld2 = MyLittleDecimal("3,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
    mld1 = MyLittleDecimal("-1,00")
    mld2 = MyLittleDecimal("-3,00")
    mld3=mld1.multiplicar(mld2)
    println(mld3)
}