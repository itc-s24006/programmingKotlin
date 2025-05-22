package chap50

/**途中でbreakやcontinueなどで抜ける必要がない
 * 単純に処理を繰り返したいときは.forEachで置き換えることができる
 * (メリット)記述量が少ない、itが使える
 */
fun main() {
    val a = listOf(
        "こんにちは","Kotlin","どうぞ","よろしく"
    )

    println("forEach 使う方法1")
    a.forEach {
        println(it)
    }

    println("forEach 使う方法2")
    a.forEach(::println)
}