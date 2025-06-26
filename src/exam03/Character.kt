package exam03

abstract class Character(val maxHp: Int, var hp: Int, val maxMp: Int, var mp: Int) {
    abstract val attack: Int
    abstract val defense: Int

    //与えたダメージ(Int)を返す関数
    //target    攻撃対象
    abstract fun attackTo(target: Character):Int

    //受けたダメージ(Int)を返す関数
    //power     攻撃力
    abstract fun attacked(power: Int): Int
}