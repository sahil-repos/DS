public class Solution {
    public int solve(char[] A) {
        for(char c:A){
            if(!((c>='A' &&c<='Z')||(c>='a' &&c<='z')||(c>='0' && c<='9')))
            {return 0;}
        }
        return 1;
    }
}
