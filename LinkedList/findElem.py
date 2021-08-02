#given a ll find a node
def findElem(head,num):
    counter=0
    while(head is not None):
        if head.data==num:
            return counter
        counter+=1
        head=head.next
    return -1


    
        

printLL(h)
print()
print(findElem(h,3))
