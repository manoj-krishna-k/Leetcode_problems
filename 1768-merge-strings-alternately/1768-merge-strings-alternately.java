class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        String s="";
        while(i<n && j<m){
            s+=word1.charAt(i);
            s+=word2.charAt(j);
            i++;
            j++;
        }
        while(i<n){
            s+=word1.charAt(i);
            i++;
        }
        while(j<m){
            s+=word2.charAt(j);
            j++;
        }
        return s;

    }
}