package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByFerrari(car1) //関数
    driveByPrius(car2)
}

//クラスをインスタンス化してパラメータとして渡している(Ferrari型のcarインスタンス)
//ただこれだと、パラメータの型に合わせて使う変数を変えないといけないから面倒
fun driveByFerrari(car: Ferrari) {
    car.drive(100.0)
}
fun driveByPrius(car: Prius) {
    car.drive(100.0)
}