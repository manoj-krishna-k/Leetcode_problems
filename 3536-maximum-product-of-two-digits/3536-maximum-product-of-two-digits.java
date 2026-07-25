
class Solution {
    public int maxProduct(int n) {
        int m=(Integer.toString(n)).length();
        List<Integer>nums=new ArrayList<>();
        for(int i=m-1;i>=0;i--){
            nums.add(n%10);
            n/=10;
        }
        Collections.sort(nums,Comparator.reverseOrder());
        return nums.get(0)*nums.get(1);

    }
}