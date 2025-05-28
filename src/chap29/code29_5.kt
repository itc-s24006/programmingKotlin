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
*   ⚠子クラスの判断はしてないため、基底クラスに存在しない個別のメソッドは呼び出せない
* */
fun driveByCar2(car: Car) {
//    println("Ferrari対応のdriveByCarが呼ばれました")
    car.drive(100.0)
}
