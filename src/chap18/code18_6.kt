package chap18

fun main() {
    //code18_5
    val x = mutableListOf("あ","い","う","え","お")
    println("リスト内の要素数：" + x.count())
    println(x)
    x.add("あ")
    x.add("あ")
    x.add("あ")
    println("リスト内の要素数：" + x.count())
    println(x)
    println("---------")

    val y = mutableSetOf("あ","い","う","え","お")
    println("セット内の要素数：" + y.count())
    println(y)
    y.add("あ")
    y.add("あ")
    y.add("あ")
    println("セット内の要素数：" + y.count())
    println(y)


}