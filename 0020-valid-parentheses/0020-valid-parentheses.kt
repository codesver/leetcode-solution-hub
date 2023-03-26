import java.util.*

class Solution {
    fun isValid(s: String): Boolean = object : Stack<Char>() {
        init {
            s.forEach { if (isNotEmpty() && it - peek() in 1..2) pop() else push(it) }
        }
    }.isEmpty()
}