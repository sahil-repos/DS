//leetcode 795

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count=0,start=0,end=0,prev=0;
        
        while( end<nums.length){
            //c1: in range   -> any must be a part of valid subarray
            if(nums[end]>=left && nums[end]<=right){
                prev=end-start +1;
                    count=count+prev;
            }
            
            //c2: smaller than range   -> can become part of subarray with range elems only
            //element alone isnt a subbarray, so contributes to exisiting prev subarray count only
            else if(nums[end]<left ){
                count=count+prev;
            }
                
           //c3: greater than range   -> cant become part of subarray
            //break point will create max greater than range so break subarray and move to next index
            else if(nums[end]>right){
                prev=0;
                start=end+1;
            }
            end++;
        }
        
       return count; 
    }
}
