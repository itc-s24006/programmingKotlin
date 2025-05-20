package chap15

fun main() {
    //15_6
    for (x in 1..10) {
        if (x%3==0) {break}
        println("${x}回目の繰り返し")
    }
    println("_____________________")
    //15_7
    for (x in 1..10) {
        if (x%3==0) {continue}
        println("${x}回目の繰り返し")
    }
}