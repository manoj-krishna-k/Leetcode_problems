class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int gre[]=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            int j=i+1;
            while(j<nums2.length && nums2[j]<nums2[i])j++;
            if(j==nums2.length)gre[i]=-1;
            else{
                gre[i]=nums2[j];
            }

        }
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<gre.length;i++){
            map.put(nums2[i],gre[i]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        
        return ans;
    }
}