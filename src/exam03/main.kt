package exam03

fun main() {
    val player1 = Human(100,100, 80, 80, 30, 20, 60, 80)
    val cicada = Insect(20,20,10,10,20,60, 0, 10)

    println("player1のHP: ${player1.hp}")
    println("敵のHP: ${cicada.hp}")

    player1.giveAttack(cicada)
    cicada.giveAttack(player1)


    println("player1のHP: ${player1.hp}")
    println("敵のHP: ${cicada.hp}")
}