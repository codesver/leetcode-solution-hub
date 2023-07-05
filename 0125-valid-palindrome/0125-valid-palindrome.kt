class Solution {
    fun isPalindrome(s: String): Boolean {
        var (front, back) = 0 to s.lastIndex
        while (front < back) {
            if (!s[front].isLetterOrDigit()) front++
            else if (!s[back].isLetterOrDigit()) back--
            else if (!s[front].equals(s[back], ignoreCase = true)) return false
            else {
                front++
                back--
            }
        }
        return true
    }
}