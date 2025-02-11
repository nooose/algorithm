import kotlin.math.min

fun main() {

    val case1 = "00001100"
    val case2 = "011110"

    println(findCountTurnOut(case1))
    println(findCountTurnOut(case2))
}

/**
 * 0 또는 1을 뒤집어 모두 같은 숫자로 만드는 최소 횟수를 구한다.
 */
fun findCountTurnOut(input: String): Int {
    var countToAllZero = 0
    var countToAllOne = 0

    val charArray = input.toCharArray().asList()

    val first = charArray[0]
    if (first == '0') {
        countToAllOne++
    } else if (first == '1') {
        countToAllZero++
    }

    charArray.zipWithNext { current, next ->
        if (current != next) {
            if (next == '1') {
                countToAllZero++
            }

            if (next == '0') {
                countToAllOne++
            }
        }
    }

    println("countToAllOne: $countToAllOne")
    println("countToAllZero: $countToAllZero")
    return min(countToAllZero, countToAllOne)
}
