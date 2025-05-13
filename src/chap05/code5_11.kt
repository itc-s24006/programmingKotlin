package chap05

fun main() {
    val h: Int = 8
    val message1 = "本日働いた時間は、${h}hours"
    //${} の中には、変数や関数の呼び出し、計算式が書ける
    val message2 = "このペースで1ヶ月毎日働くと、${h * 30}hours の労働になります。"
    val message3 = "このペースで1年間毎日働くと、${h * 365}hours の労働になります。"
    println(message1)
    println(message2)
    println(message3)

    var world = "世界"
    //5_12 プログラム上にSQLなどを書くときに便利！
    val message4 = """|
        |こんにちは、${world}！
        |私は Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことができます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()
    println(message4)

    println("-----")
    val message5 = """
        こんにちは、${world}！
        私は Kotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラムを書くことができます。
        皆さん、一緒に楽しくプログラミングしましょう！
            あああああ
                いいいいい
            /あああああ
    """.trimIndent()
    println(message5)
}