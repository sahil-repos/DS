public class Solution {
    public String solve(String A, int B) {
        int l=A.length();
        char[] arr=new char[l]; 
        for(int i=0;i<l;i++){
            arr[(i+(B%l))%l]=A.charAt(i);
        }
        return new String(arr);
    }
}

