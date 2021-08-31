public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,ArrayList<Integer>> hm= new HashMap<Integer,ArrayList<Integer>>();
        int i=0,minFirst=A.size();
        
        for(int x:A){
            if(hm.containsKey(x)){
               int firstOcc=hm.get(x).get(0);
               minFirst=firstOcc<minFirst?firstOcc:minFirst;
            }
            else{
                ArrayList<Integer> row= new ArrayList<Integer>();
                row.add(i);
                hm.put(x,row);
            }
        i++;            
        }
        if(minFirst==A.size()){
            return -1;
        }
        return A.get(minFirst);
    }
}
