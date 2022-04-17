fun main() {
    val (A: String, B: String) = readLine()!!.split(' ')
    print(intArrayOf(A.reversed().toInt(), B.reversed().toInt()).maxOrNull())
}