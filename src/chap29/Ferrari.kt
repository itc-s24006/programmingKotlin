package chap29

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています！ブウォォォーン！")
        println("おおっ、かっこいい！！")
        println("マイレージは ${distance}キロ になったぜい！")
    }
}
