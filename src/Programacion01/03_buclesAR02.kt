package Programacion01
/*

ARTRÓPODOS

En la clase de naturales de Alberto están estudiando los artrópodos. Son animales invertebrados dotados de
 un esqueleto externo y apéndices articulados. Ha aprendido que se dividen en insectos, arácnidos, crustáceos
 y miriápodos. Le llama mucho la atención que en esta clase de animales el número de patas sea tan variable:
 6 en el caso de los insectos, 8 en el de los arácnidos y 10 en el de los crustáceos. Los miriápodos son aun
 más fascinantes: su cuerpo se divide en segmentos, una cantidad distinta para cada especie; y pueden tener 2
  patas por cada segmento (ciempiés/escolopendras) o 4 patas por cada segmento (milpiés).

El fin de semana tenía como tarea reunir la mayor cantidad de artrópodos posible para llevarlos el lunes a
 clase y enseñarlos a sus compañeros. Así que exploró en el jardín de su urbanización y cazó unos cuantos
  insectos y arácnidos; fue a la marisquería del mercado y guardó algunos crustáceos en la nevera; y finalmente
   entró en la tienda de animales de su barrio donde le prometieron que el lunes le llevarían al colegio animales
    algo peligrosos como escorpiones y escolopendras. Después de tanto buscar, de los miriápodos solo ha
     conseguido las escolopendras de la tienda, y como no los ha visto aún, no sabe cuántos anillos tienen.
      El lunes se habían juntado con una buena colección de animales y la profesora, aprovechando las
      circunstancias les puso un problema de matemáticas: calcular el número de patas de todos los animales
       que allí había.
Entrada

La entrada comienza con un número indicando la cantidad de casos de prueba que deberán procesarse. Cada caso
 de prueba está compuesto por cinco números separados entre ellos por un espacio en blanco. El primero indica
  el número de insectos (6 patas), el segundo el número de arácnidos (8), el tercero el número de crustáceos
  (10). El cuarto y el quinto representan, respectivamente, el número de escolopendras y el número de anillos
  de las mismas (todas tienen el mismo). Recuerda que las escolopendras tienen 2 patas por anillo.
Salida

Para cada caso de prueba, el programa escribirá el número de patas. Se garantiza que en ningún caso este número
 será mayor que 1.000.000.000.

Por ejemplo:
Entrada 	Resultado

2               54
1 1 1 1 15      462
2 3 1 4 52

 */


fun main() {
    var n = readln().toInt()
    var resultado = 0

    for (i in 1..n) {

        var entrada = readln().split(" ")

        var nins = entrada[0].toInt()
        var nara = entrada[1].toInt()
        var ncru = entrada[2].toInt()
        var nesc = entrada[3].toInt()
        var nani = entrada[4].toInt()

        resultado = 6*nins + 8*nara + 10*ncru + nesc * nani * 2

        println(resultado)
    }
}