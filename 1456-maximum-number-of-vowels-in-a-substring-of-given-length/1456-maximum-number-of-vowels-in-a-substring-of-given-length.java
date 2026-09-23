class Solution {
    public int maxVowels(String s, int k) {
        int sum=0;
        String vowels="aeiou";
        for(int i=0;i<k;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                sum++;
            }
        }
        int max=sum;
        for(int i=k;i<s.length();i++){
            
            if(vowels.indexOf(s.charAt(i))!=-1)sum++;
            if(vowels.indexOf(s.charAt(i-k))!=-1)sum--;
            max=Math.max(max,sum);
            
        }
        return max;
    }
}