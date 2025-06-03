package chap34

import kotlin.math.sqrt

fun main() {
    val number1 = null
    val number2 = 10

    printCubicSquareRoot(number1)
    printCubicSquareRoot(number2)
}

//数を３乗して平方根を求める
fun printCubicSquareRoot(num: Int?) {
    //returnを書いたらnullの時点でif外の処理は通らず関数抜ける
    //下の処理が長い場合はreturnを書いたほうが下まで読まなくていいから処理速度がはやい
    if (num == null){
        println("nullなのでなにもしない")
        return
    }
    val result = sqrt((num * num * num).toDouble())
    println("${num}を3乗した数の平方根は,${result}です。")
}