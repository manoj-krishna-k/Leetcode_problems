class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int zc=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)zc++;
            if(zc>1){
                ans=Math.max(ans,right-left-1);
                if(nums[left]==0)zc--;
                left++;
            }
            if(right==n-1)ans=Math.max(ans,right-left);
        }
        return ans;
    }
}