public class Solution {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        int res=0,foundTwig=0;
        
        for(int x: C){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                hm.put(x,1);
            }
        }
        //iterating over map key wvalue pairs
         for (Map.Entry<Integer, Integer> e : hm.entrySet())
            {
                if(e.getValue()==B){
                    foundTwig=1;
                    res=res+e.getKey();
                }
            }
        //if not B frequency occurred tree, then return -1    
        res=foundTwig==0?-1:res;
    
        return res;
    }
}
