import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxProfit(prices: IntArray) = prices.slice(1..prices.lastIndex)
        .fold(0 to prices.first()) { (maxProfit, minCost), cost ->
            max(maxProfit, cost - minCost) to min(minCost, cost)
        }.first
}