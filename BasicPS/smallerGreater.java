public class Solution {
    public int solve(ArrayList<Integer> A) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int c:A){
            if(c<min){
            min=c;
        }if (c>max){
            max=c;
        }
    }
    int maxC=0,minC=0;
    for(int c:A){
        if(c==max||c==min){
            maxC++;
        }
    }
    return A.size()-maxC;
}
}
