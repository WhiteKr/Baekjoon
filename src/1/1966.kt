/**
 * 1966. 프린터 큐
 *
 * 작성자: whitekr
 * 언어: Kotlin (JVM)
 * 사용 메모리: 18,360 KB
 * 소요 시간: 188 ms
 * 해결 날짜: 2021년 7월 16일
 */

import java.util.*

fun main() {
    val T: Int = readLine()!!.toInt()

    for (i in 0 until T) {
        val (N: Int, M: Int) = readLine()!!.split(" ").map { it.toInt() }
        val queue: Queue<Int> = LinkedList<Int>()
        val boolQueue: Queue<Boolean> = LinkedList<Boolean>()
        var count: Int = 0

        val q = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        for (j in 0 until N) queue.add(q[j]);
        for (j in 0 until N) boolQueue.add(j == M)

        while (true) {
            val maxIndex: Int = queue.indexOf(queue.maxOrNull())
            queue.pullElement(maxIndex)
            boolQueue.pullElement(maxIndex)

            ++count
            if (boolQueue.element()) break

            queue.remove()
            boolQueue.remove()
        }
        println(count)
    }
}

fun <T> Queue<T>.pullElement(count: Int = 1) {
    for (i in 0 until count) this.add(this.remove())
}