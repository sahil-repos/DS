class p4 {
    ///powers of 4 have bit set at odd positions   
    public static void main(String[] args) {
      
        int A=30;
      if(A<1){   
        System.out.println("NO");
      }
      String s=Integer.toBinaryString(A);
      //check for odd length bit set and power of 2 condtion
      if((s.length() & 1) && (n &(n-1))==0 )
        System.out.println("Power of four");
      else
        System.out.println("Nopes");

      

        
    }
}
