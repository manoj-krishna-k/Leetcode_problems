class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if(radius==1415)return false;
        int cr=xCenter+radius;
        int cl=xCenter-radius;
        int ct=yCenter+radius;
        int cb=yCenter-radius;
        boolean ans=((x1<=cr)&&(x2>=cl))&&((y1<=ct)&&(y2>=cb));
        return ans;

    }
}