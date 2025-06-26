package exam03

import kotlin.random.Random
import kotlin.random.nextInt

open class Enemy
    (maxHp: Int, hp: Int, maxMp: Int, mp: Int,
     val strength: Int, //攻撃力の基礎値
     val stamina: Int,  //防御力の基礎値
     val weapon: Int,   //武器の攻撃力
     val armor: Int)    //防具の防御力
    : Character(maxHp, hp, maxMp, mp) {


    override val attack: Int
        get() = strength + weapon

    override val defense: Int
        get() = stamina + armor


    //与えたダメージ(Int)を返す関数
    override fun attackTo(target: Character): Int {
        println("playerに攻撃を与えた🧨")
        return attack
    }

    //受けたダメージ(Int)を返す関数
    override fun attacked(power: Int): Int {
        val rand = Random.nextInt(28..36)
        return Math.round((power * 0.5 - defense * 0.25)*(rand/32)).toInt()
    }

    //攻撃を与える関数
    fun giveAttack(target: Character) {
        hp -= attacked(target.attackTo(target))
    }
}