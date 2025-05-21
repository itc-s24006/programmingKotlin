package chap17

fun main() {
    val a: List<Int> = listOf(1000, 1200, 1500)

    //インデックスを指定して値を参照
    println("1年目の時給は${a[0]}円です。")
    println("2年目の時給は${a[1]}円です。")
    println("3年目の時給は${a[2]}円です。")

    //forループで値を参照
    for (money in a) {
        println("時給は${money}円です")
    }

    //forループでインデックスと値を同時に参照
    for ((index, money) in a.withIndex()){
        println("${index+1}年目の時給は ${money}です。")
    }
 }