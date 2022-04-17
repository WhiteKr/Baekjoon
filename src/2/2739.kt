/**
 * 2739. 구구단
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 12,304 KB
 * 소요 시간: 96 ms
 * 해결 날짜: 2021년 7월 16일
 */

fun main() {
    val N: Int = readLine()!!.toInt()
    for (i in 1..9)
        println("$N * $i = ${N * i}")
}