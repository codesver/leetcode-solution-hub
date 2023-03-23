class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = nums.indices.associateBy { nums[it] }
        map.forEach {
            if (map.containsKey(target - it.key) && map[target - it.key] != it.value)
                return intArrayOf(it.value, map[target - it.key]!!)
        }
        return nums.mapIndexed { index, i -> Pair(index, i) }.filter { it.second == target / 2 }.map { it.first }.toIntArray()
    }
}