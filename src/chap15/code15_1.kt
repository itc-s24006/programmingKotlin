package chap15

import kotlin.random.Random

fun main() {
    while (true) {
        val value = Random.nextInt(100)
        println("乱数:$value")
        if (value < 10) { break }
        /** ifの次の行に処理を複数行かいて、
         *  {}で囲むのを忘れると直後の一行しかifとして処理されない
         *  例えば、二行目にbreakをかいてたら無条件にbreakされる
         */
    }
}