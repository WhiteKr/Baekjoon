import java.io.BufferedReader
import java.io.InputStreamReader
import java.security.MessageDigest


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val S: String = readLine()
    print(S.sha256)
}

val String.sha256: String
    get() {
        val bytes = MessageDigest.getInstance("SHA-256").digest(this.toByteArray())
        return bytes.joinToString("") {
            "%02x".format(it)
        }
    }