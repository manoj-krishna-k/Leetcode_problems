class Solution {
    public int missingInteger(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        for(int n:nums)arr.add(n);
        int i=0;
        int n=nums.length;
        int sum=nums[0];
       
        int j=1;
        while(j<n && nums[j]==nums[j-1]+1){
            sum+=nums[j];
            j++;

        }
        while(arr.contains(sum)){
            sum++;
        }
        
           
        
        
        
        return sum;
    }
}