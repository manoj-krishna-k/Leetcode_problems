class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        int max[]=new int[n];
        int min[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                max[i]=nums[i];

            }else{
                max[i]=Math.max(nums[i],max[i-1]);
            }
            
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                min[i]=nums[i];

            }else{
                min[i]=Math.min(nums[i],min[i+1]);
            }
            
        }
        
        for(int i=0;i<n;i++){
            int instability=max[i]-min[i];
            if(instability<=k)return i;
        }
        return -1;

    }
}