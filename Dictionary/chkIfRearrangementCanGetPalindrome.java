public class Solution {
    public int solve(String A) {
        int count=0;
        HashSet<Character> hs= new HashSet<Character>();
        
        for(int i=0;i<A.length();i++){
            if(hs.contains(A.charAt(i))){
                count++;
                hs.remove(A.charAt(i));
            }
            else{
                hs.add(A.charAt(i));
            }
        }
        //palindrome has every element exactly twice in case of even and in case off odd-> all but one
        return count==A.length()/2?1:0;
    }
}
