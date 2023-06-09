class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray) = nums1.plus(nums2).sorted().let {
        if (it.size % 2 == 0) (it[it.size / 2] + it[it.size / 2 - 1]) / 2.0 
        else it[it.size / 2].toDouble()
    }
}