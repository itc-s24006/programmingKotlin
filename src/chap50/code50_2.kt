package chap50

// code13_2を置き換えてみる
//    for (i in 1..9){
//        println("${x} x ${i} = ${x*i}")
//    }
fun main() {
    val x = 5
    (1..9).forEach {
        println("${x} x ${it} = ${x*it}")
    }
}