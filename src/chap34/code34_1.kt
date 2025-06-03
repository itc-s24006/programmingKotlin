package chap34

fun main() {
    val number = 123
    val text = "あいうえお"
    val car = Car("赤")
    val person = Person("たけし",5)

    printClassInfo(number)
    printClassInfo(text)
    printClassInfo(car)
    printClassInfo(person)
}

//パラメータの型をAnyにしてるからどんな型でも受け取れる
fun printClassInfo(obj: Any) {
    val hashcode = obj.hashCode()
    val text = obj.toString()
    println("テキスト = ${text}、　ハッシュコード = ${hashcode}")
    //受け取った型をチェックする
    /*「スマートキャスト」
    ifの中に入った時点で、文脈的に型を判断してくれるから、キャストの処理を書かなくていい*/
    if (obj is Person) {
        println("↑ これは Person クラスのインスタンスですね！")
        obj.greet()
    }else if (obj is Car) {
        println("↑ これは Car クラスのインスタンスですね！")
        obj.drive(100.0)
    }
}

class Car(val color: String) {
    fun drive(d: Double) {
        println("${color}の車が${d}km走りました。")
    }
}

class Person(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。${age}才です。")
    }
}