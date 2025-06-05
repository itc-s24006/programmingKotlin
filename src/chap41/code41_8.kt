package chap41

//直接入れられた値から型を予測している
class Box3<L, C>(val label:L? = null, val content: C? = null) {
}

fun main() {
    val box = Box3("ラベル",123)
}