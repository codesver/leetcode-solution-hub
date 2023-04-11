import java.util.Stack

class Solution {
    fun removeStars(s: String): String = Stack<Char>().apply {
        s.forEach {
            if (it in 'a'..'z') push(it)
            else pop()
        }
    }.joinToString("")
}