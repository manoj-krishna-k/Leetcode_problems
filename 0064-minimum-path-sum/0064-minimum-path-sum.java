class Solution {
    int[][]memo;
    int mat[][];
    int m,n;
    
    public int minPathSum(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        mat=grid;
        memo=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(memo[i],-1);
        }
        return dfs(0,0);

    }
    public int dfs(int i,int j){
        if(i==m-1 && j==n-1){
            return mat[i][j];
        }
        if(i<0 || i>=m ||j<0||j>=n ){
            return Integer.MAX_VALUE;
        }
        if(memo[i][j]!=-1)return memo[i][j];
        
        int right=dfs(i,j+1);
        int down=dfs(i+1,j);
        return memo[i][j]=mat[i][j]+Math.min(right,down);
    }

}