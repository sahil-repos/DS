public class Solution {
    public int solve(ArrayList<Integer> A) {
        int currL=1,prev,flag;
        prev=A.get(0);
        flag=prev%2==0?0:1;
        
        
        
        
        for(int i=1;i<A.size();i++){
            if(((A.get(i) & 1)^flag) ==1){
                currL++;
                flag=A.get(i)%2==0?0:1;
            }
            
            
        }
    return currL;
        
    }
}
