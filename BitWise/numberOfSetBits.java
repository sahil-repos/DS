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
}
