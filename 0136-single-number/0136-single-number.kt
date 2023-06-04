class Solution {
    fun singleNumber(nums: IntArray) =
        nums.toList().groupingBy { it }.eachCount().filter { it.value == 1 }.keys.first()
}