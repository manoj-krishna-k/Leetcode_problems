class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int n=nums.length;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            if(sum<target)continue;
            while(sum>=target){
                sum-=nums[left];
                left++;
            }
            ans=Math.min(ans,right-left+1);


        }
        return ans==Integer.MAX_VALUE?0:ans+1;

    }
}