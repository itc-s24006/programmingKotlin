package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar(car1)
    println()
    driveByCar(car2)
}

/*
関数名は統一してパラメータの型のみ変える「オーバーロード」
      メリット：パラメータの型に関係なく同じ関数を使える
      でも、同じ処理を繰り返し記述してるからまだ面倒
      */
fun driveByCar(car: Ferrari) {
    println("Ferrari対応のdriveByCarが呼ばれました")
    car.drive(100.0)
}
fun driveByCar(car: Prius) {
    println("Prius対応のdriveByCarが呼ばれました")
    car.drive(100.0)
}