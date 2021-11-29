//TC=> O(log(N))  

public class Solution {
    public int solve(int[] A) {
        int N=A.length;
       
        int L=0,R=N-1;

        while(L<=R){
            int M=L+(R-L)/2;

            if( (M==0 || A[M]!=A[M-1]) && (M==N-1 || A[M]!=A[M+1]) ){
                //M=0 / N-1 : curr element (boundary element) 
                //return current element
                    return A[M];
            }

            if(M==0 || A[M]!=A[M-1]){
                if(M%2==0){
                    //M is even => current el is before single elem position
                    //observe the index for pairs before and after single el in array example
                    L=M+1;
                }
                else{
                    R=M-1;
                }
                
            }
            else{
                // here check is for index pos as  A[M]=A[M-1] since it is in else
                if(M % 2==0){ 
                    R=M-1;
                }
                else{
                    L=M+1;
                }
            }

        }
        return -1;
    }
}
