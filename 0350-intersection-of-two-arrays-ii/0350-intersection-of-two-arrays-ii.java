class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Long>map1=Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        Map<Integer,Long>map2=Arrays.stream(nums2).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        ArrayList<Integer>list=new ArrayList<>();
        
        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                long count = Math.min(map1.get(key), map2.get(key));
                for (int i = 0; i < count; i++) {
                    list.add(key);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    
        
        
    }
}