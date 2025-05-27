package chap25

fun main() {
    val p = Person("たけし",5)
    p.greet()
    val p2 = Person(age = 8, name = "ユミ")
    p2.greet()
}

/**コンストラクタ
 * クラス名の引数のところでパラメーターの初期値を宣言することができる
 */
class Person(val name: String = "",var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}才です。")
    }
}