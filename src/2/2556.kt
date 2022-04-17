/**
 * 2556. 별 찍기 - 14
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 14,704 KB
 * 소요 시간: 280 ms
 * 해결 날짜: 2021년 9월 12일
 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val N: Int = nextInt()
    for (i in 0 until N) {
        for (j in 0 until N)
            print("*")
        println()
    }
}