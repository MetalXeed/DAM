package Programacion01.POO.basica

/*
K TimeLapse

Crea una clase denominada TimeLapse que nos permita almacenar instantes temporales. Los requerimientos de diseño de dicha clase son los siguientes:

    Definirá tres atributos denominados h, m y s donde almacenará un valor numérico de tipo entero que representan horas, minutos y segundos. Tanto los minutos como los segundos tendrán que estar en el rango: 0-59.
    Está garantizado que los casos de prueba que recibirá tu clase nunca provocaran valores mayores de Integer.MAX_VALUE.
    Un objeto TimeLapse se puede inicializar en su construcción
        Sin indicar parámetros lo que provoca que por defecto se inicialicen los atributos a 0
        Indicando  tres parámetros que representaran las horas, los minutos y los segundos (en ese orden)
        A partir de otro objeto TimeLapse
        Indicando un único valor numérico expresado en segundos.
    Proporcionará los siguientes métodos públicos:
        totalSec(), devuelve el número total de segundos
        reset(), inicializa a 0 los tres atributos
        addSec(sec:Int), añade el número indicado de segundos (los test nunca te enviarán segundos que generen objetos que necesiten más de 32 bits)
        addTime(t:TimeLapse), añade al tiempo atual el tiempo pasado como parámetro
    La impresión de objetos TimeLapse se ajustará al siguiente formato:

TimeLapse[<Horas>h:<Minutos>m:<Segundos>s]

A continuación se muestran una serie de casos de uso de la clase junto con los resultados esperados de la ejecución de dichos tests



Por ejemplo:
Prueba 	Resultado

var t1 = TimeLapse()
println(t1)
t1 = TimeLapse(3, 25, 42)
println(t1)
val t2 = TimeLapse(t1)
println(t2)
val t3 = TimeLapse(12930)
println(t3)



TimeLapse[0h:0m:0s]
TimeLapse[3h:25m:42s]
TimeLapse[3h:25m:42s]
TimeLapse[3h:35m:30s]

var t = TimeLapse()
t.h=5
t.m=20
t.s=50
println(t)
println(""+t.h + " " + t.m + " " + t.s)

println()
t = TimeLapse(5, 20, 50)
println(t.totalSec())



TimeLapse[5h:20m:50s]
5 20 50

19250

var t = TimeLapse(5, 20, 50)
t.reset()
println(t)

println()
t = TimeLapse(5, 50, 50)
t.addSec(10000)
println(t)

println()
t = TimeLapse(5, 50, 50)
t.addTime(TimeLapse(2, 46, 40))
println(t)



TimeLapse[0h:0m:0s]

TimeLapse[8h:37m:30s]

TimeLapse[8h:37m:30s]
 */

class TimeLapse(var h:Int=0,var m:Int=0,var s:Int=0){
    constructor(p:TimeLapse) :this(p.h,p.m,p.s)
    constructor(s:Int)       :this(0,0,0){
        this.addSec(s)
    }

    fun totalSec():Int{
        return s + m*60 + h * 3600
    }
    fun reset(){
        this.h = 0
        this.m = 0
        this.s = 0
    }
    fun addSec(s:Int){
        if( (this.s + s) > 59){
            var modulo1  = (this.s + s) % 60
            var cociente = (this.s + s) / 60
            this.s=modulo1

            if ((this.m+cociente)>59){
                var modulo2   = (this.m + cociente) % 60
                var cociente2 = (this.m + cociente) / 60
                this.m = modulo2
                this.h += cociente2

            }else this.m += cociente
        }else this.s += s

    }
    fun addTime(t:TimeLapse) {
        var restoSegundos  = (this.s + t.s) % 60
        var acarreoMinutos = (this.s + t.s) / 60
        var restoMinutos   = (this.m + t.m + acarreoMinutos) % 60
        var acarreoHoras   = (this.m + t.m + acarreoMinutos) / 60


        if (acarreoMinutos==0) this.s+=t.s else this.s = restoSegundos
        if (acarreoHoras==0)   this.m+=t.m+acarreoMinutos else this.m = restoMinutos
        this.h+=t.h+acarreoHoras
    }

    override fun toString(): String {
        return "TimeLapse[${this.h}h:${this.m}m:${this.s}s]"
    }
}
fun main(){
    var t = TimeLapse(5, 20, 50)
    t.reset()
    println(t)

    println()
    t = TimeLapse(5, 50, 50)
    t.addSec(10000)
    println(t)

    println()
    t = TimeLapse(5, 50, 50)
    t.addTime(TimeLapse(2, 46, 40))
    println(t)
}