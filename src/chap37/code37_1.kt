package chap37

import kotlin.random.Random

fun main() {
    val p = ::calculatePlus
    val m = ::calculateMinus
    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}

//実際の処理を記述する関数
fun  calculatePlus(x: Double, y: Double) = x + y
fun  calculateMinus(x: Double, y: Double) = x - y

//関数の使い方を定義する関数(関数オブジェクトを受け取る)
// パラメータ: (受け取るパラメーターの方) -> 戻り値の型
fun printRandomValuesCalculation(calculator: (Double, Double) -> Double) {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("計算結果は${result}です。")
}