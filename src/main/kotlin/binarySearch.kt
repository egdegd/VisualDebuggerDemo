fun binarySearch(array: IntArray, target: Int): Int? {
    var left = 0
    var right = array.size - 1

    while (left <= right) {
        val mid = (left + right) / 2
        if (array[mid] == target) return mid
        if (array[mid] < target) left = mid + 1
        else right = mid - 1
    }

    return null // not found
}

fun main() {
    val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9)
    val target = 9

    val index = binarySearch(array, target)
    if (index != null) {
        println("Element $target found at index $index")
    } else {
        println("Element $target not found in the array")
    }
}
