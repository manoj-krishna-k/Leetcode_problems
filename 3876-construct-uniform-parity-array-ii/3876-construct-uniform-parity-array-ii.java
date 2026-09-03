class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int min=Integer.MAX_VALUE;
        boolean odd=true,even=true;
        for(int i=0;i<n;i++){
            
            if(nums1[i]%2!=0){
                even=false;
                min=Math.min(min,nums1[i]);
            }else if(nums1[i]%2==0){
                odd=false;
            }

        }
        if(odd||even)return true;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                if(min>=nums1[i])return false;

            }
        }
        return true;
    }
}