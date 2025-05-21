package chap17

fun main() {
    //17_5 配列 -> 書き換え可能、要素数固定
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = 4 //配列要素の書き換え可能。

    //17_6 リスト -> 書き換え不可、要素数固定
    val y: List<Int> = listOf(1,2,3)
}