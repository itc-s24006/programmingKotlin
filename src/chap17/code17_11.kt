package chap17

fun main() {
    val a = mutableListOf(1,2,3)

    //中身が空っぽの状態でint型が入るミュータブルリストをつくる
//    val b = mutableListOf() //だめ
    val b:MutableList<Int> = mutableListOf()
    val c = mutableListOf<Int>()
}