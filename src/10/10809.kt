import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val S: String = readLine()
    val indices = IntArray(26) { -1 }

    for (s in S) {
        val sIdx: Int = S.indexOf(s)
        val arrIdx: Int = s.code - 'a'.code

        if (sIdx == -1) continue
        else if (indices[arrIdx] != -1) continue
        else indices[arrIdx] = sIdx
    }
    print(indices.joinToString(" "))
}