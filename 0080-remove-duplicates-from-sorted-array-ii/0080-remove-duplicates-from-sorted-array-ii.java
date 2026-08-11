class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        int k=0;
        for(int x:nums){
            if(k<2||nums[k-2]!=x){
                nums[k]=x;
                k++;
                }
        }
        return k;
    }
}