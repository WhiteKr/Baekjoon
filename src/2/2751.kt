import java.io.BufferedWriter
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val bw: BufferedWriter = System.out.bufferedWriter()
    val sb: StringBuilder = StringBuilder()

    val N: Int = nextInt()
    val nums = IntArray(N).map { nextInt() }
    nums.sorted().forEach { sb.append("$it\n") }
    bw.write(sb.toString())
    bw.close()
}