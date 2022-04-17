import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val dices: IntArray = readln().split(' ').map { it.toInt() }.toIntArray()

    print(
        if (dices.all { dices[0] == it }) 10000 + dices[0] * 1000
        else if (dices[0] == dices[1] || dices[1] == dices[2]) 1000 + dices[1] * 100
        else if (dices[0] == dices[2]) 1000 + dices[0] * 100
        else dices.maxOrNull()!! * 100
    )
}