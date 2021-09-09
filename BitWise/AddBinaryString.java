public class Solution {
    public String addBinary(String A, String B) {
        int a=A.length()-1;
        int b=B.length()-1;
        int carry=0;
        String res="";
        while (a>=0 && b>=0 )
        {
            if(A.charAt(a)=='1' && B.charAt(b)=='1')
            {
               if(carry==1){
                    res="1"+res;
                    carry=1;
                    
                }
                else{
                    res="0"+res;
                    carry=1;
                }
                
            }
            else if(A.charAt(a)=='1' || B.charAt(b)=='1')
            {
                if(carry==1){
                    res="0"+res;
                    carry=1;
                    
                }
                else{
                    res="1"+res;
                    carry=0;
                }
                
            }
            else
            {
                if(carry==1){
                    res="1"+res;
                    carry=0;
                    
                }
                else{
                    res="0"+res;
                    carry=0;
                }
            }
            
            a--;
            b--;
        }
        
     
            for( int i=a;i>=0;i--){
                char curr=A.charAt(i);
                if(carry==1)
                {
                    res=curr=='1'?'0'+res:'1'+res;
                    carry=curr=='1'?1:0;
                }
                else
                {
                res=curr+res;
                }
            }
        
        
            for( int j=b;j>=0;j--){
                char currB=B.charAt(j);
               if(carry==1)
                {
                    res=currB=='1'?'0'+res:'1'+res;
                    carry=currB=='1'?1:0;
                }
                else
                {
                res=currB+res;
                }
            }  
            if(carry==1){
                res='1'+res;
            }
        return res;
        
    }
}

