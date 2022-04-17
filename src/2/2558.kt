/**
 * 2558. A+B - 2
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 13,256 KB
 * 소요 시간: 116 ms
 * 해결 날짜: 2021년 9월 14일
 */

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val (A: Int, B: Int) = intArrayOf(nextInt(), nextInt())
    print(A + B)
}