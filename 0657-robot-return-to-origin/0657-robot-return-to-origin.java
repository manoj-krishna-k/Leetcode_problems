class Solution {
    public boolean judgeCircle(String moves) {
        int arr[]={0,0};
        for(int i=0;i<moves.length();i++){
            char a=moves.charAt(i);
            switch(a){
                case 'U':
                    arr[1]++;
                    break;
                case 'D':
                    arr[1]--;
                    break;
                case 'L':
                    arr[0]--;
                    break;
                case 'R':
                    arr[0]++;
                    break;
                default:
                    continue;
            }
        }
        if(arr[0]==0 && arr[1]==0){
            return true;
        }
        return false;
    }
}