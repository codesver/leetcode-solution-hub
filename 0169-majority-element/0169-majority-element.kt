class Solution {
    fun majorityElement(nums: IntArray): Int {
        HashMap<Int, Int>().also { map ->
            nums.forEach { num ->
                map.merge(num, 1, Int::plus)
                if ((map[num] ?: 0) > nums.size / 2) return num
            }
        }
        throw RuntimeException("Should not reach here")
    }
}