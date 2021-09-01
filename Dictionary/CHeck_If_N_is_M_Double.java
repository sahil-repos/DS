class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Double> hs= new HashSet<>();
        for(int x : arr){
            if(hs.contains(x*2.0) || hs.contains(x/2.0)){
                return true;
            }
               else{
                   hs.add(x/1.0);
               }
        }
        
    return false;}
}
