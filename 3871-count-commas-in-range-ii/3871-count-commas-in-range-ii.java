class Solution {
    public long countCommas(long n) {
        
        long ans=0;
        long comma=1;

        for(long start=1000;start<=n;start*=1000){
            long end=start*1000-1;
            long count=Math.min(end,n)-start+1;
            ans+=count*comma;
            comma++;

        }
        return ans;
    }
}