class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;

        Map<Character,Integer> dict1=new HashMap<>();
        Map<Character,Integer> dict2=new HashMap<>();

        for(Character c:word1.toCharArray()){
            dict1.put(c,dict1.getOrDefault(c,0)+1);
        }

        for(Character c:word2.toCharArray()){
            dict2.put(c,dict2.getOrDefault(c,0)+1);
        }

        ArrayList<Character>keyset1=new ArrayList<>(dict1.keySet());
        ArrayList<Integer>valueset1=new ArrayList<>(dict1.values());
        ArrayList<Character>keyset2=new ArrayList<>(dict2.keySet());
        ArrayList<Integer>valueset2=new ArrayList<>(dict2.values());
        Collections.sort(keyset1);
        Collections.sort(valueset1);
        Collections.sort(keyset2);
        Collections.sort(valueset2);

        return keyset1.equals(keyset2)&& valueset1.equals(valueset2);
    }
}