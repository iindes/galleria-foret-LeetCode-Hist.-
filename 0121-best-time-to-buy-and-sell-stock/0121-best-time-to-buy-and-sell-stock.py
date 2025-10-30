class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minprice = prices[0]
        maxprof = 0
        for p in prices[1:]:
            maxprof = max(maxprof, p-minprice)
            minprice = min(p,minprice)
        return maxprof