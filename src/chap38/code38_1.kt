package chap38

fun main() {
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    println(c1("タケシ"))
    println(c2("タケシ"))
    println(c3("タケシ"))
}

//クロージャー
//関数オブジェクトを作る関数
/*スコープから抜けた変数は無効になるが、クロージャを使うと
関数をオブジェクトとして扱うからそれぞれに独立した変数を保持する*/
fun getTextClosure(x: String): (String) -> String {
    return fun(name) = name + x
}