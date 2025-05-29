package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar2(car1)
    println()
    driveByCar2(car2)
}

/*ポリモーフィズム
*   受け取るパラメータの型を基底クラスにすることで
*   継承した子クラスはすべて受け取ることができる
*
*   driveByCar2の中で、子クラスでオーバーライドした関数を呼び出すと、
*   実際のインスタンスの型に応じたオーバーライド関数が呼び出される！
*   ただし、基底クラスに存在しない独自のメソッドは呼び出せない
*   応用：         if (パラメータ is 子クラス名) {
                    パラメータ.独自メソッド()  //スマートキャスト
                  }
*   こう書くと、独自メソッドも呼び出せる！
* */
fun driveByCar2(car: Car) {
//    println("Ferrari対応のdriveByCarが呼ばれました")
    car.drive(100.0)
}
