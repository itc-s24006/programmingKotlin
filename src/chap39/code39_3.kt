package chap39

fun main() {
    val function1: (String) -> String = fun(x: String) : String {
        return x + "ちゃん"
    }
    val function2: (String) -> String = fun(x: String) = x + "ちゃん"
    val function3: (String) -> String = {x -> x + "ちゃん"}
    //ラムダ式のパラメータが一個の場合,省略してitとしてつかえる
    val function4: (String) -> String = {it + "ちゃん"}

    println(function1("タケシ"))
    println(function2("タケシ"))
    println(function3("タケシ"))
    println(function4("タケシ"))
}