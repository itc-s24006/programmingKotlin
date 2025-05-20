package chap12

import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1,5)

    //whenは基本一つの分岐に一つの処理しかかけないが、
    // ｛｝で囲めば複数処理書ける
    //上から通って、ヒットしたら抜けるからbreak必要ない
    when (x) {
        1,2 -> {
            println("ワンかツーのどちらかです")
            println("こんにちは！")
        }
        3   -> {
            println("スリー")
            println("ありがとう！")
        }
        else-> {
            println("ワンツースリー以外の数字です")
            println("さようなら！")
        }
    }
}