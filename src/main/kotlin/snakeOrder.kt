fun printSnakeOrder(matrix: Array<IntArray>) {
    var i = 0

    while (i < matrix.size) {
        if (i % 2 == 0) {
            // Left to right for even rows
            for(j in 0..<matrix[i].size){
                println(matrix[i][j])
            }
        } else {
            // Right to left for odd rows
            for(j in matrix[i].size - 1 downTo 0){
                println(matrix[i][j])
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
