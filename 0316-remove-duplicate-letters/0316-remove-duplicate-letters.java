class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count=new int[26];
        boolean[] used=new boolean[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            count[c-'a']++;
        }
        List<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            count[c-'a']--;
            if(used[c-'a'])continue;
            while(!list.isEmpty() && list.get(list.size()-1)>c && count[list.get(list.size()-1)-'a']>0){
                char r=list.remove(list.size()-1);
                used[r-'a']=false;

            }
            list.add(c);
            used[c-'a']=true;

        }
        String ans="";
        for(int i=0;i<list.size();i++){
            ans+=list.get(i);
        }
        return ans;
    }
}