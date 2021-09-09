public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int x:A){
            if(hs.contains(B-x)){
                return 1;
            }
            else{
                hs.add(x);
            }
        }
        return 0;
    }
}
