package chap30

//インスタンス化できないクラス
//  一つでもabstractな関数がある場合は必ずabstractクラスにしなければいけない
abstract class Car(val color: String) {
    var distance = 0.0

    abstract fun drive(d: Double)
    /*
    インスタンス化できない関数
    具体的な処理を書いてはいけない
    ->継承する意味ある？
        子クラスでそれぞれ具体的な処理を書かなければいけないが、
        無いとcode29_5で実装したポリモーフィズムができなくなる
     */
}