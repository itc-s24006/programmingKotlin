package chap21

//関数の定義
fun main() {
    val answer: Int = getThreeTimes(5)
    println(answer)
}

fun getThreeTimes(value: Int): Int {
    return value * 3
}