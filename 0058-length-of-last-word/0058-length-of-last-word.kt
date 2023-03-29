class Solution {
    fun lengthOfLastWord(s: String): Int = s.split(Regex(" +")).last { it.isNotEmpty() }.length
}