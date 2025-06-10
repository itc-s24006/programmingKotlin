package chap43

open class Car2(val color: String) {
    var fuel = 50.0
        //標準のsetterと同じ処理ならこの一行だけでOK↓
        protected set

    public fun drive() {
        if (fuel > 0.0){
            letEngineWork()
            println("${color}の車が走りました。")
        }else{
            println("ガス欠で走れません！")
        }
    }

    protected open fun letEngineWork(){
        println("ブルルーン！")
        fuel -= 1.0
    }
}