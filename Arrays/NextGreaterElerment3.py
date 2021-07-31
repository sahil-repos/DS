#Given a positive integer n, find the smallest integer which has exactly 
#the same digits existing in the integer n and is greater in value than n. 
#If no such positive integer exists, return -1.

#Note that the returned integer should fit in 32-bit integer,
#if there is a valid answer but it does not fit in 32-bit integer, return -1.

#optimized
#optimized
class Solution:
    def nextGreaterElement(self, n: int) -> int:
        arr=list(str(n))
       
        candidate=-1
        for i in range(len(arr)-1,0,-1):
            if arr[i]>arr[i-1]:
                candidate=i-1
                break
                
        if candidate==-1:
            return -1
            
                
        for i in range(len(arr)-1,candidate,-1):
            if arr[i]>arr[candidate]:
                replacement=i
                arr[candidate],arr[replacement]=arr[replacement],arr[candidate]
                break
        
        arr[candidate+1:]=arr[candidate+1:][::-1]
        ans=int(''.join(arr))
        if ans>2**31 -1:
            return -1
        else:
            return ans

        
        return -1
