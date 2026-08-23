class Solution {
    public boolean sumGame(String num) {
        int half=num.length()/2;
        int leftsum=0,rightsum=0,left=0,right=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            if(i<half){
                if(c=='?')left++;
                else{
                    leftsum+=c-'0';
                }

            }else{
                if(c=='?')right++;
                else{
                    rightsum+=c-'0';
                }
            }
        }
        if((left+right)%2==1)return true;
        return rightsum-leftsum!=((int)(left-right)/2)*9;
    }
}