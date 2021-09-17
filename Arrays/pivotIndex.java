class Solution {
    public int pivotIndex(int[] nums) {
     int leftSum=0,rightSum=0,i,j;
        
        for(int x :nums){
            rightSum+=x;
        }
        rightSum=rightSum-nums[0];
        i=0;
        int n=nums.length;
        while(i<n-1){
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
            rightSum-=nums[i+1];
            i++;
        }
        
        if(rightSum==leftSum)return i;
        return -1;
    }
}
