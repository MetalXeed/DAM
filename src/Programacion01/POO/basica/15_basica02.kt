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