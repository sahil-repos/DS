public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        int res=0;
        for (int el:A){
            res=res^el;
        }
        return res;
    }
}
