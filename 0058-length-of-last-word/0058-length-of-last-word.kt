class Solution {
    fun lengthOfLastWord(s: String): Int =
        s.reversed().replaceFirst(Regex(" *"), "").mapIndexed { idx, ch -> if (ch == ' ') return idx }.size
}