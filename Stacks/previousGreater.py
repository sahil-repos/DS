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

