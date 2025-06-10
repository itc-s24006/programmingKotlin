package chap43

class Prius2(color: String) : Car2(color) {
    override fun letEngineWork() {
        println("スイーン！")
        //publicなプロパティのprotectedなセッターを呼び出す
        //サブクラスならOK
        fuel -= 0.5
    }
}