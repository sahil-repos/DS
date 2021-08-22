class P{
public static void main(String[] args){
int start=0,maxL=0;
  String s="abansjpelioas"
  Hashmap<Character , int> hm= new Hashmap<Character,int>();
  for(int i=0;i<s.length();i++){
    if(hm.containsKey(s.charAt(i))){
      //update start to existing char's previous pos +1 
    start=Math.max(start,mp.get(s.charAt(i)) +1);
    }
    hm.put(s.charAt(i),i);
    maxL=Math.max(maxL,i-start+1);
  }

  System.out.println("Longest substring without repeating char is "+ maxL);
}
}
