fun main() {
    print(solution())
}

fun solution(): Int {
    val x: Int = readLine()!!.toInt()
    val y: Int = readLine()!!.toInt()

    return getQuadrant(x, y)
}

fun getQuadrant(x: Int, y: Int): Int {
    return if (x >= 0) {
        if (y >= 0) 1
        else 4
    } else {
        if (y >= 0) 2
        else 3
    }
}