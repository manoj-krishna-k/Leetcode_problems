class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=0,maxIndex=0;
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                minIndex=i;
                min=nums[i];
            }
            if(nums[i]>max){
                maxIndex=i;
                max=nums[i];
            }
        }
        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);
        
        int n=nums.length;
        return Math.min(right+1,Math.min(n-left,(left+1+n-right)));
        
    }
}