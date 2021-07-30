class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        n=len(nums)
        #nums.extend(nums)
        
        ans=[0]*n
        s=[]
        s.append(nums[-1])
        i=2*(n) -1 -1
        ans[-1]=-1
        while i>=0:
            while (len(s)>0 and s[-1]<=nums[i%n]):
                s.pop()
            
            if len(s)==0:
                ans[i%n]=-1
            else:
                ans[i%n]=s[-1]
            s.append(nums[i%n])
            i-=1
        return ans
