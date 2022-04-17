/**
 * 1157. 단어 공부
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 43,704 KB
 * 소요 시간: 412 ms
 * 해결 날짜: 2021년 7월 15일
 */

fun main() {
    val word: String = readLine()!!.uppercase()
    val alphabets: MutableMap<Char, Int> = mutableMapOf()

    for (char in word)
        if (alphabets.containsKey(char))
            alphabets[char] = alphabets[char]!!.plus(1)
        else
            alphabets[char] = 1

    val maxValue: Int? = alphabets.values.maxOrNull()
    val maxEntries: Map<Char, Int> = alphabets.filterValues { it == maxValue }
    print(
        if (maxEntries.size > 1) "?"
        else maxEntries.keys.first()
    )
}