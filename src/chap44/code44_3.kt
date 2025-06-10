package chap44

//拡張関数  openじゃないクラスに擬似的にメソッドを追加できる
fun main() {
    val text = "勉強"
//    val message = text.getOneTwoFiveMessage()
//    println(message)
    println(text.oneTwoFiveMessage)
}

//fun String.getOneTwoFiveMessage(): String = "一に${this}、二に${this}、三、四がなくて五に${this}"

val String.oneTwoFiveMessage: String
    get() = "一に${this}、二に${this}、三、四がなくて五に${this}"