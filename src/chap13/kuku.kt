package chap13

fun main() {
    for (i in 1..9){
        for (j in 1..9){
            print("$i x $j = ${i*j}\t")
//            print("%d x %d = %2d, ".format(x,y,x*y))こうもかけるよー
        }
        println()
    }
}