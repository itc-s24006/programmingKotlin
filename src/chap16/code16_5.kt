package chap16

fun main() {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)
    for (i in 0..<a.count()) { //kotlinの終端を含むだからuntil(未満) ..< にする
        println("${i+1}年目の時給は ${a[i]}円です。")
    }

}