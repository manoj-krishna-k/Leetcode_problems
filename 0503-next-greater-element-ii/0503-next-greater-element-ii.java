class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j<n && nums[i]>=nums[j])j++;
            if(j>=n){
                j=0;
                while(j<i&& nums[i]>=nums[j])j++;
                if(j>=i)ans[i]=-1;
                else{
                    ans[i]=nums[j];
                }

            }
            else{
                ans[i]=nums[j];
            }

        }return ans;
    }
}