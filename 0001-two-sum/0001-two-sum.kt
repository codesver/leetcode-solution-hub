class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.indices.forEach {
            if (map.containsKey(target - nums[it])) return intArrayOf(it, map[target - nums[it]]!!)
            map[nums[it]] = it
        }
        return intArrayOf()
    }
}