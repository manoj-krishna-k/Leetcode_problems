import java.util.*;


class Solution {
    public void backtrack(int index,int[] nums,List<List<Integer>> result,List<Integer>curr){
        if(curr.size()>=2){
            result.add(new ArrayList<Integer>(curr));
        }
        HashSet<Integer> used = new HashSet<>();

        for(int i=index;i<nums.length;i++){
            if(used.contains(nums[i]))continue;
            if(!curr.isEmpty() && nums[i]<curr.get(curr.size()-1))continue;
            used.add(nums[i]);
            curr.add(nums[i]);
            backtrack(i+1,nums,result,curr);
            curr.remove(curr.size()-1);

        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(0,nums,result,new ArrayList<>());
        
        return result;

    }
}