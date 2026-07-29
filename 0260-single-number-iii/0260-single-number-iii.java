class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer>list= new ArrayList<>();

        Map<Integer,Long>hs=Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        for(Map.Entry<Integer,Long> map:hs.entrySet()){
            if(map.getValue()==1)list.add(map.getKey());
        }

        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}