public class Solution {
    //hamming wieght=>number of set bits
    // you need to treat n as an unsigned value
    public int hammingWeight(int A) {
       
        int num=0;
      //as Integer.MIN_VALUE is 1<<31 , count all 32 bits for -ve cases aswell
        for(int i=0;i<32;i++){
            num=num+ (A&1);
            A=A>>1;
            
        }
        
        return num;
    }
}
