package chap43

public fun testPublic(){
    println("可視性修飾子が public です。")
}

fun testPublic2(){
    println("public な関数から private の関数を呼び出しました")
    testPrivate()
}

private fun testPrivate(){
    println("可視性修飾子が private です。")
}

public class TestPublic(){

    private val privateObj = TestPrivate()
    val testClass: TestAbstract = privateObj
}

abstract class TestAbstract
private class TestPrivate(): TestAbstract(){}