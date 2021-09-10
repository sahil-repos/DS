public class Solution {
   
    //optimal soln-> approach -> use seive of size n-> ignore all even
    class Solution {
    
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int[] sieve=new int[n];
        
        sieve[0]=-1;
        sieve[1]=-1;
        //sieve[2]=0;
        
        int i=2;
        while(i*i<n){
            for(int k= i+i;k<n;k=k+i){
                sieve[k]=-1;
            }
            i++;
        }
        int count=0;
        for(int x:sieve){
            if(x==0){
                count++;
            }
        }
    return count;}
}
  
    
  soln below is unoptimal  
//     public  int isPrime(int A){
//         if(A<2){
//             return 0;
//         }
//         int sqrt= (int)Math.pow(A,0.5);
//         for(int j=2;j<=sqrt;j++){
//             if(A%j==0){
//                 return 0;
//             }
//         }
//     return 1;

//     }
//     public int solve(ArrayList<Integer> A) {
//         int count=0;
//         for(int el:A){
//             if (isPrime(el)==1){
//                 count++;
//             }
//         }
//         return count;
//     }
}
