fun printSnakeOrder(matrix: Array<IntArray>) {
    var i = 0
    var j = 0

    while (i < matrix.size) {
        if (i % 2 == 0) {
            // Left to right for even rows
            j = 0
            while (j < matrix[i].size - 1) {
                println(matrix[i][j])
                j++
            }
        } else {
            // Right to left for odd rows
            j = matrix[i].size - 1
            while (j > 0) {
                println(matrix[i][j])
                j--
            }
        }
        i++
    }
}

fun main() {
    val n = 3
    val arr = Array(n) { i -> IntArray(n) { j -> i * n + j + 1 } }

    println("Matrix in snake order:")
    printSnakeOrder(arr)
}
