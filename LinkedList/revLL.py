#reverse a LL

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr=head
        prev=None
        while curr is not None:
            nextNode=curr.next
            curr.next=prev
            prev=curr
            curr=nextNode
        return prev
