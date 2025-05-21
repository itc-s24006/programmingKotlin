package chap20
//標準入力について

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`) //System.inだと正常に動かない

    println("なにか入力してください:")
    val line = sc.nextLine()
    println(line)

    println("なにか入力してください(空白はだめ):")
    val string = sc.next()
    println(string)

    println("整数を入力してください:")
    val num = sc.nextInt()
    println("${num}の2倍の数： ${num * 2}")

}