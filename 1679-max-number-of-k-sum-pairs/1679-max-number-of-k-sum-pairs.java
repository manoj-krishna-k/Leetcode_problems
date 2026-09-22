class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            int total=nums[i]+nums[j];
            if(total==k){
                count++;
                i++;
                j--;
            }
            if(total<k){
                i++;
            }
            if(total>k)j--;
        }
        return count;
    }
}