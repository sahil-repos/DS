//Given an integer array A of size N. In one second you can increase the value of one element by 1.

//Find the minimum time in seconds to make all elements of the array equal.

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max=0;
        for(int x:A){
            if(x>max){
                max=x;
            }      
        }
        int total=0;
        for(int el:A){
            total=total+ (max-el);
        }
        return total;
    }
}
