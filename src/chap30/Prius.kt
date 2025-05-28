package chap30

class Prius(color: String) : Car(color) {
    /*
    本来なら、基底クラスを継承していればメソッドの具体的な処理を書かなくても実装できるが
    基底クラスとそのメソッドがabstract(インスタンス化できない)の場合は
    必ずoverrideしないと実体が作れないからエラーになる
     */
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${distance} キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}