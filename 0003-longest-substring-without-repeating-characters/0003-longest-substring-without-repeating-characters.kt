import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0
        val map = HashMap<Char, Int>()
        return s.toCharArray().mapIndexed { index, ch ->
            start = max(start, (map[ch] ?: -1) + 1)
            map[ch] = index
            index - start + 1
        }.maxOrNull() ?: 0
    }
}

// Written because LeetCode Kotlin version is TOO LOW to use this function
fun <T : Comparable<T>> Iterable<T>.maxOrNull(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var max = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}