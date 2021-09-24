class Solution {
    public static int compareWindow(int[] A, int[] B ){
        
        for(int i=0;i<A.length;i++){
            if(A[i]!=B[i]){
                return 0;
            }
        }
        return 1;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){return false;}
        int[] freqS1=new int[26];
        int[] freqWindow= new int[26];
        int i;
        for( i=0;i<s1.length();i++){
            freqS1[s1.charAt(i)-'a']+=1;
        }
        
        //first window
        for(i=0;i<s1.length();i++){
            freqWindow[s2.charAt(i)-'a']+=1;
        }
        
        if(compareWindow(freqWindow,freqS1)==1){
            return true;
        }
        
      //still O(n) as 26 alphabets only, 26N=>N
        for(i=s1.length();i<s2.length();i++){
            freqWindow[s2.charAt(i)-'a']+=1;
            freqWindow[s2.charAt(i-s1.length())-'a']-=1;
            if(compareWindow(freqWindow,freqS1)==1){
                return true;
            }
        }
        
        return false;
    }
}
