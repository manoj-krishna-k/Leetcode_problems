class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int ans=0;
        for(int down=-(n-1);down<=n-1;down++){
            for(int right=-(n-1);right<=n-1;right++){
                int count=0;
                for(int row=0;row<=n-1;row++){
                    for(int col=0;col<=n-1;col++){
                        if(img1[row][col]==1){
                            int newrow=row+down;
                            int newcol=right+col;
                            if(newrow>=0 && newrow<=n-1 && newcol>=0 && newcol<n && img2[newrow][newcol]==1){
                                count++;
                            }
                        }
                    }
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}