fun main() {

    val case1 = listOf(0, 3, 5, 6, 1, 2, 4)
    val case2 = listOf(3, 2, 1, 5, 9, 7, 4)
    val case3 = listOf(1, 1, 1, 3, 3, 2, 5)

    println(findMaxPlusOrMultiply(case1))
    println(findMaxPlusOrMultiply(case2))
    println(findMaxPlusOrMultiply(case3))
}

/**
 * 숫자 사이에 곱셈 또는 덧셈 연산자를 넣어 결과적으로 가장 큰 수를 구한다.
 */
fun findMaxPlusOrMultiply(numbers: List<Int>): Int {
    return numbers.fold(0) { sum, number ->
        if (number <= 1 || sum <= 1) {
            sum + number
        } else {
            sum * number
        }
    }
}
