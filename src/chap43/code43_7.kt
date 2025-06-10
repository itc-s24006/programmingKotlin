package chap43

fun main() {
    val car = Car2("白")
    car.drive()
    car.drive()
//    car.fuel = 70.0

    println("燃料の残り：${car.fuel}")
    val prius = Prius2("黒")
    prius.drive()
    prius.drive()

}