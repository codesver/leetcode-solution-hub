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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val ans = ListNode(0)

        var node: ListNode? = ans
        var nodeA = list1
        var nodeB = list2
        
        while (nodeA != null && nodeB != null) {
            if (nodeA.`val` < nodeB.`val`) {
                node!!.next = ListNode(nodeA.`val`)
                nodeA = nodeA.next
            } else {
                node!!.next = ListNode(nodeB.`val`)
                nodeB = nodeB.next
            }
            node = node.next
        }

        if (nodeA != null) node!!.next = nodeA
        else node!!.next = nodeB

        return ans.next
    }
}