public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int ct=0,n=A.size(),i=0;

        //prefix XORSUM
        int[] XORSUM=new int[n];
         XORSUM[0]=A.get(0);

        for(int k=1;k<n;k++){
            XORSUM[k]=XORSUM[k-1]^A.get(k);
        }


        HashMap<Integer,Integer> hm= new HashMap();

        while(i<n){
            
            if(XORSUM[i]==B)
            {
                ct++;
            }

        //calc if need to add prev subarrays
        //  p ^ q = r
        //   p^q^q=r^q
        //   p= r ^q 
        // in our quest -> q is fixed and r is our xorSUM prefix array 
        //so just find p 
            int p= XORSUM[i] ^B;

            //now freq[p]=> number of times array with xorsum B arrived before ith pos
            //as  from j------>i-1  XORSUM is 0 thats why p gets repeated as B is fixed 
            //so ith pos will make more freq[p] subarrays

           
            if(hm.getOrDefault(p,0)>0){
                ct+=hm.getOrDefault(p,0);
            }

            //update frequency HashMap

            hm.put(XORSUM[i],hm.getOrDefault(XORSUM[i],0)+1);

            i++;
        }
        return ct;
    }
}
