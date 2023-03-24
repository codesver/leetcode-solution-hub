import java.math.BigInteger

class Solution {
    fun addTwoNumbers(la: ListNode?, lb: ListNode?): ListNode? {
        return decimalToListNode(listNodeToDecimal(la).add(listNodeToDecimal(lb)))
    }

    private fun listNodeToDecimal(listNode: ListNode?): BigInteger {
        var str = ""
        var node: ListNode? = listNode
        while (node != null) {
            str += node.`val`
            node = node.next
        }
        return str.reversed().toBigInteger()
    }

    private fun decimalToListNode(decimal: BigInteger): ListNode? {
        val root = ListNode(0)
        var node = root
        decimal.toString().reversed().toCharArray().map { Character.getNumericValue(it) }.forEach {
            node.next = ListNode(it)
            node = node.next!!
        }
        return root.next
    }
}