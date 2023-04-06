import java.util.*

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    class Node(var tn: TreeNode?, var index: Int)

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        val qp = LinkedList<Node>().apply { add(Node(p, 0)) }
        val qq = LinkedList<Node>().apply { add(Node(q, 0)) }

        while (qp.isNotEmpty() && qq.isNotEmpty()) {
            val np = qp.poll()
            val nq = qq.poll()
            if (np.tn?.`val` != nq.tn?.`val` || np.index != nq.index) return false

            if (np.tn?.left != null) qp.offer(Node(np.tn!!.left, np.index * 2 + 1))
            if (np.tn?.right != null) qp.offer(Node(np.tn!!.right, np.index * 2 + 2))
            if (nq.tn?.left != null) qq.offer(Node(nq.tn!!.left, nq.index * 2 + 1))
            if (nq.tn?.right != null) qq.offer(Node(nq.tn!!.right, nq.index * 2 + 2))
        }
        return qp.size + qq.size == 0
    }
}