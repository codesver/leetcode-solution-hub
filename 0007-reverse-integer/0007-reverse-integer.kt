import kotlin.math.abs

class Solution {
    fun reverse(x: Int) = try {
        abs(x).toString().reversed().toInt() * if (x < 0) -1 else 1
    } catch (e: NumberFormatException) {
        0
    }
}