/**
 * 1032. 명령 프롬프트
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 14,036 KB
 * 소요 시간: 100 ms
 * 해결 날짜: 2021년 7월 9일
 */

fun main() {
    println(solution())
}

fun solution(): String {
    var answer: String = ""

    val N: Int = readLine()!!.toInt()
    var files: Array<String?> = arrayOf()
    for (i in 0 until N)
        files = append(files, readLine()!!)

    val firstFile: String = files[0]!!
    for (i in firstFile.indices) { // 첫번째 파일명 글자 하나씩
        val letter = firstFile[i]
        var correctCounter: Int = 0
        for (j in 1 until files.size) { // 파일 하나씩
            val file = files[j]
            if (letter == file!![i])
                correctCounter++
        }
        if (correctCounter == files.size - 1)
            answer += letter
        else answer += "?"
    }
    return answer
}

fun <T> append(arr: Array<T>, element: T): Array<T?> {
    val array = arr.copyOf(arr.size + 1)
    array[arr.size] = element
    return array
}