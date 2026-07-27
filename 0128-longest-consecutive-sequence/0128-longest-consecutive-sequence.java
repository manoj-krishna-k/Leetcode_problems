class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        while (i<n){
            int temp=1;
            int j=i;
            while(j+1<n){
               if(nums[j]==nums[j+1]){
                j++;
                continue;

               }
               if(nums[j]+1==nums[j+1]){
                j++;
                temp++;
               }else{
                break;
               }
            }
            i=j+1;
            count=Math.max(count,temp);
            
        }
        return count;
    }
}