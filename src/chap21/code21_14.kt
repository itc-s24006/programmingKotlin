package chap21

//可変長引数
fun main() {
    printTimes(5)
    printTimes(2,3)
    printTimes(5,10,20)
    printTimes(1,10,100,1000)
    printTimes(2,2,2,2,2,2,2,2)
}

fun  printTimes(vararg nums: Int) {
    var result = 1 //引数が一つでも値を返すため１
    for (num in nums) {
        result *= num
    }
    println("すべての数値を掛け算した結果： $result")
}