class Solution {
    public int distributeCandies(int[] candyType) {
        int max=candyType.length/2;
        HashSet<Integer> hs=new HashSet<Integer>();
        for (int candy:candyType){
            hs.add(candy);
        }
        System.out.print(hs);
        max=Math.min(max,hs.size());
        return max;
    }
}