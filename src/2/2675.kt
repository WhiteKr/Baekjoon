/**
 * 2675. 문자열 반복
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 14,284 KB
 * 소요 시간: 120 ms
 * 해결 날짜: 2021년 8월 4일
 */

import java.io.BufferedWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw: BufferedWriter = System.out.bufferedWriter()

    val T: Int = readLine().toInt()
    for (t in 0 until T) {
        val testCase: String = readLine()
        val repeatTime: Int = testCase.split(" ")[0].toInt()
        val string: String = testCase.split(" ")[1]

        for (char in string)
            bw.write(char.toString().repeat(repeatTime))
        bw.write("\n")
    }
    bw.flush()
}