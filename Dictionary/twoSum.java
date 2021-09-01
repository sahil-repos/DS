class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
            
        }
        for(int j=0;j<nums.length;j++){
        //---------------------------------------------check if target is double of nums[j] ,resulting in repetition of same index.
            if(hm.containsKey(target-nums[j]) && hm.get(target-nums[j])!=j){
                ans[0]=j;
                ans[1]=hm.get(target-nums[j]);
            }
        }
     return ans;   
    }
    
    
    
    ///another approach for inner code single iteration 
//           HashMap<Integer,Integer> hm= new HashMap<>();
//         ArrayList<Integer> ans= new ArrayList<Integer>();

//         for(int i=0;i<A.size();i++){
//             int elem= A.get(i);
//             if(hm.containsKey(B-elem)){
//                 ans.add(hm.get(B-elem)+1);
//                 ans.add(i+1);
//                 break;
//             }
//             else if(!hm.containsKey(elem)){
//                 hm.put(elem,i);
//             }
//         }
//         return ans;
    
    
}
