import java.util.Collections;


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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode sample=new ListNode(0);
        ListNode temp=sample;
        ArrayList<Integer>list=new ArrayList<>();

        for(ListNode l:lists){
            while(l!=null){
                list.add(l.val);
                l=l.next;
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return sample.next;
    }
}