fun main() {
    var answer: Int = 0

    val words: String = readLine()!!
    val alphabets: Array<String> = arrayOf(
        "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    )

    for (word in words)
        for (i in alphabets.indices)
            if (alphabets[i].contains(word))
                answer += i + 3
    print(answer)
}