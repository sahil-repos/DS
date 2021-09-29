class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        //ans.add(new ArrayList<Arr>)
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min){
                min=arr[i]-arr[i-1];
            }
        }
         for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
           ans.add(new ArrayList<>(Arrays.asList(arr[i-1], arr[i])));
            }
        }
        
        
        return ans;
    }
}
