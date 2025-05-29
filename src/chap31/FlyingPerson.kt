package chap31

//クラスの継承は:で記述     インターフェースは,で記述
//alt + Enter でインターフェースの関数を自動オーバーライド
class FlyingPerson( name: String,age: Int) : Person(name, age), Flyable{
    override fun fly() {
        println("まさか！人間が空を飛んでいます！")
    }

}