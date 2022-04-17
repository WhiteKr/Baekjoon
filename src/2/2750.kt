/**
 * 2750. 수 정렬하기
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 18,724 KB
 * 소요 시간: 188 ms
 * 해결 날짜: 2021년 8월 1일
 */

fun main() {
    val N: Int = readLine()!!.toInt()
    var arr: IntArray = IntArray(N)
    for (i in arr.indices)
        arr[i] = readLine()!!.toInt()

    arr.sort()
    for (i in arr.indices)
        println(arr[i])
}