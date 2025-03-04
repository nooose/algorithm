package _03

fun main() {
    val topHeights = mutableListOf(
        6, 9, 5, 7, 4
    )

    println(topOrders(topHeights))
}

private fun topOrders(topHeights: MutableList<Int>): List<Int> {
    val result = mutableListOf<Int>()

    while (topHeights.isNotEmpty()) {
        val lastTopHeight = topHeights.removeLast()
        record(topHeights, lastTopHeight, result)
    }

    return result
}

private fun record(topHeights: MutableList<Int>, lastTopHeight: Int, result: MutableList<Int>) {
    for (index in topHeights.indices.reversed()) {
        if (lastTopHeight <= topHeights[index]) {
            result.addFirst(index + 1)
            return
        }
    }
    result.addFirst(0)
}
