/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int[] sum(TreeNode root){
        
        if(root==null)return new int[]{0,0};
        int left[]=sum(root.left);
        int right[]=sum(root.right);
        int totSum=root.val+left[0]+right[0];
        int totCount=1+left[1]+right[1];
        if(root.val==totSum/totCount)count++;
        return new int[]{totSum,totCount};
       
    }
    public int averageOfSubtree(TreeNode root) {
        
        int []gar=sum(root);
        return count;
    }
}