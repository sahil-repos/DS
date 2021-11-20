class Solution {
    public int addDigits(int num) {
        
        // if(num<10){
        //     return num;
        // }
        // int sum=0;
        // while(num>0){
        //     int rem=num%10;
        //     num=num/10;
        //     sum+=rem;
        // }
        // return addDigits(sum);
        
        //o(1) sol
       if(num==0){
           return 0;
       } 
      //sum of digits will always be 9 if multiple of 9  
    if(num%9==0){
        return 9;
    }
    else{
        return num%9;
    }
        
    }
}
