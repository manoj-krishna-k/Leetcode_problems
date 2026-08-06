class Solution {
    int index=0;
    public String solve(String s){
        StringBuilder sb=new StringBuilder();
        while(index<s.length() && s.charAt(index)!=']'){
            char ch=s.charAt(index);
            if(Character.isLetter(ch)){
                sb.append(ch);
                index++;
            }
            else{
                int num=0;
                while(Character.isDigit(s.charAt(index))){
                    num=num*10+(s.charAt(index)-'0');
                    index++;
                }
                index++;
                String in=solve(s);
                index++;
                while(num-->0){
                    sb.append(in);

                }
            }

        }
        return sb.toString();
        

    }
    public String decodeString(String s) {
        return solve(s);
    }
}