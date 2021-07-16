def leader(arr):
  '''an element is called the leader of an array if there is no element greater than it on the right side.
'''
    l=len(arr)-1
    ldr=[arr[-1]]
    while(l>=0):
        if ldr[-1]<arr[l]:
            ldr.append(arr[l])
        l-=1
    print(ldr)
lead([1,2,5,6,10,6,3,1,2])
