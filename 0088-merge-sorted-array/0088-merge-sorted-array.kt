class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        (m until nums1.size).forEach { nums1[it] = nums2[it - m] }
        nums1.sort()
    }
}