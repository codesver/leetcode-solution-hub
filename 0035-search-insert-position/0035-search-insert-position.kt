class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int = nums.mapIndexed { idx, num ->
        if (num >= target) return idx
    }.size
}