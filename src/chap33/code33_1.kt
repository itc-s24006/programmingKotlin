package chap33

open class Car(val color: String) {
    open fun drive() {
        println("${color}の車が走る！")
    }
}

class Ferrari(color: String) : Car(color)

fun main() {
    val car = Car("赤")
    car.drive()
    println(car.toString())
}