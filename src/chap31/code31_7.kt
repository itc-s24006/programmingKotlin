package chap31

//インターフェースでデフォルト実装をしていれば、オーバーライドしていなくても実体を作れる
class FlyingVehicle : Flyable

fun main() {
    val vehicle = FlyingVehicle()
    vehicle.fly()
}