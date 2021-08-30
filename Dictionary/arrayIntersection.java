class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm = new HashSet<Integer>();
        HashSet<Integer> res=new HashSet<Integer>();
        int i;
        for( i =0;i<nums1.length;i++){
            hm.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++){
            if(hm.contains(nums2[j])){
                res.add(nums2[j]);
            }
        }
        int[] array = new int[res.size()];
            i=0;
         for(int x:res){
             array[i]=x;
             i++;
         }
        return array;
    }
}
