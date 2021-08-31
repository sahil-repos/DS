public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        //tree map has logN complexity for containskey , put and get 
        //since we have to display the final arrrya in sorted order we will take 
        //tree , which stores values sorted order.
        TreeMap<Integer,Integer> hs= new TreeMap<Integer,Integer>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        //iterating over 1st array and filling map
        for(int x:A){
            if(!hs.containsKey(x)){
              hs.put(x,-1); 
            }
 
        }
         for(int x:B){
            if(hs.containsKey(x) && hs.get(x)==-1){
             //common elems
             hs.put(x,2);
            }
            else{
                //unique 2nd list elems
                 hs.put(x,-2);  
            }
            
        }
       
       //iterating over 3rd array  
        for(int z:C){
            if(hs.containsKey(z)){
                hs.put(z,2);
            }
        }
        
        for(Map.Entry<Integer,Integer> e : hs.entrySet())
                    {  
                        if(e.getValue()==2){
                            ans.add(e.getKey());
                        }
                    }
return ans;
    }
}
