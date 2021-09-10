public class Solution {
    public  int isPrime(int A){
        if(A<2){
            return 0;
        }
        int sqrt= (int)Math.pow(A,0.5);
        for(int j=2;j<=sqrt;j++){
            if(A%j==0){
                return 0;
            }
        }
    return 1;

    }
    public int solve(ArrayList<Integer> A) {
        int count=0;
        for(int el:A){
            if (isPrime(el)==1){
                count++;
            }
        }
        return count;
    }
}
