import java.util.Stack

class Solution {
    fun isValid(s: String): Boolean = Stack<Char>().apply {
        s.forEach { if (isNotEmpty() && it - peek() in 1..2) pop() else push(it) }
    }.isEmpty()
}