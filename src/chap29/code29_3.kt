package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar(car1)
    println()
    driveByCar(car2)
}

/*
関数名は統一してパラメータとして渡すクラスのみ変える
      メリット：パラメータの型に関係なく同じ関数を使える
      */
fun driveByCar(car: Ferrari) {
    println("Ferrari対応のdriveByCarが呼ばれました")
    car.drive(100.0)
}
fun driveByCar(car: Prius) {
    println("Prius対応のdriveByCarが呼ばれました")
    car.drive(100.0)
}