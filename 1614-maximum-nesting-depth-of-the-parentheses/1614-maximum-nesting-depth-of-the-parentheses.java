class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }
            if(c==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}