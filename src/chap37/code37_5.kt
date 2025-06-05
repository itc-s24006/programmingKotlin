package chap37

fun main() {
    val p1 = fun(x: Double, y: Double) = x + y
    val p2 = fun(x: Double, y: Double): Double = x + y
    //{}で記述するときは、①returnを必ず書く　②戻り値の型省略できない
    val p3 = fun(x: Double, y: Double): Double {
        return x + y
    }
    val p4: (Double, Double) -> Double = fun(x: Double, y: Double): Double {
        return x + y
    }
    val p5: (Double, Double) -> Double = fun(x, y) = x + y

    printRandomValuesCalculation(p1)
    printRandomValuesCalculation(p2)
    printRandomValuesCalculation(p3)
    printRandomValuesCalculation(p4)
    printRandomValuesCalculation(p5)


}