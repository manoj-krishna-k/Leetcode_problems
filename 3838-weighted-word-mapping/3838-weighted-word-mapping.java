class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        int[] nums=new int[words.length];
        for(int i=0;i<words.length;i++){
            int tot=0;
            for(char c:words[i].toCharArray()){
                tot+=weights[c-'a'];
            }
            tot=tot%26;
            nums[i]=tot;
        }
        String ans="";
        for(int num:nums){
            ans+=(char)('z'-num);
        }
        return ans;
    }
}