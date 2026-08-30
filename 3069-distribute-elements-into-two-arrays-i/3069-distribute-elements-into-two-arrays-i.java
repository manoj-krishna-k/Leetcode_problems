class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i!=0 && i!=1){
                if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                    arr1.add(nums[i]);
                    
                }
                else{
                    arr2.add(nums[i]);
                    
                }
            }else{
            if(i%2==0){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }}
        }
        int[] ans=new int[n];
        int j=0;
        for(int i=0;i<arr1.size();i++){
            ans[j]=arr1.get(i);
            j++;
        }
        for(int i=0;i<arr2.size();i++){
            ans[j]=arr2.get(i);
            j++;

        }
        
        return ans;
            }
}