class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profitt = prices[i] - minPrice;
                if (profitt > profit) {
                    profit = profitt;
                }
            }
        }
        return profit;
    }
}