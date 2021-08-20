import java.util.*;
public class c{
public static void main(String [] args){
  int i=0, k=3;
  String s="100110";
Set<String> h = new HashSet<String>();
          for(i=0;i<s.length()-k;i++){
            //   int slice=Array.copyOfRange();
            String sub=s.substring(i,i+k);
            h.add(sub);
              
          }
          if( h.size()== (2<<(k-1))){
              System.out.println("has all");
          }
          else{        
              System.out.println("Not  all");
}
          

}
}
