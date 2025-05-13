package chap07

fun main() {
    val delicious = false
    val cheap = false
    println("このレストランは美味しい: $delicious")
    println("このレストランは安い: $cheap")
    val letsEat = delicious && cheap
    println("食事する?: $letsEat")
}