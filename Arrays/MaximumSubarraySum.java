//leetcode 53
//using Kadane's Algo

class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currMax=0;
        for(int i=0;i<nums.length;i++){
            currMax+=nums[i];
            
            if(currMax>max){
                max=currMax;
            }
            
            if(currMax<0){
              //reset curr max
                currMax=0;
            }
            
        }
        
        return max;
    }
}
