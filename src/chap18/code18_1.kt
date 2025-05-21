package chap18

fun main() {
    //Set -> 順番を記憶しない、書き換え不可
    val s: Set<String> = setOf("あ","い","う","え","お")
    for (i in s){ print(i) }
//    print(s[0]) //だめ
}