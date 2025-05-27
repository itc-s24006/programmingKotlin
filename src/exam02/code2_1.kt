package exam02

import kotlin.random.Random
import kotlin.random.nextInt

//Dice という名前でサイコロを表すクラスを定義してください
//一般的な6面サイコロ以外も対応したいので、いくつまでの数を出せるか
//コンストラクタでパラメーターとして受け取れるようにしてください。デフォ６面
//持ってるプロパティ
//      - name      => 識別用の名前
//      - number    => いまの出目
//      - maxNumber => このサイコロの目の最大値
//メソッド
//      - roll      => サイコロを振る

fun main() {
    val dice1 = Dice("サイコロ1")
    dice1.roll()
    val dice2 = Dice("サイコロ2",12)
    dice2.roll()
}

class Dice(val name: String, val maxNumber: Int = 6){
    fun roll(){
        val number = Random.nextInt(1..maxNumber)
        println("「${name}」を投げました")
        println("出た目： ${number}\n")
    }
}
