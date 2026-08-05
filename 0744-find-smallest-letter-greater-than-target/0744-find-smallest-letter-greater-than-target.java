class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        Arrays.sort(letters);
        
        for(char ch:letters){
            if (ch>target)return ch;
        }
        return res;
    }
}