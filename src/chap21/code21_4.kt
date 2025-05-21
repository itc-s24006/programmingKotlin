package chap21

fun main() {
    val answer = getThreeTimes2(5)
}

// 式が一個の場合のみ{}を省略して=で処理を代入できる。
// returnはいらないが、必ず１行で書く
fun getThreeTimes2(value: Int) = value * 3