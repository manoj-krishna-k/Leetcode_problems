class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int i=1;
        while(i<n-1){
            if (nums[i-1]>nums[i]){
                break;
            }i++;
        }
        int[] sub1=Arrays.copyOfRange(nums,i,n);
        int[] sub2=Arrays.copyOfRange(nums,0,i);
        
        for(int j=0;j<sub1.length;j++){
            
            if(sub1[j]==target){
                
                return sub2.length+j;
            }
        }
        for(int j=0;j<sub2.length;j++){
            if(sub2[j]==target)return j;
        }
        return -1;
    }
}