public class Solution {
    public int solve(int A) {
        int power=(int)(Math.log(A)/Math.log(2)) +1;
        int Y=1<<power;

        for(int i=0;i<power;i++){
            A=A^(1<<i);
        }
        return A^Y;
    }
}
