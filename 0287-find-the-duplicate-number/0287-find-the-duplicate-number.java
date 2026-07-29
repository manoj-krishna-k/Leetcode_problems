class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer>list= new ArrayList<>();

        Map<Integer,Long>hs=Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        for(Map.Entry<Integer,Long> map:hs.entrySet()){
            if(map.getValue()>1)return map.getKey();

        }
        return -1;
    }
}