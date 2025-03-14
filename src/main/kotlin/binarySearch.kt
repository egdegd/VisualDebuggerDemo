fun binarySearch(arr: IntArray, target: Int): Int? {
    var left = 0
    var right = arr.size - 1
    var mid = right / 2

    while (left <= right) {
        if (arr[mid] == target) return mid
        else if (arr[mid] < target) right = mid - 1
        else left = mid + 1
        mid = left + (right - left) / 2
    }
    return null
}

fun main() {
    val sortedArray = intArrayOf(1, 2, 3, 4, 5, 6)

    val target = 1

    val result = binarySearch(sortedArray, target)
    if (result != null) {
        println("Element $target found at index $result")
    } else {
        println("Element $target not found in the array")
    }
}
