class Solution {
    int dp[][];
    
    public int share(int[] prices,int i,int can){
        if(i>=prices.length)return 0;
        if(dp[i][can]!=Integer.MIN_VALUE)return dp[i][can];

        if(can==1){
            
            int buy=share(prices,i+1,0)-prices[i];
            int skip=share(prices,i+1,1);
            dp[i][can]=Math.max(buy,skip);
        }else{
        
            int sell=prices[i]+share(prices,i+1,1);
            int skip=share(prices,i+1,0);
            dp[i][can]=Math.max(sell,skip);
        }
        
        return dp[i][can];

    }
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int i[]:dp){
            Arrays.fill(i,Integer.MIN_VALUE);
        }

        return share(prices,0,1);
    }
}