fun main() {
    val price: Int = readLine()?.toInt() ?: 0
    println(solution(price))
}

fun solution(price: Int): Int {
    var change: Int = 1000 - price
    var answer: Int = 0
    val units: Array<Int> = arrayOf(500, 100, 50, 10, 5, 1)
    for (unit in units) {
        answer += change / unit
        if (change == 0) break
        change %= unit
    }
    return answer
}