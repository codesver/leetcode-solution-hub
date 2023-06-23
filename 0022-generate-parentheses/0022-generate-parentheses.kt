import java.util.*

class Solution {

    private val list: MutableList<String> = mutableListOf()

    fun generateParenthesis(n: Int): List<String> = list.apply {
        add(Stack(), n, n, "")
    }

    private fun add(stack: Stack<String>, left: Int, right: Int, history: String) {
        if (left + right == 0) {
            if (stack.isEmpty()) list.add(history)
        } else {
            if (left <= right) {
                stack.push("(")
                add(stack, left - 1, right, "$history(")
                stack.pop()
            }
            if (left < right && stack.peek() == "(") {
                stack.pop()
                add(stack, left, right - 1, "$history)")
                stack.push("(")
            }
        }
    }
}