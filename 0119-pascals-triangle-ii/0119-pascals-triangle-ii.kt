class Solution {
    fun getRow(rowIndex: Int) = (1..rowIndex).fold(listOf(1)) { preRow, _ ->
        val row = mutableListOf(1)
        for (col in 0 until preRow.lastIndex) 
            row.add(preRow[col] + preRow[col + 1])
        row.apply { add(1) }
    }
}