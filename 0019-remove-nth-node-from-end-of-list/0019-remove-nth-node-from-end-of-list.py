# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr=head
        
        length=0
        while curr:
            curr=curr.next
            length=length+1
        n=(length-n+1)
        if n==1:
            return head.next
        curr=head
        i=1
        while i<n-1:
            i+=1
            curr=curr.next
        curr.next=curr.next.next
        return head

            

        