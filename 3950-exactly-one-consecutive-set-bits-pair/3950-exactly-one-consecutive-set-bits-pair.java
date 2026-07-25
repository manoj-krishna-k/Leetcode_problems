class Solution {
    public boolean consecutiveSetBits(int n) {
        char arr[]=(Integer.toString(n,2)).toCharArray();
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]=='1' && arr[i-1]==arr[i])count++;
        }
        return count==1;
    }
}