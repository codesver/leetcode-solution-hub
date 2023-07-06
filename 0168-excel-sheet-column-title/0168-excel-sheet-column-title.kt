class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var num = columnNumber
        var str = ""
        while (num != 0) {
            if (num % 26 == 0) {
                str = "Z${str}"
                num = num / 26 - 1
            } else {
                str = "${(num % 26 + 64).toChar()}${str}"
                num /= 26
            }
        }
        return str
    }
}