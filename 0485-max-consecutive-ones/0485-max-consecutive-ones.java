class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        int n=nums.length,i=0;
        while(i<n){
            if(nums[i]==1){
                count++;
                max=Math.max(count,max);
                i++;
                continue;
            }
            
            i++;
            count=0;
        }
        return max;
    }
}