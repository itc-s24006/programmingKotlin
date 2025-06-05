package chap37

fun main() {
    //無名関数 アクセスするために変数に代入する
    val p = fun(x: Double, y: Double): Double =  x + y
    val m = fun(x: Double, y: Double): Double = x - y
    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}