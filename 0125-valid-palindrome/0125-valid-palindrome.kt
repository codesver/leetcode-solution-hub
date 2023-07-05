class Solution {
    fun isPalindrome(s: String): Boolean {
        var (front, back) = 0 to s.lastIndex
        while (front < back) {
            if (s[front].isLetterOrDigit() && s[back].isLetterOrDigit()) {
                if (s[front].equals(s[back], ignoreCase = true)) {
                    front++
                    back--
                } else return false
            } else if (!s[front].isLetterOrDigit()) front++
            else if (!s[back].isLetterOrDigit()) back--
        }
        return true
    }
}