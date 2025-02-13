package _01

fun main() {
    val case1 = "abadabac"
    val case2 = "aabbcddd"
    val case3 = "aaaaaaaa"

    println(findNotRepeatingFirstChar(case1))
    println(findNotRepeatingFirstChar(case2))
    println(findNotRepeatingFirstChar(case3))
}

/**
 * 반복되지 않은 가장 첫번째 문자를 반환한다.
 */
private fun findNotRepeatingFirstChar(input: String): Char {
    val occurrence = IntArray(26)
    val inputChars = input.toCharArray()
    for (inputChar in inputChars) {
        occurrence[inputChar - 'a']++
    }

    return inputChars.firstOrNull {
        occurrence[it - 'a'] == 1
    } ?: '_'
}
