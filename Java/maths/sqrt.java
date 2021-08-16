//leetcode 69
class Solution {
    public int mySqrt(int x) {
        if(x==0){return 0;}
        int low=1,high=x;
        int res=1,mid;
        while (low<=high){
             mid=(int)(low+high)/2;
            if(mid==x/mid){
                return (int)mid;
            }
            if (mid>x/mid){
                high=mid-1;
                
            }
            else{
                low=mid+1;
                res=mid;
               
            }
        }
        return (int)res;
        
    }
}
