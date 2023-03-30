class Solution {
    fun plusOne(digits: IntArray): IntArray = digits.joinToString("")
            .toBigInteger().inc().toString()
            .toCharArray().map { Character.getNumericValue(it) }.toIntArray()
}