import java.io.BufferedWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw: BufferedWriter = System.out.bufferedWriter()
    val T: Int = readLine().toInt()

    for (i in 0 until T) {
        val OX: String = readLine()
        val stack: IntArray = IntArray(OX.split("").size)

        var stackNum: Int = 0
        for (j in OX.indices) {
            if (OX[j] == 'O')
                stack[j] = ++stackNum
            else
                stackNum = 0
        }
        bw.write("${stack.sumAllElements()}\n")
    }
    bw.flush()
}

fun IntArray.sumAllElements(): Int {
    var result: Int = 0
    this.forEach { result += it }
    return result
}