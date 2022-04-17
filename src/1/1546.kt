import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N: Int = readLine().toInt()
    val scores: Array<String> = readLine().trim().split(' ').toTypedArray()
    val data = IntArray(N)
    var max: Int = scores.map { it.toInt() }.toIntArray().maxOrNull()!!
    var sum = .0

    for (i in 0 until N) {
        data[i] = scores[i].toInt()
        sum += data[i]
        if (max < data[i])
            max = data[i]
    }
    print(((sum / N) * 100) / max)
}