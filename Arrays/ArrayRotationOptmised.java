class Solution {
    public static void reverse(int[] A,int start,int end){
        while(start < end){
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
            }
    }
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-(k%nums.length)-1);
        reverse(nums,nums.length-(k%nums.length),nums.length-1);
            reverse(nums,0,nums.length-1);
    }
}
