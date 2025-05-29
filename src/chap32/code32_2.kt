package chap32

/*null許容型の変数
    宣言時：変数の型に?をつける
    関数の呼び出し時：変数に?をつける
 */

fun main() {
    var text: String? = "あいうえお"
    text = null
    println("文字列「${text}」の長さ = ${text?.length}")
    //32.5
    var text_a: String = "あいうえお"
    var text_b: String? = null
    var length_a = countTextLength2(text_a)
    var length_b = countTextLength2(text_b) //null許容型の変数は入れられない
//    var length_n = countTextLength1(null) //nullももちろん入れられない

    println("length_a: ${length_a}")
    println("length_b: ${length_b}")
}

fun countTextLength1(text: String): Int {
    return text.length
}

fun countTextLength2(text: String?): Int {
    //ifを通る時点でnullじゃないことが確定してたらセーフコール(?.)をつけなくてもいい
/*    if (text != null) {
        return text.length
    }else{
        return 0
    }*/

    //上記のif文を一行で表せる
    //null以外が入ったらそのまま実行、nullが入ったら:以降の値が帰る
    return text?.length ?: 0
}