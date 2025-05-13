package chap04

/**
 * ソースコードの中に直接書きこんである値(文字とか数字) = リテラル
 * リテラルには基本の型があり
 * 整数の基本はInt、大文字LをつけるとLong
 * 小文字fをつけるとFloat、小数の基本はDouble
 *
 * Uがつくものは符号を取っ払って、整数のみ表現する型
 * 小文字のuをつける
 */
fun main() { //変数型は頭文字が大文字
    val a:Byte = 100
    val b:Short = 10000
    val c:Int = 1000000000
    val d:Long = 100000000000000000L
    val e:Float = 0.123f
    val f:Double = 0.123456789
    val g: UByte = 200u
    val h: UShort = 40000u
    val i: UInt = 3000000000u
    val j: ULong = 10000000000000000000u
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)
}