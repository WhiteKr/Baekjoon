fun main() {
    print(solution())
}

fun solution(): String {
    val S: String = readLine()!!
    val alphabets: MutableMap<Char, Int> = mutableMapOf()
    var c: Char = 'a'
    while (c <= 'z')
        alphabets[c++] = 0
    for (s in S)
        if (alphabets.containsKey(s))
            alphabets[s] = alphabets[s]!!.plus(1)
    return alphabets.values.joinToString(" ")
}