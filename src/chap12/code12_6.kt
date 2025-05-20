package chap12

import kotlin.random.Random

//if式 + Range で実装
fun main() {
    val score = Random.nextInt(50, 100)

    // ..< 未満
    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    //code11_13をwhenに置き換え
    val judge = when (score) {
        in 0 ..< borderC -> "D"
        in borderC ..< borderB -> "C"
        in borderB ..< borderA -> "B"
        in borderA ..< borderS -> "A"
        else -> "S"
    }
    println(score)
    println(judge)

}