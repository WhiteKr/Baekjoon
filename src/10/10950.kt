fun main() {
    val T: Int = readLine()!!.toInt()
    for (i in 0 until T) {
        val (A: Int, B: Int) = readLine()!!.split(" ").map { it.toInt() }
        println(A + B)
    }
}