class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>>result=new ArrayList<>();
         part(s,result,new ArrayList<>(),0);
         return result;

    }
    public void part(String s,List<List<String>> result,List<String>temp,int index){
        if(index == s.length()){
        
        result.add(new ArrayList<>(temp));
        return;
    }String e="";

        for(int i=index;i<s.length();i++){


            e+=Character.toString(s.charAt(i));
            if(isPalindrome(e)){
            temp.add(e);
            part(s,result,temp,i+1);
            temp.remove(temp.size()-1);

        }}
   
    }
    public boolean isPalindrome(String e){
        char[] arr=e.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-1-i])return false;
        }
        return true;
    }
}