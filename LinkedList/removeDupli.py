#remove duplicate value from a LL

def removeDupli(head):
    s=set()
    curr=head
    s.add(head.data)
    while curr.next is not None:
        if curr.next.data in s:
            curr.next=curr.next.next
        else:
            s.add(curr.next.data)
            curr=curr.next
    return head
    
    
        
        
h=takeInput()
printLL(removeDupli(h))
