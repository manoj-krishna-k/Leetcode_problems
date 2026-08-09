class Solution {
        int n;
        int [][]dp;
        int []suffix;
        
    public int stoneGameII(int[] piles) {
       n=piles.length;
       suffix=new int[n+1];

       for(int i=n-1;i>=0;i--){
        suffix[i]=suffix[i+1]+piles[i];

       } 
       dp=new int[n][n+1];
       return dfs(piles,0,1);

    }
    int dfs(int[] piles,int i,int M){
        if(i+2*M>=n)return suffix[i];
        if(dp[i][M]!=0)return dp[i][M];
        int best=0;
        for(int X=1;X<=2*M;X++){
            int opponent=dfs(piles,X+i,Math.max(X,M));
            int curr=suffix[i]-opponent;
            best=Math.max(best,curr);

        }
        dp[i][M]=best;
        return best;
    }
}