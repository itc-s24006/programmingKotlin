package chap19

//Map マップ
fun main() {
    val map: Map<String, String> = mapOf(
        "Pen" to "ペン",
        "Apple" to "アップル",
        "Pineapple" to "パイナップル",
    )
    val value1 = map["Pen"]
    val value2 = map["Pineapple"]
    val value3 = map["Apple"]
    val value4 = map["Pen"]
    println("$value1、$value2、$value3、$value4")
}