import kotlin.math.pow

class Solution {
    fun titleToNumber(columnTitle: String) = columnTitle.reversed().mapIndexed { i, c ->
        (26.0).pow(i).toInt().times(c.toInt() - 64)
    }.sum()
}