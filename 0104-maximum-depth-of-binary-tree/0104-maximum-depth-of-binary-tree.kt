import java.util.*

class Solution {

    class Node(var depth: Int, var tree: TreeNode?)

    fun maxDepth(root: TreeNode?): Int = LinkedList<Node>().run {
        if (root != null) offer(Node(1, root))
        while (isNotEmpty()) {
            val node = poll()
            if (node.tree!!.left != null) offer(Node(node.depth + 1, node.tree!!.left))
            if (node.tree!!.right != null) offer(Node(node.depth + 1, node.tree!!.right))
            if (isEmpty()) return node.depth
        }
        return 0
    }
}