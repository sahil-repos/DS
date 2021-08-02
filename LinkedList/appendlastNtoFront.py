#
#aAppend last N elems to front of a LL¶
def appendLastNtoFront(head,N):
    slow=head
    fast=head
    relativePos=0
    while fast.next is not None:
        fast=fast.next
        if relativePos>=N:
            slow=slow.next
        relativePos+=1
    newHead=slow.next
    slow.next=None
    fast.next=head
    return newHead
