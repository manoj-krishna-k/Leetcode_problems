class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        List<Integer>list= new ArrayList<>();
        for(Map.Entry<Integer,Integer> ms:map.entrySet()){
            if(list.contains(ms.getValue()))return false;
            list.add(ms.getValue());
        }
        return true;
    }
}