class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            visited[i]=false;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if (!visited[i]){
                dfs(visited,isConnected,i);
                count++;

            }
        }return count;
    }
    public void dfs(boolean []visited,int [][]isConnected,int city){
        int n=isConnected.length;
        visited[city]=true;
        for(int i=0;i<n;i++){
            if (isConnected[city][i]==1 && !visited[i]){
                dfs(visited,isConnected,i);
            }
        }


    }
}