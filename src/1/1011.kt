/**
 * 1011. Fly me to the Alpha Centauri
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 15,300 KB
 * 소요 시간: 124 ms
 * 해결 날짜: 2021년 7월 19일
 */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val sb: StringBuilder = StringBuilder()

    val T: Int = br.readLine().toInt()

    for (i in 0 until T) {
        val st: StringTokenizer = StringTokenizer(br.readLine(), " ")
        val x: Int = st.nextToken().toInt()
        val y: Int = st.nextToken().toInt()
        val distance: Int = y - x
        val max: Int = sqrt(distance.toDouble()).toInt()

        when {
            max.toDouble() == sqrt(distance.toDouble()) -> sb.append(2 * max - 1).append('\n')
            distance <= max * max + max                 -> sb.append(2 * max).append('\n')
            else                                        -> sb.append(2 * max + 1).append('\n')
        }
    }
    print(sb)
}