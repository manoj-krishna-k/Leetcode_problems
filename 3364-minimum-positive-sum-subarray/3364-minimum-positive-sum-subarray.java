class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        long dp[]=new long[n+1];
        dp[0]=0;
        long ans=Long.MAX_VALUE;

        for(int i=0;i<n;i++)dp[i+1]=dp[i]+nums.get(i);
        for(int i=l;i<=r;i++){
            for(int right=i;right<=n;right++){
                int left=right-i;
                long sum=dp[right]-dp[left];
                if(sum>0)ans=Math.min(ans,sum);
            }
        }
        return ans==Long.MAX_VALUE?-1:(int)ans;
    }
}