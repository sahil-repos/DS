class fkt {
//ex arr=> {3,3,4,5,4,4,6,7,7} op=>{ 5 6}  


public static void main(String[] args) {
      
       int[] ar={1,2,3,3,4,2,5,1};
    int a=0,b=0,xor=0;
    for(int x:ar){
        xor=xor^x;
    }
    //this xor is xor of two missing numbers. the set bit in xor means the numbers differ on that bit
  //so find that bit and differentiate other numbers based on that
  
  
    //find least significant set bit in xor
    int d=xor &(-xor);
  
    for(int j :ar){
        if((j & d)==0){
          //not set element //the paired elems will become 0 on self xor, leaving first solo element
            a=a^j;
        }
        else{
         // set bit element //the paired elems will become 0 on self xor, leaving 2nd solo element

            b=b^j;
        }
    }  
      
      System.out.println(a);
      
    System.out.println(b);

    

      

        
    }
}
