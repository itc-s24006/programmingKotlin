package chap17

fun main() {
    val a: MutableList<String> = mutableListOf(
        "こんにちは","Kotlin","どうぞ","よろしく"
    )
    a.removeAt(2) //要素削除
    for ((i, x) in a.withIndex()) {
        println("${i} :  ${x}")
    }
}