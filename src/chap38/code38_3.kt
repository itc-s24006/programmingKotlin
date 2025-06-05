package chap38

fun main() {
    val closureA = getCountClosure()
    val closureB = getCountClosure()
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャBが返した値 = ${closureB()}")
    println("クロージャBが返した値 = ${closureB()}")
    println("クロージャAが返した値 = ${closureA()}")
}

fun getCountClosure(): () -> Int {
    var num = 0
    return fun() = ++num
}