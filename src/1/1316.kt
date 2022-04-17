/**
 * 1316. 그룹 단어 체커
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 12,404 KB
 * 소요 시간: 100 ms
 * 해결 날짜: 2021년 7월 13일
 */

fun main() {
    var count = 0
    val N: Int = readLine()!!.toInt()
    for (i in 0 until N)
        if (check()) count++
    print(count)
}

fun check(): Boolean {
    val check = BooleanArray(26)
    var prev = 0
    val str: String = readLine()!!

    for (element in str) {
        val now = element.code
        if (prev != now) {
            if (!check[now - 'a'.code]) {
                check[now - 'a'.code] = true
                prev = now
            } else return false
        } else continue
    }
    return true
}