package chap31

fun main() {
    val person = FlyingPerson("たけし",5)
    val car = FlyingCar("赤")
    makeItFly(person)
    makeItFly(car)
}

//パラメータの型をインターフェースにする
fun makeItFly(a: Flyable){
    a.fly()
}