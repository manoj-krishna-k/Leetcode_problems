class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        ans.add(new ArrayList<Integer>());
        List<Integer>list1=new ArrayList<Integer>();
        List <Integer>list2=new ArrayList<>();
        for(int i:nums1)list1.add(i);
        for(int i:nums2)list2.add(i);
        for(int i:nums1){
            if(!list2.contains(i)){
                if(!ans.get(0).contains(i))ans.get(0).add(i);
            }
        }
        for(int i:nums2){
            if(!list1.contains(i)){
                if(!ans.get(1).contains(i))ans.get(1).add(i);
            }
        }
        return ans;
    }
}