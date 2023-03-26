class Solution {
    fun longestCommonPrefix(strs: Array<String>) = StringBuilder().apply {
        strs.minBy { it.length }?.forEachIndexed { idx, ch -> if (strs.all { it[idx] == ch }) append(ch) else return toString() }
    }.toString()
}