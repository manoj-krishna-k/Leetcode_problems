class Solution {
    public boolean isSubsequence(String s,String w){
        int i=0;
        int j=0;
        while(i<s.length() && j<w.length()){
            if(s.charAt(i)==w.charAt(j))j++;
            i++;

        }
        return j==w.length();
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String ans="";
        for(String word:dictionary){
            if(isSubsequence(s,word)){
                if(word.length()>ans.length() || (word.length()==ans.length() && word.compareTo(ans)<0))ans=word;

            }
        }
        return ans;
    }
}