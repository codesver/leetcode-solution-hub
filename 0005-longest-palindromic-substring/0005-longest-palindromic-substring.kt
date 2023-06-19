class Solution {
    fun longestPalindrome(s: String): String {
        var longest = ""
        for (start in s.indices) {
            for (end in start until s.length) {
                longest = s.slice(start..end).let { slice ->
                    if (longest.length < slice.length && slice.isPalindrome()) slice
                    else longest
                }
            }
        }
        return longest
    }

    private fun String.isPalindrome(): Boolean {
        for (i in 0 until length / 2) {
            if (get(i) != get(length - i - 1)) {
                return false
            }
        }
        return true
    }
}