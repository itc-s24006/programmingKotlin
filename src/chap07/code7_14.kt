package chap07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0,100) //0以上100未満
    //aが0-59ならD
    //　 60-69ならC
    //　 70-79ならB
    //　 80-89ならA
    //　 90-  ならS
    //を a の値とともに出力する

    println(a)
    if (a < 60){
        println("D")
    }else if (a < 70){
        println("C")
    }else if (a < 80){
        println("B")
    }else if (a < 90){
        println("A")
    }else{
        println("S")
    }
}