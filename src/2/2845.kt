import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val (L: Int, P: Int) = intArrayOf(nextInt(), nextInt())
    val lp: Int = L * P
    val list = IntArray(5)
    for (i in 0 until 5) list[i] = nextInt() - lp
    print(list.joinToString(" "))
}