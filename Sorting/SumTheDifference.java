public class Solution {
    public static long fastPower(int x, int n){
        long ans=1,a=x%mod;
        while(n>=1){
            if(n%2==0){
                a=(a*a)%mod;
                n=n/2;
            }
            else
            {
                ans=(ans*a)%mod;
                a=(a*a)%mod;
                n=n/2;
            }
        }
        return (ans+mod)%mod;
    }
    public static int mod=1000000007;
    public int solve(ArrayList<Integer> A) {
        long maxSum=0,minSum=0,ans;

        Collections.sort(A);
        
        for(int i=0;i<A.size();i++){
            long el=((long)A.get(i)+mod)%mod;
            //contributions of first(minSum) and last(maxSum) element of all subsequences. since it is sorted arrray, 
          //frist element will be minimum and  last will be maximum of subseq
            maxSum+= ((el * fastPower(2,i)))%mod;
            maxSum=maxSum%mod;
           minSum+= ((el * fastPower(2,A.size()-1-i) ))%mod;
           minSum=minSum%mod;
            
        }

        return (int)((maxSum-minSum+mod)%mod);
    
    }
}
