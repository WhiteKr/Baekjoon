/**
 * 1271. 엄청난 부자2
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 15,504 KB
 * 소요 시간: 132 ms
 * 해결 날짜: 2021년 9월 14일
 */

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n: BigInteger, m: BigInteger) = readLine().split(" ").map { it.toBigInteger() }
    print("${n / m}\n${n % m}")
}