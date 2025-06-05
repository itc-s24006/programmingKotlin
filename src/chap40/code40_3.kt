package chap40

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("どの言語でもありそうな方法")
    for (item in list) {
        print(item)
    }

    println("\nKotlin ラムダ式を使った方法")
    list.forEach {
        print(it)
    }

    println("\nKotlin メンバ参照を使った方法")
    list.forEach(::print)

}