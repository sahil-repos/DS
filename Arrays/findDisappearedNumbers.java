class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            //mark the numbers prsent in array at index  as -ve
            nums[index]=-(Math.abs(nums[index]));
        }
        
        for(int j=0;j<nums.length;j++){
            //unmarked /positive numbers because their index value was not present as element in array , so previous forloop was unable to mark the elements at those number indexes
            if(nums[j]>0){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
