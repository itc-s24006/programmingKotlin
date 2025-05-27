package exam01

import kotlin.random.Random
import kotlin.random.nextInt

/*
お釣りの金種計算
ランダムで100-9000の数値を生成
支払う金額をキーボード入力
お釣りを計算して、金種ごとにその枚数を出力
トータルの枚数が最小となる組み合わせでお釣りを返す
支払う金額が足りない場合は、「足りません」と出力
0の場合は表示しない
*/
fun main() {
    val price = Random.nextInt(100..9000) //物の値段
    println("会計：${price}円")
    print("いくら出しますか？：")
    val pay = readln().toInt() //支払う金額
    val list = listOf(5000,1000,500,100,50,10,5,1)
    var change = pay - price //お釣り
    println("おつり：${change}円\n")
    if  (change < 0) {
        println("足りません")
    }else{
        repeat(list.size) {

            val mai = change/list[it]
            if (mai != 0){
                println("${list[it]}円： ${mai}枚")
            }
            change -= mai * list[it]
        }
    }
}