package chap39

//ラムダ式 {}で囲む
fun main() {
    val plus1: (Double, Double) -> Double = fun(x: Double, y: Double) : Double {
        return x + y
    }
    val plus2: (Double, Double) -> Double = fun(x: Double, y: Double)  = x + y
    val plus3: (Double, Double) -> Double = {x, y -> x + y}

    println(plus1(10.0, 2.0))
    println(plus2(10.0, 2.0))
    println(plus3(10.0, 2.0))

}