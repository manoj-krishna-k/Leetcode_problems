class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int ans=-1;
        int start=0;
        int total=0;
        int tank=0;
        for(int i=0;i<n;i++){
            int d=gas[i]-cost[i];
            total+=d;
            tank+=d;
            if(tank<0){
                start=i+1;
                tank=0;
            }

        }
        if(total<0)return -1;

        return start;
    }
}