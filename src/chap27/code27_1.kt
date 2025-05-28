package chap27

//open 継承できるクラス (デフォルトでは継承できない)
open class Car(val color: String) {
    var distance = 0.0 //総走行距離
    open fun drive(d: Double) { //d 距離
        distance += d
        println("${color}の車が ${d}km 走りました")
        println("その結果、マイレージは ${distance} キロになりました")
    }
}

/*fun main() {
    val car = Car()
    car.drive(5.0)
    car.drive(10.0)
}*/
