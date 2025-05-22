package chap23

fun main() {
    val p = Person() //インスタンス 誕生
    p.name = "たけし"
    p.age = 5
    p.great()
}

class Person {
    //プロパティー
    var name: String = ""
    var age: Int = 0

    fun great() {
        println("こんにちは、私の名前は${name}です。年齢は${age}です。")
    }
}