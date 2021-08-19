//201. Bitwise AND of Numbers Range

//Given two integers left and right that represent the range [m, n], 
//return the bitwise AND of all numbers in this range, inclusive.

public static void main(String[] args) {
      
     int a=25;
     int b=29,count=0;
     while(a!=b){
         a=a>>1;
         b=b>>1;
         count+=1;
         
     }
     a=a<<count;
     
  
  System.out.println(Integer.toBinaryString(a));        
    }

