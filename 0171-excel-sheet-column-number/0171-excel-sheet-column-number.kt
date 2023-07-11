import kotlin.math.pow

class Solution {
    fun titleToNumber(title: String) = title.indices.map { i ->
        (26.0).pow(i).toInt().times(title[title.length - i - 1].toInt() - 64)
    }.sum()
}