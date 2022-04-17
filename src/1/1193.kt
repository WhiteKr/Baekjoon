/**
 * 1193. 분수찾기
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 12,352 KB
 * 소요 시간: 100 ms
 * 해결 날짜: 2021년 7월 16일
 */

fun main() {
    val X: Int = readLine()!!.toInt()

    var line: Int = 0
    var count: Int = 0
    while (count < X) {
        ++line
        count = line * (line + 1) / 2
    }

    var (top: Int, bottom: Int) = intArrayOf(0, 0)
    if (line % 2 != 0) {
        top = 1 + (count - X)
        bottom = line - (count - X)
    } else {
        top = line - (count - X)
        bottom = 1 + (count - X)
    }
    print("$top/$bottom")
}