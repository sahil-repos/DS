//leetcode 34 
class Solution {
    //for start element
     int startElem(int[] A,int B){
        int L=0,R=A.length-1;

        while(L<=R){
            int M=L+(R-L)/2;
            

            if(A[M]==B  && (M==0|| A[M]!=A[M-1])){
                return M;
            }
            //if current>= target check in left side, also in  equality case 
            //as previous if{} would have returned M if A[M]!=A[M-1],
            //thus  confirming either A[M]=A[M-1]=B  Or A[M]>B
            //both cases we need to move left.
            if(A[M]>=B){
                R=M-1;
            }
            else{
                //A[M] <B 

                L=M+1;

            }
        }
        return -1;
    }

    //for end Elem
    int endElem(int[] A,int B){
        int L=0,R=A.length-1;

        while(L<=R){
            int M=L+(R-L)/2;

            if(A[M]==B  && (M==A.length-1|| A[M]!=A[M+1])){
                return M;
            }

            if(A[M]>B){
                R=M-1;
            }
            else{
                //A[M] <B 

                L=M+1;

            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=startElem(nums,target);
        ans[1]=endElem(nums,target);
        return ans;

        
        
    }
}
