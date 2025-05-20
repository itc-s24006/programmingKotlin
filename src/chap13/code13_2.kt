package chap13

fun main() {
    val x = 5
    //ここでのinはrangeの中から一つずつ取り出すという意味
    for (i in 1..9){
        println("${x} x ${i} = ${x*i}")
    }
}