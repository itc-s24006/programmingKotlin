package chap41

//ジェネリクス
// T:何らかの型が入ってくる変数みたいなやつ「型パラメーター」
//   Tである必要はないが、中身を意味する英単語の頭文字の大文字をつける慣習
class Box<T> {
    var label: String = ""
    var content: T? = null

    fun setValues(label: String, content: T) {
        this.label = label
        this.content = content
    }

    fun printValues(){
        println("${label}: $content")
    }
}
