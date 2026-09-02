class Solution {
    public void rotate(int[] nums, int k) {
        int []nums2=new int[nums.length];
        
        
        Arrays.fill(nums2,-1);
        int n=nums.length;
        k = k % n;
        int j=0;
        for(int i=n-k;i<n;i++){
            nums2[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            nums2[j++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=nums2[i];
        }
    }
}