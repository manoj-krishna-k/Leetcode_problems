/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       
        ListNode curr=head;

        
        int max=-1,min=Integer.MAX_VALUE;

        
        int lastcritical=-1;
        int firstcritical=-1;
        ListNode prev=head;
        curr=curr.next;
        int i=0;
        while(curr.next!=null){
            boolean cond=((curr.val>prev.val&& curr.val>curr.next.val)||(curr.val<prev.val&&curr.val<curr.next.val));
            if(cond){
                if(firstcritical==-1){
                    firstcritical=i;
                }else{
                    min=Math.min(min,i-lastcritical);
                    max=i-firstcritical;
                    
                }lastcritical=i;

            }
            prev=curr;
            curr=curr.next;
            i++;

        }
       if(firstcritical==-1||firstcritical==lastcritical){
        return new int[]{-1,-1};
       }
       return new int[]{min,max};



    }
}