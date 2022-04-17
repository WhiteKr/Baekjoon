/**
 * 2475. 검증수
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 13,208 KB
 * 소요 시간: 140 ms
 * 해결 날짜: 2021년 9월 14일
 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var result = 0
    for (i in 0 until 5) {
        val n: Int = nextInt()
        result += n * n
    }
    print(result % 10)
}