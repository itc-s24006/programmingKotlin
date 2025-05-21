package chap16

fun main() {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)
    /** .withIndex() コレクションのインデックス数
     *  このままだとinの左側にはインデックスが入るから、
     *  要素を取り出したいときは以下のように変数を２つつくる
     */
    for ((index, money) in a.withIndex()) {
        println("${index+1}年目の時給は ${money}円です。")
    }
}