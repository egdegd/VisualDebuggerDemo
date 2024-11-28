class Node<Int>(var value: Int) {
    var next: Node<Int>? = null
    var prev: Node<Int>? = null
}

fun add(head: Node<Int>, x: Int) {
    val newNode = Node(x)
    var current = head
    while ((current.value < x) && (current.next != null)){
        current = current.next!!
    }
    if ((current.next == null) && (current.value < x)) {
        newNode.prev = current
        current.next = newNode
    } else {
        newNode.next = current
        newNode.prev = current.prev
        current.prev?.next = newNode
        current.prev = newNode
    }

}

fun main() {
    var head = Node(1)
    add(head, 2)
    add(head, 3)
    add(head, 4)
}
