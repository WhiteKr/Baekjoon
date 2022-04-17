import java.io.BufferedWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw: BufferedWriter = System.out.bufferedWriter()
    val numbers: IntArray = readLine().split(" ").map { it.toInt() }.toIntArray()

    if (numbers.contentEquals(numbers.sortedArray())) bw.write("ascending")
    else if (numbers.contentEquals(numbers.sortedArrayDescending())) bw.write("descending")
    else bw.write("mixed")

    bw.flush()
}