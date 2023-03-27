class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int =
        nums.filter { it != `val` }.mapIndexed { idx, num -> nums[idx] = num }.size
}