package chap40

class Person2(val name: String, val age: Int) {
    /*クラス内のメソッド(関数)で、::メソッド名　とすると
    そのメソッドを実行しているインスタンスのメソッドを実行しているインスタンスのメソッドを実行する関数オブジェクトが参照できる*/
    fun greet(){
        println("${name}です。${age}才です。")
        at18year(::moreYearsAt)
    }

    fun greet2(){
        at30year(::moreYearsAt)
    }

    //この処理を複数回必要とする場合や、処理が長すぎて複雑になる場合は、分けて::で呼び出す
    fun moreYearsAt(year: Int): Int {
        return year - age
    }
}

fun at18year(action: (Int) -> Int) {
    println("18才まで${action(18)}年です。")
}

fun at30year(action: (Int) -> Int) {
    println("30才まで${action(30)}年です。")
}

fun main() {
    val p1 = Person2("ユミ",8)
    p1.greet()
    p1.greet2()

}