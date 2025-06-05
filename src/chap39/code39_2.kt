package chap39

fun main() {
    //無名関数を変数に入れる手間を省いてそのままラムダ式をぶっこんでる
    printResult({x, y -> x + y}) //p264 (1)
    printResult(){x, y -> x + y} //(2)
    printResult{x, y -> x + y} //(3) 最終形態

}

fun printResult(calculator: (x: Double, y: Double) -> Double) {
    val result = calculator(10.0, 2.0)
    println("計算結果: ${result}")
}
