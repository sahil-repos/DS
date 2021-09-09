public class Solution {
    public static ArrayList<Integer> rotate(ArrayList<Integer> Ar,int dist){
        ArrayList<Integer> res=new ArrayList<Integer>();
        int len=Ar.size();
                res = (ArrayList<Integer>)Ar.clone();
        for(int i=0;i<len;i++){
            res.set(i,Ar.get((i+dist)%len));
        }
        return res;
        
    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
        for(int index :B){
            ArrayList<Integer> el= rotate(A,index);
            ans.add(el);
            
        }
        return ans;
    }
}
