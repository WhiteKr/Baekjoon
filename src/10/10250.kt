fun main() {
    val T: Int = readLine()!!.toInt()
    for (i in 0 until T) {
        val (H: Int, _, N: Int) = readLine()!!.split(" ").map { it.toInt() }
        println(getRoomNumber(H, N))
    }
}

fun getRoomNumber(H: Int, N: Int): Int =
    if (N % H == 0) (H * 100) + (N / H) else (((N % H) * 100) + (N / H)) + 1