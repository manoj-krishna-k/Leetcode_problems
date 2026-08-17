class Solution {
    int dp[][];
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int prefix[]=new int[n+1];
        dp=new int[n][n];

        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+stoneValue[i];
        }
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,n-1,prefix);
    }
    public int solve(int left,int right,int[] prefix){
        if(left==right)return 0;
        if(dp[left][right]!=-1)return dp[left][right];
        int ans=0;
        for(int i=left;i<right;i++){
            int lsum=prefix[i+1]-prefix[left];
            int rsum=prefix[right+1]-prefix[i+1];
            
            if(lsum<rsum){
                ans=Math.max(ans,lsum+solve(left,i,prefix));
            }else if(lsum>rsum){
                ans=Math.max(ans,rsum+solve(i+1,right,prefix));
            }else{
                ans=Math.max(ans,Math.max(lsum+solve(left,i,prefix),rsum+solve(i+1,right,prefix)));
            }
            

        }
        dp[left][right]=ans;
        return ans;
    }
}