#leetcode revrse linkedlist 2
#Given the head of a singly linked list and two integers left and right where left <= right, 
#reverse the nodes of the list from position left to position right, and return the reversed list.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseBetween(self, head: ListNode, left: int, right: int) -> ListNode:
      
      #dummynode
      dummy = ListNode(next=head)
      
      pre=dummy
      
      #go to  reversal start pos
      for x in range(left-1):
        pre=pre.next
       
      curr=pre.next
      
      #reversal
      
      for i in range(left,right):
        nextNode=curr.next
        
        curr.next=nextNode.next
        nextNode.next=pre.next
        pre.next=nextNode
      return dummy.next

#O(1) space   O(N) time
