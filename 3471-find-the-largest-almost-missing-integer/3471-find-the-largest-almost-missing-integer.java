class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        HashMap<Integer,Integer>map=new HashMap<>();

        
        for(int right=k-1;right<n;right++){
            HashSet<Integer>set=new HashSet<>();
            for(int i=left;i<=right;i++){
                set.add(nums[i]);

            }
            for(int x:set){
               map.put(x,map.getOrDefault(x,0)+1);
            }
                left++;

        }
        int ans=-1;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}