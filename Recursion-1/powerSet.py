#leetcode 78. Subsets
#Given an integer array nums of unique elements, return all possible subsets (the power set).

#The solution set must not contain duplicate subsets. Return the solution in any orde

[https://leetcode.com/problems/subsets/]
  
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        x=self.helper(nums)
        
        def sorter(item):
            i1 = len(item)
            item2 = item
            return (i1,item2)
        return sorted(x,key=sorter)
        
        
    def helper(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==0:
            op=[[]]
            return op
        smallerOP=self.helper(nums[1:])     
        op=[]
        
        #with op[1]
        for x in smallerOP:
            op.append([nums[0]]+x)
            
        #without op[1]      
        for x in smallerOP:
            op.append(x)
        
        return op
    
  
      
      
      
    
        
