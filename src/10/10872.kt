fun main() {
    val N: Int = readLine()!!.toInt()
    print(factorial(N))
}

fun factorial(N: Int): Int {
    if (N == 0) return 1
    return N * factorial(N - 1)
}