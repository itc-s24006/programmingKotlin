package chap25

fun main() {
    val p = Person("たけし",5)
    p.greet()
    val p2 = Person(age = 8, name = "ユミ")
    p2.greet()
}

/**コンストラクタ
 * クラス名の引数のところで
 *      - プロパティの定義
 *      - クラスのインスタンス化とパラメーターの初期値設定
 * を同時に行うことができる
 */
class Person(val name: String = "",var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}才です。")
    }
}