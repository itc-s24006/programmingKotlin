package chap36

fun main() {
    val p = Person()
    p.setNameAndAge("タケシ",5)
    p.greet()

}

class Person {
    var name: String = ""
    var age: Int = 0

    fun setNameAndAge(name:String, age:Int){
        this.name = name
        this.age = age
    }

    fun greet(){
        println("${name}です。${age}才です。")

    }
}