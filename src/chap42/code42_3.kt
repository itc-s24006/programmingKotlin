package chap42

import chap27.Car
//インポートエイリアス
import jp.ac.it_college.std.s24006.example.cars.Car as Car42

fun main() {
    //パッケージ内に定義したクラスを使う
    val c1 = Car42("赤")
    val c2 = Car42("青")
    c1.drive()
    c2.drive()
    val c3 = Car("白")
    c3.drive(10.0)
}