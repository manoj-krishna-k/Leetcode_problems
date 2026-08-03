class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words=sentence.split(" ");
        Collections.sort(dictionary,(a,b)->a.length()-b.length());
        String res="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            
            for(String s:dictionary){
                if(word.length()<s.length())continue;
                if(s.equals(word.substring(0,s.length()))){
                    words[i]=s;
                    break;
                }
            }
            res+=words[i]+" ";

        }
        
        return res.strip();

        
    }
}