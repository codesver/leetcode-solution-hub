import java.util.Collections
import java.util.LinkedList

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

    class Node(var index: Int, var treeNode: TreeNode?)

    fun isSymmetric(root: TreeNode?): Boolean {
        val left = LinkedList<Node>().apply { if (root!!.left != null) offer(Node(1, root.left)) }
        val right = LinkedList<Node>().apply { if (root!!.right != null) offer(Node(1, root.right)) }
        while (left.isNotEmpty() && right.isNotEmpty()) {
            val leftNode = left.poll()
            val rightNode = right.poll()

            if (leftNode.treeNode!!.`val` != rightNode.treeNode!!.`val` || leftNode.index != rightNode.index)
                return false
            if (leftNode.treeNode!!.right != null) left.offer(Node(leftNode.index * 2 + 1, leftNode.treeNode!!.right))
            if (leftNode.treeNode!!.left != null) left.offer(Node(leftNode.index * 2 + 2, leftNode.treeNode!!.left))
            if (rightNode.treeNode!!.left != null) right.offer(Node(rightNode.index * 2 + 1, rightNode.treeNode!!.left))
            if (rightNode.treeNode!!.right != null) right.offer(Node(rightNode.index * 2 + 2, rightNode.treeNode!!.right))
        }
        return left.size + right.size == 0
    }
}