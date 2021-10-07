public class Solution {
    public String simplifyPath(String A) {
        StringBuilder sb= new StringBuilder();

        ArrayDeque<String> adq = new ArrayDeque();
        //ArrayDeque tends to be faster than Stack when used as a stack 
        
        String[] sArr=A.split("/");
        
        for(String s: sArr){
            
            if(s.equals("..")&& !adq.isEmpty()){
            //pop        
            adq.removeLast();
            
            }
            else if( !( s.equals(".")||s.equals("") || s.equals("..")  )  ){
                //push
                adq.addLast(s);
            }
        }
        
        while(! adq.isEmpty() ){
            sb.append("/"+ adq.removeFirst() );
        }
        
        ////for stack
        //  stk.forEach(x ->  
        // {  
        //     sb.append("/"+x);  
        // }); 
        
        if(sb.length()==0){
            return "/";
        }
        else{
            return sb.toString();
        }
       
        
        
    }
}
