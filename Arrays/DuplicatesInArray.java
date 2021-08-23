class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int index=0;
        for (int j=0; j<nums.length;j++){
            //index -1 for saving from out of range exception
            index=Math.abs(nums[j])-1;
            int val=nums[index];
            if(val<0){
                //if val is -ve , its repeating index, thus save the index +1 in result
                ans.add(index+1);
            }
            else{
                //marking the visited number as -ve as the numbers are in range 1-N only
                nums[index]=-val;
            }
        }
        return ans;
    }
}
