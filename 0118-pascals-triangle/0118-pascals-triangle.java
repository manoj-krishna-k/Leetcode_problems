class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        int n=numRows;
        for(int i=1;i<=n;i++){
            List<Integer>temp=new ArrayList<>();
            if(i==1){
                temp.add(i);
                result.add(temp);
            }
            else{
                List<Integer>curr=new ArrayList<>(result.get(i-2));
                if(curr.size()==1){
                    temp.add(1);
                    temp.add(1);
                    result.add(temp);

                }else{
                    temp.add(1);
                    int j=0;
                    while(j+1<curr.size()){
                        temp.add(curr.get(j)+curr.get(j+1));
                        j++;
                    }
                    temp.add(1);
                    result.add(temp);
                }

            }
        }
        return result;
    }
}