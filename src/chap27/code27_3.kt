package chap27

//継承の仕方
/*    子クラスでコンストラクタの変数を定義するときは、val,varをつけない
    　そのまま基底クラスに渡す
    */
class Ferrari(c: String) : Car(c)

fun main() {
    val car = Ferrari("赤")
    car.drive(5.0)
    car.drive(10.0)
}