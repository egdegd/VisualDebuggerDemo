class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(`val`: Int, next: ListNode?) : this(`val`) {
        this.next = next
    }
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    if (head == null) return null

    val dummy = ListNode(0)
    dummy.next = head
    var prev: ListNode = dummy
    var current: ListNode? = head

    while (current != null) {
        if (current.next != null && current.`val` == current.next?.`val`) {
            while (current?.next != null && current!!.`val` == current.next?.`val`) {
                current = current.next
            }
            prev.next = current?.next
        } else {
            prev = prev.next!!
        }
        current = current?.next
    }

    return dummy.next
}


fun main() {
    val node5 = ListNode(5)
    val node4_2 = ListNode(4, node5)
    val node4_1 = ListNode(4, node4_2)
    val node3_2 = ListNode(3, node4_1)
    val node3_1 = ListNode(3, node3_2)
    val node2 = ListNode(2, node3_1)
    val node1 = ListNode(1, node2)

    var result = deleteDuplicates(node1)

    while (result != null) {
        print("${result.`val`} ")
        result = result.next
    }
}
