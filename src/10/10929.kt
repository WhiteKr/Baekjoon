import java.io.BufferedReader
import java.io.InputStreamReader
import java.security.MessageDigest


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val S: String = readLine()
    print(S.sha224)
}

val String.sha224: String
    get() {
        val bytes = MessageDigest.getInstance("SHA-224").digest(this.toByteArray())
        return bytes.joinToString("") {
            "%02x".format(it)
        }
    }