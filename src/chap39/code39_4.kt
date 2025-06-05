package chap39

fun main() {
    val list = listOf("あ", "い", "う", "え", "お")
    val action = fun(x: String) {
        println(x)
    }
    //forEach(関数名)
    list.forEach(action)

    list.forEach {  println(it) }
}