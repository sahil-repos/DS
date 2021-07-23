#Given an array of distinct elements, find previous greater element for every element. If previous greater element does no

def prevGreat(arr):
    l=len(arr)
    s=[]
    s.append(arr[0])
    ans=[]
    #left most elem
    ans.append(-1)

    for i in range(1,l):

        while(len(s)>0 and s[-1]<arr[i]):
            s.pop()
        

        if len(s)==0:
            ans.append(-1)
        else:
            ans.append(s[-1])
        
        s.append(arr[i])
    return ans

print(prevGreat([1,2,12,3,44,4,3,2,10,3,1]))

# Time Complexity: O(n). It seems more than O(n) at first look.
#  If we take a closer look, we can observe that every element of array is added and removed from stack at most once.
#   So there are total 2n operations at most. Assuming that a stack operation takes O(1) time,
#    we can say that the time complexity is O(n).
# Auxiliary Space: O(n) in worst case when all elements are sorted in decreasing order.

