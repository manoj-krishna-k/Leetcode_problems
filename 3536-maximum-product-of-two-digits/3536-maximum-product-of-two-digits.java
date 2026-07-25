class Solution {
    public int maxProduct(int n) {
        int m=(Integer.toString(n)).length();
        int nums[]=new int[m];
        for(int i=m-1;i>=0;i--){
            nums[i]=n%10;
            n/=10;
        }
        if (m==2){
            return nums[0]*nums[1];
        }
        int prod=nums[0]*nums[1];
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                prod=Math.max(prod,nums[i]*nums[j]);
            }
        }
        return prod;
        
    }
}