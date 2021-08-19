class fkt {
//longest conscutive sequence of 1s
//Given a number n, find length of the longest consecutive 1s in its binary representation.


//The idea is based on the concept that if we AND a bit sequence with a shifted version of itself,
//we’re effectively removing the trailing 1 from every sequence of consecutive 1s.
//  11101111   (x)
// &11011110   (x << 1)


public static void main(String[] args) {
      
       int n=12345,count=0;
       while(n!=0){
       n= n & (n<<1);
       count++;
       
       }
  
  System.out.println(count);        
    }
}
