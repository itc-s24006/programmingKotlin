package chap39

import kotlin.random.Random

//教科書にはないパターン
fun main() {
    val randomSuffix = nameString()
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
}

//「Stringを受け取ってStringを返す関数」(randomSuffix)を返す関数
fun nameString(): (String) -> String {
    //↓ラムダ式:
    //一行という決まりはない。最後の行にある処理が自動で返されるから複数行でもreturn不要
    return {
        val randomNumber = Random.nextInt(100)
        it + randomNumber
    }
}