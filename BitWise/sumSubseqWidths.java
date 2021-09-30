//leetcode 891
class Solution {
    public int sumSubseqWidths(int[] nums) {
        long sum=0;
        Arrays.sort(nums);
        long mod=1000000007;
        //sorting wont hurt our problem
        
        //bit array
        long bits[]= new long[nums.length];
        bits[0]=1; //2^0 =1
        for(int i=1;i<nums.length;i++){
            bits[i]=(bits[i-1]*2)%mod;
        }
        
        
        //number of elements smaller than ith index(on 0 scale)  elem => i
        //so 2^i subsequences will contain A[i] as maximum
        //similarly number of elems greater than A[i]=> n-i;
        //strictly greater than A[i]=> n-i-1  (A[i]==A[i])
        //so number of subsequencs having A[i] as min => 2^(n-i-1)
        
        for (int k=0;k<nums.length;k++){
            sum=(sum+ (long)nums[k]*(bits[k]-bits[nums.length-k-1]))%mod;
        }
        return (int)sum;
        
      
        
    }
}
