public class Solution {
    public char[] to_lower(char[] A) {
        for(int i=0;i<A.length;i++){
            char a=A[i];
            if(a>='A' && a<='Z'){
                A[i]=(char)(A[i]+32);
            }
        }
        return A;
    }
}
