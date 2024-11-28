class ListNode2(var `val`: Int) {
    var next: ListNode2? = null

    constructor(`val`: Int, next: ListNode2?) : this(`val`) {
        this.next = next
    }
}

fun rotateRight(head: ListNode2?, k: Int): ListNode2? {
    if (k < 1 || head == null || head.next == null) {
        return head
    }

    var last: ListNode2 = head
    var length = 1

    while (last.next != null) {
        length++
        last = last.next!!
    }

    last.next = head

    val rotations = k % length
    val n = length - rotations

    var newLast: ListNode2 = head
    for (i in 0 until n - 1) {
        newLast = newLast.next!!
    }

    val newHead = newLast.next
    newLast.next = null

    last = head
    return newHead
}


fun main() {
    val node5 = ListNode2(5)
    val node4 = ListNode2(4, node5)
    val node3 = ListNode2(3, node4)
    val node2 = ListNode2(2, node3)
    val node1 = ListNode2(1, node2)

    var rotatedList = rotateRight(node1, 2)

    while (rotatedList != null) {
        print("${rotatedList.`val`} ")
        rotatedList = rotatedList.next
    }
}
