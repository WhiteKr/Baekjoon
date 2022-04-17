import java.math.BigInteger
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val (A: BigInteger, B: BigInteger) = arrayOf(nextInt(), nextInt()).map { it.toBigInteger() }
    print((A + B) * (A - B))
}