class Solution {
    public int compress(char[] chars) {
        int i=0;
        int n=chars.length;
        String s="";
        while(i<n){
            int j=i;
            int count=0;
            while(j<n){
                if(chars[i]==chars[j]){
                    count++;
                    j++;
                }
                else break;
            }
            s+=chars[i];
            if(count!=1)s+=Integer.toString(count);
            i=j;
            
        }
        for(i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}