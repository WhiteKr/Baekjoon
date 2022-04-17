/**
 * 2439. 별 찍기 - 2
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 15,600 KB
 * 소요 시간: 280 ms
 * 해결 날짜: 2021년 7월 14일
 */

fun main() {
    val N: Int = readLine()!!.toInt()
    for (line in 1..N) {
        for (blank in N - line downTo 1)
            print(" ")
        for (star in 0 until line)
            print("*")
        println()
    }
}