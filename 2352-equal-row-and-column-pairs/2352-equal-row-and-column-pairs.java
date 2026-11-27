class Solution {
    public int equalPairs(int[][] grid) {
        List<List<Integer>> cols=new ArrayList<>();
        List<List<Integer>> rows=new ArrayList<>();
        int n=grid.length;


       for(int[] row:grid){
            List<Integer> currentRow = new ArrayList<>();
            for (int num:row) {
                currentRow.add(num);
            }
            rows.add(currentRow);
        }
        for(int i=0;i<n;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<n;j++){temp.add(grid[j][i]);}
            cols.add(temp);

        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(rows.get(i).equals(cols.get(j)))count++;
            }
        }
        return count;

    }
}