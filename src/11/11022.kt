fun main() {
    val T: Int = readLine()!!.toInt()
    for (i in 1..T) {
        val (A: Int, B: Int) = readLine()!!.split(" ").map { it.toInt() }
        println("Case #$i: $A + $B = ${A + B}")
    }
}