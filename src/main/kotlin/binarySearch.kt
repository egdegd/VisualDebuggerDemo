fun binarySearch(arr: IntArray, target: Int): Int? {
    var left = 0
    var right = arr.size - 1
    var mid = right / 2

    while (left <= right) {
        if (arr[mid] == target) {
            return mid
        }
        if (arr[mid] < target) {
            left = mid + 1
        }
        else {
            right = mid - 1
        }
        mid = left + (right - left) / 2
    }
    return null
}

fun main() {
    val sortedArray = intArrayOf(1, 6, 7, 9, 11, 13, 135)

    val target = 13

    val result = binarySearch(sortedArray, target)
    if (result != null) {
        println("Element $target found at index $result")
    } else {
        println("Element $target not found in the array")
    }
}
