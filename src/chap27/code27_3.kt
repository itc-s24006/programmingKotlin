package chap27

//継承の仕方
/*    子クラスはパラメータとして受け取るが、
    　プロパティは新しく宣言せずそのまま基底クラスに渡す
      val,varをつけない
    */
class Ferrari(c: String) : Car(c)

fun main() {
    val car = Ferrari("赤")
    car.drive(5.0)
    car.drive(10.0)
}