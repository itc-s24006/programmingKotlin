package chap17

fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは","Kotlin","よろしく")
    //.add()　引数にインデックスを指定したらねじ込める。省略だと末尾に追記
    a.add(2,"どうぞ")
    //この書き方でも末尾に追記できる
    a += "お願いします"
    for ((i, x) in a.withIndex()) {println("${i} :  ${x}")}
}