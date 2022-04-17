import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a: Int = nextInt()
    val b: Int = nextInt()

    for (n in "$b".reversed()) println(a * n.digitToInt())
    print(a * b)
}