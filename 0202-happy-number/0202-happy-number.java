class Solution {
    public boolean isHappy(int n) {
        int count=0;
        while(true){
            if(count>=10000)break;
            int sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
            if(sum==1)return true;
            count++;
        }
        return false;
    }
}