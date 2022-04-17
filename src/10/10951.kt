import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var s: String?
    while (readLine().also { s = it } != null) {
        val tokenizer = StringTokenizer(s)
        val A = tokenizer.nextToken().toInt()
        val B = tokenizer.nextToken().toInt()
        writer.write("${A + B}\n")
    }
    writer.flush()
    writer.close()
    close()
}