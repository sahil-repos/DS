def midOfLL(head):
    if head is None:
        return head
    fast=head
    slow=head
    while(fast.next is not None and fast.next.next is not None):
        slow=slow.next
        fast=fast.next.next
    return slow
