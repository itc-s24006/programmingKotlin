package exam01

/*
キーボードから数字を入力して、1から入力された数までの
FizzBuzz を出力します。(数字以外は入力されない前提でOK)

FizzBuzzとは、
3の倍数のときにFizz
5の倍数のときにBuzz
3と5の倍数のときにFizzBuzz
それ以外のときは数字をそのまま出力する
 */
fun main() {
    println("数字を入力してください")
    val num = readln().toInt()
    (1..num).forEach {
        val result = if (it % 15 == 0) {
            "FizzBuzz "
        }else if (it % 5 == 0) {
            "Buzz "
        }else if (it % 3 == 0) {
            "Fizz "
        }else{
            it.toString()
        }
        println(result)
    }
}