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
    
    fun inorderTraversal(root: TreeNode?): List<Int> = mutableListOf<Int>().apply { search(root, this) }

    private fun search(root: TreeNode?, list: MutableList<Int>) {
        if (root != null) {
            search(root.left, list)
            list.add(root.`val`)
            search(root.right, list)
        }
    }
}