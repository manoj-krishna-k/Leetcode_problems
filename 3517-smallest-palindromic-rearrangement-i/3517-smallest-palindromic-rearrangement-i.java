class Solution {
    public String smallestPalindrome(String s) {
        char []ch=s.toCharArray();
        Arrays.sort(ch);
        s=new String(ch);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        int n=s.length();
        int i=0;
        while (i<n){
            int j=i;

            while (j<n && s.charAt(j)==s.charAt(i))j++;
            int freq=j-i;
            for(int k=0;k<freq/2;k++){
                s1.append(s.charAt(i));
                s2.append(s.charAt(i));

            }
            if(freq%2!=0){
                mid.append(s.charAt(i));

            }i=j;
        }
        
        return s1.toString()+mid.toString()+s2.reverse().toString();
        
        
    
    }
    
}