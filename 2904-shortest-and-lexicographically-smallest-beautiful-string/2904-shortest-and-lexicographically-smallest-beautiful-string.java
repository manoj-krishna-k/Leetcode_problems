class Solution {
    

    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int ones=0;
        int n=s.length();
        String ans="";
        int anslen=Integer.MAX_VALUE;

        for(int right=0;right<n;right++){
           
            if(s.charAt(right)=='1')ones++;
            while(ones>k){
                if(s.charAt(left)=='1')ones--;
                left++;
            }
            while(ones==k){
                int len=right-left+1;
                if(anslen>len){
                    anslen=len;
                    ans=s.substring(left,right+1);
                }
                else if(anslen==len){
                    String curr=s.substring(left,right+1);

                    if(curr.compareTo(ans)<0){
                        ans=curr;
                    }
                }
            
            if(s.charAt(left)=='1'){
                
                ones--;

            }
            left++;
        }}
        return ans;
    }
}