class Solution {
    fun removeDuplicates(nums: IntArray): Int = nums.distinct().mapIndexed { idx, num -> nums[idx] = num }.size
}