package _02

fun main() {

    val case = arrayOf(1, 1, 1, 1, 1)
    val targetNo = 3

    val result = mutableListOf<Int>()
    recursion(result, case, 0, 0)

    println(result)
    println(result.count { it == targetNo })
}

/**
 * 배열의 모든 수를 더하거나 빼는 작업을 통해 만들 수 있는 모든 경우의 수를 구한다.
 */
private fun recursion(result: MutableList<Int>, array: Array<Int>, index: Int, sum: Int) {
    if (index == array.size) {
        result.add(sum)
        return
    }

    recursion(result, array, index + 1, sum + array[index])
    recursion(result, array, index + 1, sum - array[index])
}
