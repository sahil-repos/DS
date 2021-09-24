public class Solution {
    public static int  MOD=1000000007;
    
    public int solve(int A) {
        
        double res=0;
        int bitPos=2;
        int groupOfOnes;
        int remainderSetBits=0;
        A=A+1;
    //count alternate bit in odd , odd has set bit 1
        res= A / 2;
 
    while (bitPos <= A)
    {
        groupOfOnes = A / bitPos;
        
        if((groupOfOnes)%2==1)
        {    //odd grp suggests => count remainder  set bits, which are smaller than groupsize (bitPos)                
            remainderSetBits=A%bitPos;
                                           
        }  
        else
        {
                remainderSetBits=0;
        }
        
        //only alternate groups have bitPos set bits    
        groupOfOnes=groupOfOnes/2;
        
        res=res+(groupOfOnes*bitPos)+remainderSetBits;
        
        //increment bit position
        bitPos=bitPos<<1;
        
    }
                                                                               
        return (int)(res%MOD);
                                                              
       
        
    }
    
    
//another direct formula approach    
//     public int solve2(int N){
//     if(N==0 ||N==1) return N;
//     int x=log2(N);
    
//     ans=0;
//     ans+= (pow(2,x) /2   ) *x
//         ans+=  N-pow(2,x)+1
//         ans+=solve2(N-pow(2,x))
//         return ans;}
}


//anothher approach
// long C = 0;
// for(int i = 30; i >= 0; i--) {
// if((A & (1 << i)) > 0) {
// // bit is set
// long x = i;
// x = x * (1 << (i - 1));
// C += x + 1; // total set bit count up to 2^i
// A -= 1 << i;
// C += A; // extra bits
// }
// }
