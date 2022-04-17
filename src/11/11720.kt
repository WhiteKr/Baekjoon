import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N: Int = readLine().toInt()
    val nums: String = readLine()
    var result = 0
    for (i in 0 until N) result += nums[i].digitToInt()
    print(result)
}