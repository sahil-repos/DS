class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,zeroIndex=0;
        
        while(i<nums.length){
            if(nums[i]==0 &&nums[zeroIndex]!=0){
                zeroIndex=i;
            }
            if(nums[i]!=0 && nums[zeroIndex]==0){
                int temp=nums[i];
                nums[i]=nums[zeroIndex];
                nums[zeroIndex]=temp;
                
                zeroIndex++;
            }
            i++;
        }
        
    }
}
