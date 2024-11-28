fun threeSum(arr: IntArray): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    arr.sort()
    val n = arr.size

    for (i in 0 until n) {
        if (i != 0 && arr[i] == arr[i - 1]) continue

        var j = i + 1
        var k = n - 1

        while (j < k) {
            val sum = arr[i] + arr[j] + arr[k]

            when {
                sum < 0 -> j++
                sum > 0 -> k--
                else -> {
                    ans.add(listOf(arr[i], arr[j], arr[k]))
                    j++
                    k--
                    while (j < k && arr[j] == arr[j - 1]) j++
                    while (j < k && arr[k] == arr[k + 1]) k--
                }
            }
        }
    }

    return ans
}

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val result = threeSum(nums)
    println("Triplets that sum to zero:")
    for (triplet in result) {
        println(triplet)
    }
}


