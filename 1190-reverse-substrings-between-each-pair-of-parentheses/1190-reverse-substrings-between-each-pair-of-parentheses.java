class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<sb.length()){
            char c=sb.charAt(i);
            

            if(c==')'){
                int j=i-1;
                StringBuilder temp=new StringBuilder();
                while(sb.charAt(j)!='('){
                    if(sb.charAt(j)!='('&& sb.charAt(j)!=')'){
                        temp.append(sb.charAt(j));
                    }
                    j--;
                }
                System.out.println(temp.toString());
                sb.replace(j,i+1,temp.toString());
                i=j;
            }else{
                i++;
            }
            
        }
        return sb.toString();
    }
}