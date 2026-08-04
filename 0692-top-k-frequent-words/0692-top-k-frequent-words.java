class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Long> map=Arrays.stream(words).collect(Collectors.groupingBy(n->n,Collectors.counting()));
        List<Integer> list=new ArrayList<>();
        Map<String,Long> result=map.entrySet().stream().sorted((a, b) -> {
    int cmp = Long.compare(b.getValue(), a.getValue());
    if (cmp == 0)
        return a.getKey().compareTo(b.getKey());
    return cmp;
}).limit(k).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
        List<String>ans=new ArrayList<>();
        for(Map.Entry<String,Long> ms:result.entrySet())ans.add(ms.getKey());
        return ans;

    }
}