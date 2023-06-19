import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var (start, end, amount) = Triple(0, height.lastIndex, 0)
        while (start < end) {
            amount = max(amount, (end - start) * min(height[start], height[end]))
            if (height[start] >= height[end]) end--
            else if (height[start] < height[end]) start++
        }
        return amount
    }
}