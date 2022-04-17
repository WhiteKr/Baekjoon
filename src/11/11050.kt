import java.util.*
import kotlin.math.min

fun main() = with(Scanner(System.`in`)) {
    val (N: Int, K: Int) = intArrayOf(nextInt(), nextInt())
    print(binomial(N, K))
}

fun binomial(n: Int, k: Int) = when {
    n < 0 || k < 0 -> throw IllegalArgumentException("negative numbers not allowed")
    n == k -> 1L
    else -> {
        val kReduced = min(k, n - k)    // minimize number of steps
        var result = 1L
        var numerator = n
        var denominator = 1
        while (denominator <= kReduced)
            result = result * numerator-- / denominator++
        result
    }
}