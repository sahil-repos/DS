public class Solution {
    //function to calculate GCD of two numbers
    int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
    public int solve(int[] A) {
        int N=A.length;
        int[] prefix= new int[N];
        int[] suffix= new int[N];
        prefix[0]=A[0];
        suffix[N-1]=A[N-1];
        for(int i=1;i<N;i++){
            //calculate prefix and suffix GCD arrays
            prefix[i]=GCD(prefix[i-1], A[i]);
            suffix[N-1-i]= GCD(suffix[N-1-i + 1], A[N-1-i]);
        }

        //max GCD on removing 1st or last element
        int maxGCD=Math.max(suffix[1],prefix[N-1-1]);

        //calculate maxGCD on removing ith element
        for(int i=1;i<N-1;i++){
            maxGCD=Math.max(maxGCD, GCD(prefix[i-1],suffix[i+1]) );
        }

        return maxGCD;

        
    }
}
