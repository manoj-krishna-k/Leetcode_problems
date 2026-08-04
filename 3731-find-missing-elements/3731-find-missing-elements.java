class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<Integer>();

        for(int i:nums)list.add(i);
        List<Integer>result=new ArrayList<>();

        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(!list.contains(i))result.add(i);
        }
        return result;
    }
}