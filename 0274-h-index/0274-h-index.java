class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<citations.length;i++){
        if(citations[n-i-1]>=i+1){
            hs.put(i+1,hs.getOrDefault(i,0)+1);
        }

        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(Map.Entry<Integer,Integer> m:hs.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                ans=m.getKey();
            }
        }
        return ans;
    }
}