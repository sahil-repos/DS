class Solution {
    public int[] plusOne(int[] A) {
        
        int l=A.length;
        if(l==0){return A;}
        int carry =1;
        
        l--;
        
        while(l>=0 && carry==1){
            int curr=A[l]+carry;
            if(curr>9){
                carry=1;
                A[l]=0;
            }
            else{
                A[l]=curr;
                carry=0;
            }
            l--;
        }
        
      //counting redundent zeroa
        int i=0;
        while(carry==0 && i<A.length)
        {
            if(A[i]!=0){
                break;
            }
            i++;
        }
        
        if((carry==1) && (l==-1) ){
            int[] ans= new int[A.length+1];
            ans[0]=1;
            int j=1;
            while(j<=A.length){
                ans[j]=A[j-1];
            j++;}
            return ans;
        }
        else{
            int[] ans=new int[A.length-i];
            int j=0;
            while(j<A.length-i){
                ans[j]=A[j+i];
            j++;}
            return ans;
        }
        
        
        
    }
}
