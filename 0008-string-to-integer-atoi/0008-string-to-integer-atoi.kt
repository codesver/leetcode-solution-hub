class Solution {
    fun myAtoi(s: String) = s.trimStart().checkSign().let { (string, sign) ->
        try {
            string.replace(Regex("[^0-9*].*"), "").ifEmpty { "0" }.toInt() * if (sign) 1 else -1
        } catch (outOfIntRange: NumberFormatException) {
            if (sign) Int.MAX_VALUE else Int.MIN_VALUE
        }
    }

    private fun String.checkSign() =
        if (startsWith("+")) Pair(substring(1), true)
        else if (startsWith("-")) Pair(substring(1), false)
        else Pair(this, true)
}