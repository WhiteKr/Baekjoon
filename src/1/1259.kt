import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        when (val s: String = readLine()) {
            "0" -> return
            s.reversed() -> println("yes")
            else -> println("no")
        }
    }
}