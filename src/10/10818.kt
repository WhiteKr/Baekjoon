import java.io.BufferedWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw: BufferedWriter = System.out.bufferedWriter()
    readLine() // To get N; but never used

    val intArray: IntArray = readLine().split(" ").map { it.toInt() }.toIntArray()
    bw.write("${intArray.minOrNull()} ${intArray.maxOrNull()}")
    bw.flush()
}