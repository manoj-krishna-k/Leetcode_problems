class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] answer=new int[k];
        for(int i=0;i<=k;i++){
            int j=k-i;
            if(i>nums1.length || j>nums2.length)continue;
            int a[]=maxSub(nums1,i);
            int b[]=maxSub(nums2,j);
            int merged[]=merge(a,b);
            if(greater(merged,0,answer,0)){
                answer=merged;
            }
        }
        return answer;
    }
    public int[] maxSub(int []a, int k){
        int[] stack=new int[k];
        int top=0;
        int remove=a.length-k;
        for(int num:a){
            while(top>0 && stack[top-1]<num && remove>0){
                top--;
                remove--;

            }
            if(top<k){
                stack[top++]=num;
            }else{
                remove--;
            }
        }
        return stack;

    }
    public int[] merge(int[] a,int b[]){
        int i=0,j=0,r=0;
        int ans[]=new int[a.length+b.length];

        while(i<a.length || j<b.length){
            if(greater(a,i,b,j)){
                ans[r++]=a[i++];

            }else{
                ans[r++]=b[j++];
            }
        }
        return ans;
    }
    public boolean greater(int a[],int i,int[] b, int j){
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                return false;
            }
            if(a[i]>b[j]){
                return true;
            }
            i++;
            j++;
        }
        return i!=a.length;
    }
}