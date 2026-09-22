class Solution {
    public void backtrack(int[]nums, List<Integer>curr,List<List<Integer>>result,int index){
        if(index<=nums.length){
            result.add(new ArrayList<>(curr));
        }
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,curr,result,i+1);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(nums,new ArrayList<Integer>(),result,0);
        return result;
    }
}