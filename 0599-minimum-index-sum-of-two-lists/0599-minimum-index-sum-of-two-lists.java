class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String>l1=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        for(String s:list1)l1.add(s);
        for(int i=0;i<list2.length;i++){
            if(l1.contains(list2[i])){
                map.put(list2[i],Math.min(map.getOrDefault(list2[i],Integer.MAX_VALUE),i+l1.indexOf(list2[i])));
            }
        }
        Map<Integer,List<String>>res=new HashMap<>();
        for(Map.Entry<String,Integer> set:map.entrySet()){
            List<String> list = res.getOrDefault(set.getValue(), new ArrayList<>());
            list.add(set.getKey());
            res.put(set.getValue(), list);
        }
        int smallest=3245;
        for(Map.Entry<Integer,List<String>> set:res.entrySet()){
            if(set.getKey()<smallest)smallest=set.getKey();
        }
        List<String> fin=res.get(smallest);
        String[] ans=new String[fin.size()];
        for(int i=0;i<fin.size();i++){

            ans[i]=fin.get(i);
        }
        return ans;
    }
}