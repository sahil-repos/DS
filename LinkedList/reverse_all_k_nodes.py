#lletcode 25
#reverse all k nodes¶

# 1 2 3 4 5 6 7 8 
# k=3
#op->3 2 1 6 5 4 7 8
# Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
#
# k is a positive integer and is less than or equal to the length of the linked list. 
# If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

#You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        global reversible
        
        #first count the reversable groups in list
        ct=head
        count=1
        while ct:
            ct=ct.next
            count+=1
        reversible= (count-1)//k
        if reversible>0:
            
            return self.helper(head,k,0)
        else:
            return head
         
    def helper(self,head,k,counter):
        if counter!=reversible:

            prev=nextNode=None
            count=0
            curr=head

            while (count<k and curr is not None):

                nextNode=curr.next
                curr.next=prev
                prev=curr
                curr=nextNode

                count+=1
            #reverse the  remaining LL groups
            if nextNode is not None:

                head.next=self.helper(curr,k,counter+1)

            return prev
        else:
            return head
