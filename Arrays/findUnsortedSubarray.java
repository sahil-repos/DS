class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int st=0,end=nums.length-1;
       // int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
      int[] newArray=nums.clone();
        Arrays.sort(newArray);
        
        while(st<=end){
            if(newArray[st]!=nums[st]){
                break;
            }
            st++;
        }
        
        while(end>st){
            if(newArray[end]!=nums[end]){
                break;
            }
            end--;
        }
        
//         int[] slicedArray = Arrays.copyOfRange(nums, st, end+1);  
//         Arrays.sort(sliceArray);
        
//         for(int k=st;k<end+1;k++)
        
        return end-st+1;
      
    }
}
