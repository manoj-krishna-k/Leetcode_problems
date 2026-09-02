class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        boolean dec=nums1[0]%2==0;
        int i;
        for(i=0;i<n;i++){
            if ((nums1[i] % 2 == 0) != dec) break;

        }
        if(i==n){
            return true;
        }
        boolean even=false;
        
        for(i=0;i<n;i++){
            if(nums1[i]%2!=0){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        int temp=nums1[i]-nums1[j];
                        if(temp%2==0){
                            even=true;
                            break;
                        }
                    }
                }
            }
        }
        if(even)return even;
        boolean odd=false;
        
        for(i=0;i<n;i++){
            if(nums1[i]%2==0){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        int temp=nums1[i]-nums1[j];
                        if(temp%2!=0){
                            odd=true;
                            break;
                        }
                    }
                }
            }
        }
        if(odd)return odd;
        return false;




    }
}