class Solution {
    fun generate(numRows: Int) = mutableListOf(listOf(1)).also { list ->
        repeat(numRows - 1) {
            val preRow = list.last()
            val row = mutableListOf(preRow.first())
            for (col in 0..preRow.size - 2) row.add(preRow[col] + preRow[col + 1])
            list.add(row.apply { add(preRow.last()) })
        }
    }
}