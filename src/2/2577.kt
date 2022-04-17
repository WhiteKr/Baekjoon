import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val (A: Int, B: Int, C: Int) = arrayOf(nextInt(), nextInt(), nextInt())
    val n: String = (A * B * C).toString()
    for (i in 0..9) println(Regex("$i").findAll(n).count())
}