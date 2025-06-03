package chap35

//データクラス
data class Person(val name: String, val myNumber: Int)

fun main() {
    val p1 = Person("タケシ",1234)
    val p2 = Person("タケシ",1234)

    //hashCodeを自動的にオーバーライドしてくれる
    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物")
    }else {
        println("二人は別人")
    }

    //toStringもいい感じにオーバーライドしてくれる
    val personSet = setOf(p1, p2)
    println("personSet: $personSet")
}
