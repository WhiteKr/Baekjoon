/**
 * 2562. 최댓값
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 12,332 KB
 * 소요 시간: 92 ms
 * 해결 날짜: 2021년 8월 1일
 */

fun main() {
    var (max: Int, idx: Int) = IntArray(2) { 0 }
    for (i in 1..9) {
        val n: Int = readLine()!!.toInt()
        if (max < n) {
            max = n
            idx = i
        }
    }
    print("$max\n$idx")
}