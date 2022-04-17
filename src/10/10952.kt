fun main() {
    while (true) {
        val (A: Int, B: Int) = readLine()!!.split(' ').map { it.toInt() }
        if (A == 0 && B == 0) return else println("${A + B}")
    }
}