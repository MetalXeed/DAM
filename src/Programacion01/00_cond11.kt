package Programacion01/*

Radares de tramo

basado en

https://www.aceptaelreto.com/pub/problems/v001/12/st/statements/Spanish/index.html

La Dirección Particular de Tráfico (DPT) está empeñada en hacer que los conductores respeten los límites de velocidad.
 Sin entrar en si es por razones de seguridad, por ahorrar combustible, o con un mero afán recaudatorio, ahora sabemos
  que además de los radares fijos tradicionales, están poniendo en funcionamiento los radares de tramo.

Desde un punto de vista formal, estos radares se basan en el teorema de Lagrange (también llamado de valor medio o de
 Bonnet-Lagrange), que dice que si tienes una función continua en un intervalo cerrado y derivable en el intervalo
  abierto, entonces algún punto de ese intervalo abierto tendrá derivada instantánea igual a la pendiente media de
   la curva en el intervalo cerrado.

Aunque asuste a primera vista, la repercusión es sencilla: si hacemos un viaje desde Madrid a Zaragoza y nuestra
 velocidad media es de 111Km/h, forzosamente en algún punto del camino, nuestra velocidad ha sido de 111Km/h.

Los radares de tramo consisten en colocar dos cámaras en dos puntos alejados de una carretera para poder comprobar
 cuánto tiempo ha tardado el coche en recorrer ese tramo. Si la velocidad media supera la velocidad máxima permitida,
  gracias al teorema anterior podremos saber (aunque no le hayamos visto) que en algún punto del trayecto ha superado
   esa velocidad. Por ejemplo, si colocamos las cámaras separadas 10Km en un tramo cuya velocidad está limitada a
    110Km/h, y un coche tarda 5 minutos en ser visto por la segunda cámara, sabremos que su velocidad media ha sido
     de 120Km/h, y por tanto en algún sitio ha superado el límite de velocidad aunque al pasar por debajo de las dos
      cámaras el coche fuera a 80Km/h.

ENTRADA:

Cada caso de prueba consistirá en tres números: el primero será la distancia (en metros) que separan las dos cámaras,
 el segundo indicará la velocidad máxima permitida en todo ese tramo (en Km/h) y el tercer y último número indicará
                                                        el número de segundos que ha tardado un coche en recorrer el
                                                         tramo. Todos esos números serán enteros.

SALIDA:

Para cada caso de prueba, el programa generará una línea, indicando si el coche debe ser multado o no. En concreto,
 indicará "OK" si el coche no superó la velocidad máxima, indicará "MULTA" si se superó esa velocidad en menos de un
  20% de la velocidad máxima permitida, y "PUNTOS" si la velocidad fue superada en un 20% o más de esa velocidad;
   en ese caso además de la multa se le quitarán puntos del carnet.

El sistema de radar puede fallar y registrar entradas incorrectas. Se consideran incorrectos los valores de entrada
 menores o igual a 0.  En esos casos, el sistema mostrará la cadena "ERROR".

Nota: Utiliza aritmética punto flotante con double para hacer las operaciones.

 */

fun main() {
    val entrada = readln()
    val lectura = entrada.split(" ")
    val distancia = lectura[0].toInt() // unidad m
    val velmax = (lectura[1].toDouble()*(1000.0/3600.0))    // unidad Km/h a m/s
    val ttramo = lectura[2].toDouble()    // unidad s
    val vmt = (distancia)/(ttramo)     // unidad m/s
    val limitem = (velmax+velmax*(20.0/100.0))

    if (distancia>0&&velmax>0&&ttramo>0){ // check for negative values
        when(vmt){
            in 0.0..velmax-0.001 -> println("OK")
            in velmax .. (limitem-0.001) -> println("MULTA")
            in (limitem).. Double.MAX_VALUE -> println("PUNTOS")
        }
    }else println("ERROR")
}
