//Maximum Product of Word Lengths


class fkt {



public static void main(String[] args) {
      
     String[] inp={"xhit","train","doom","gleezoi","mnbvci"};
     int[] orSum=new int[5];
    int maxL=0;
     
     for(int i=0;i<inp.length;i++){
         for(int p=0;p<inp[i].length();p++){
             orSum[i]=orSum[i] | (1<<((int)inp[i].charAt(p)-97));
             
         }
     }
     
     for(int j=0;j<inp.length-1;j++){
         for (int k =j;k<inp.length;k++){
             if((orSum[j] & orSum[k])==0 &&(maxL<(inp[j].length() * inp[k].length()))){
                 maxL=inp[j].length() * inp[k].length();
             }
         }
     }
     System.out.println(maxL);
     
     
  
    }
}
