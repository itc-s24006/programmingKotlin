package chap13

fun main() {
    val x = 5
    //プログレッション　=　１ずつ増えていない特殊なrange
    for (i in 800..1000 step 3){
        println("${x} x ${i} = ${x*i}")
    }
}