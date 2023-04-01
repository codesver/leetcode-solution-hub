import kotlin.math.floor
import kotlin.math.sqrt

class Solution {
    fun mySqrt(x: Int): Int = floor(sqrt(x.toDouble())).toInt()
}