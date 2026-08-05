class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq=new int[26];
        for(char ch:words[0].toCharArray()){
            freq[ch-'a']++;

        }
        for(int i=1;i<words.length;i++){
            int temp[]=new int[26];
            for(char x:words[i].toCharArray())temp[x-'a']++;
            for(int j=0;j<26;j++){
                freq[j]=Math.min(freq[j],temp[j]);

            }

        }
        List<String>list=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(freq[i]-->0)list.add(String.valueOf((char)('a'+i)));
        }
        return list;
    }
}