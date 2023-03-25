class Solution {
    fun romanToInt(s: String): Int {
        val str = s + "I"
        var it = 1
        var sum = 0
        while (it < str.length) {
            sum += when (str[it]) {
                'I' -> convert(str[it++ - 1])
                else -> if (str[it - 1] == map(str[it])) {
                    it += 2;
                    convert(str[it - 2]) - convert(str[it - 3])
                } else convert(str[it++ - 1])
            }
        }
        return sum
    }

    private fun convert(ch: Char): Int = when (ch) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }

    private fun map(ch: Char): Char = when (ch) {
        'V', 'X' -> 'I'
        'L', 'C' -> 'X'
        'D', 'M' -> 'C'
        else -> '\u0000'
    }
}