class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int left=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int[] best=new int[n];
        Arrays.fill(best,Integer.MAX_VALUE);
        int len=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            len++;
            while(sum>target){
                len--;
                sum-=arr[left];
                left++;
            }
            if(right>0)best[right]=best[right-1];
            if(sum==target){
                if(left>0&&best[left-1]!=Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[left - 1]);
                }
                best[right]=Math.min(best[right],len);
            }
        }
       
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}