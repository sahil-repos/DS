#print whther an array is monotonic , inc all or dec all .. ex-> 1,2,3,4,5,666,666,666,7865       or  11,6,4,3,2,2,1
def isMonotonic(self, nums: List[int]) -> bool:
    flag=0
    if nums[0]<nums[-1]:
        flag=1
        
    for i in range(len(nums)-1):
        if flag:
            if nums[i]>nums[i+1]:
                return False
        else:
            if nums[i]<nums[i+1]:
                return False
    return True
  
  
