class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        double median=0;

        int arr[]=new int[size];
        for(int i=0;i<nums1.length;i++)arr[i]=nums1[i];
        for(int i=0;i<nums2.length;i++)arr[i+nums1.length]=nums2[i];
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            if(size%2==0){
                if(i==((size/2)-1)){
                    median=(arr[i]+arr[i+1])/2.0;
                }
            }
            if(size%2!=0){
                if(i==(((size+1)/2)-1)){
                    median=arr[i];
                }
            }
        }
       
return median;
    } 
}