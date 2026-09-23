class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int num:nums)total+=num;
        int k=total-x;
        if(k<0)return -1;
        if(k==0)return nums.length;
        int left=0;
        int max=-1;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>k){
                sum-=nums[left];
                left++;
            }
            if(sum==k){
                max=Math.max(max,right-left+1);

            }
        }
        return max==-1?-1:nums.length-max;
    }
}