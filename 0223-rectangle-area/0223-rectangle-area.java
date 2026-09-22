class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area=((ax2-ax1)*(ay2-ay1)+(bx2-bx1)*(by2-by1));
        int length=0;
        int width=0;
        if(bx1<ax2 && bx2>ax1){
            length=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        }
        if(by1<ay2 && by2>ay1){
            width=Math.min(by2,ay2)-Math.max(by1,ay1);
        }
        return area-length*width;
    }
}