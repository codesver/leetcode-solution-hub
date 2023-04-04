/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        val res = ListNode(-101)
        var node: ListNode = res
        var nextNode = head
        while (nextNode != null) {
            if (node.`val` == nextNode.`val`) nextNode = nextNode.next
            else {
                node.next = ListNode(nextNode.`val`)
                node = node.next!!
                nextNode = nextNode.next
            }
        }
        return res.next
    }
}