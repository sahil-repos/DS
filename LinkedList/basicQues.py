#LL def



class Node:
    def __init__(self,data):
        self.data=data
        self.next=None
        
def printLL(head):
    while head is not None:
        print(head.data,end=" ")
        head=head.next



nod1=Node(10)
node2=Node(20)

node2.next=nod1
printLL(node2)

#Length
def lenOfLL(head):
    counter=0
    while head is not None:
        head=head.next
        counter+=1
    return counter
print(lenOfLL(h))

def lenOfLLRecursively(head):
    if head is None:
        return 0
    else:
        return 1+lenOfLLRecursively(head.next)
print(lenOfLLRecursively(h))


#ith node

def ithNode(head,i):
    counter=0
            
    while(head is not None):
        if counter==i:
            return head
        else:
            counter+=1
            head=head.next
    return
res=ithNode(h,4)
if res:
    print(res.data)
    
    
 #delete ith  Node
def delNode(head,i):
    counter=0
    while(head.next is not None):
        if counter==i-1:
            print("Deleting",i,"th Node with value:",head.next.data)
            head.next=head.next.next
            break
        head=head.next
        counter+=1
        
def DelRecursive(head,i):
    if i<0:
        return head
    if head is None:
        return None
    if i==0:
        prev=head.next
        return prev
    smallHead=insertRecursively(head.next,i-1)
    head.next=smallHead
    return head

h=takeInput()
printLL(h)
delNode(h,3)
printLL(h)
        
