package chap39

import kotlin.random.Random

fun main() {
    randomNumberCalculate(6){ it * 2 }

    randomNumberCalculate(100){
        val square = it * it
        val cubic = square * it
        cubic
    }
}

//maxで受け取った数を最大値としたランダムな数値を生成して返す関数
fun randomNumberCalculate(max: Int, calclator:(Int) -> Int){
    //一番最後のパラメータが関数かつ、ラムダ式で記述する場合、

    val targetNumber = Random.nextInt(max+1)
    val result = calclator(targetNumber)
    println("計算結果: $result")
}