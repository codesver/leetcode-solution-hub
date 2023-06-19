class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val lists = Array(numRows) { mutableListOf<Char>() }
        var ln = 0;
        var acc = 1
        s.forEach { ch ->
            lists[ln].add(ch)
            if ((ln + acc).outOfRange(numRows)) acc *= -1
            ln += acc
        }
        return lists.joinToString("") { it.joinToString("") }
    }

    private fun Int.outOfRange(range: Int) = 0 > this || this >= range
}