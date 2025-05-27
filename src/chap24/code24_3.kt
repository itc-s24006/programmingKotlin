package chap24

fun main(args: Array<String>) {
    val p = Person()
    p.name = "たけし"
    p.age = 5
    print(p.message)
}

class Person {
    var name: String = ""
    var age: Int = 0
//        set(value) {
//            print("${field}才から ${value} 才になりました。")
//            if (value<field) println("-> なんと！若返りましたよォ！")
//            else if (value>field) println("-> 嗚呼、歳を取るのはいやだなァ。")
//            field = value
//        }

    val message: String
    get() {
        return "${name}です。${age}才です！"
    }

}


