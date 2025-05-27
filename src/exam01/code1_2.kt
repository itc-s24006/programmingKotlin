package exam01

/*
映画館の料金を計算するプログラム
シニア→一般→子供の順で人数を入力
シニア：1,300 一般：2,000 子供：1,000
ただし、10名以上の場合は、各200円割引
 */
fun main() {
    val list = listOf(1300,2000,1000) //料金表
    print("シニアの人数を入力してください：")
    val s_nin = readln().toInt()
    print("一般の人数を入力してください：")
    val a_nin = readln().toInt()
    print("子供の人数を入力してください：")
    val c_nin = readln().toInt()

    var senior = s_nin * list[0]
    var adult = a_nin * list[1]
    var child = c_nin * list[2]

    val total_nin = s_nin + a_nin + c_nin
    if (total_nin >= 10) { //10名以上
        senior -= s_nin*200
        adult -= a_nin*200
        child -= c_nin*200
        println("合計人数が10名以上のため、団体割引が適用されました。")
    }

    println("シニア： $senior 円")
    println("一般： $adult 円")
    println("子供： $child 円")
}