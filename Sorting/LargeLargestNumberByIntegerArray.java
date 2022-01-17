//COMPARATOR USE

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
   public static class strComparator implements Comparator<String>
    {
        @Override
        public int compare(String a,String b){
           // String a1=a.toString();
           String ab=a+b;
           String ba=b+a;
            //String b1=b.toString();
            if(ab.compareTo(ba)>0){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
    public String largestNumber(final List<Integer> A) {

        List<String> ls=new ArrayList();
        for(int a: A){
            ls.add(Integer.toString(a));
        }
        Collections.sort(ls,new strComparator());
        StringBuilder s= new StringBuilder();
        
        for(String x:ls){
            s.append(x);
        }
        
        String ans= s.toString();

        //handling 0,0,0,0,0,0
        if(ans.charAt(0)=='0'){
            return "0";
        }
        
        return ans;
     }
}
