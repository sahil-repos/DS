public class Solution {
    public String convertToTitle(int A) {
    
        StringBuilder sb= new StringBuilder();
        int i=0;
        while(A>0){
            A--;
            int rem=A%26;
            rem+=65;
            A=A/26;
            
        
         sb.insert(0,(char)rem);
            
        }
        return sb.toString();
    }
}
