package chap50

//文字列の比較
fun main() {
    print("文字を入力してください:")
    val x = readln()
    print("もう一度入力してください:")
    val y = readln()

    //javaだとstringは==で比較できない(.equals())
    //Kotlinではどんなデー型がも==で比較できる
    println("「${x}」と「${y}」が同じか? ${x == y}")
}