fun main() {
    var answer: Int = 0

    val (_: Int, M: Int) = readLine()!!.split(" ").map { it.toInt() }
    val cards: Array<Int> = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    for (i in 0 until cards.size - 2) {
        for (j in i + 1 until cards.size - 1) {
            for (k in j + 1 until cards.size) {
                val num = cards[i] + cards[j] + cards[k]
                if (num <= M)
                    if (num > answer)
                        answer = num
            }
        }
    }
    print(answer)
}