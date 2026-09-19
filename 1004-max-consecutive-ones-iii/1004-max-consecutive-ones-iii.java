class Solution {
    public int longestOnes(int[] nums, int k) {
        int zc=0;
        int left=0;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==0)zc++;
        }
        if(zc<=k)return n;
        zc=0;
        for(int right=0;right<n&& left<n;right++){
            if(nums[right]==0)zc++;
            
                
            if(zc>k){
                ans=Math.max(ans,right-left);
                if(nums[left]==0)zc--;
                left++;
                    
            }
            if(right==n-1)ans=Math.max(ans,right-left+1);


        }return ans;
    }
}