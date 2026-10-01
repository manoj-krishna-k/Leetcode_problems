class Solution {
    public boolean isValid(String s) {
        List<Character>stack=new ArrayList<>();
        HashMap<Character,Character>map=new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        for(char c:s.toCharArray()){
            if("{([".indexOf(c)!=-1){
                stack.add(c);
            }
            else if(!stack.isEmpty()){
                if(map.get(c)!=stack.get(stack.size()-1)){
                    return false;
                }else{
                    stack.remove(stack.size()-1);
                }
            }
            else{
                return false;
            }
        }
        if(!stack.isEmpty())return false;
        return true;
    }
}