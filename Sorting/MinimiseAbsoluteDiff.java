public class Solution {
    public int solve(int[] A, int B) {
        
        int len=A.length;
        
        Arrays.sort(A);
            
        int min= A[0],max=A[len-1];
         if(max==min || B==0)
         {
         return max-min;
         }
    
        int left=1,right=len -2;
            
            while(true){
                
                //special indexOutOfBounds exception cut, when on incrementing/decrementing
                // all elements becomes equal 
                //so that in next code check below A[left] wont throw exception
                // as left++ will breach len and A[len]doesnt exist -> exception
                //OR when B==0 thus no more moves for inc/dec
                if(max==min||B==0){
                    break;
                }
                
                //min ki last occurance nikalo
                while(min==A[left]){
                    left++;
                }
                //max ki first occurance nikalo 
                while(max==A[right]){
                    right--;
                }
                
                int countLeft=left;
                int countRight=(len-1)-right;
                
                //check which extrema is small in occurance
                if(countLeft<countRight){
                    
                    //checking if how many time will the min values get incremented
                    //1) A[left]-min -> till min equals to immediate greater elem
                    //or 2) each max value incremented by B/countLeft times
                    int ans=Math.min(A[left]-min,B/countLeft);
                    
                    //check if B is smaller than countLeft, so unable to incrmnt all mins 
                    if(ans==0){
                        break;
                    }
                    
                    //update B after incrementing  countLeft min values 
                    B-=(ans*countLeft);
                    min+=ans;
                    
                }
                else if(countLeft>=countRight)
                {
                    //checking if how many time will the max values get reduced
                    //1) max-A[right] -> till max equals to immediate smaller elem
                    //or 2) each max value decremented by B/countRight times
                    
                    int ans2=Math.min(max-A[right],B/countRight);
                    
                    //check if B is smaller than countRight , so unable to decremet all maxs
                    //max-A[right] will never be zero (always>1) here as its being taken care of at the start of loop
                    if(ans2==0){
                        break;
                    }
                    B-=(ans2*countRight);
                    max-=ans2;
                }
                
            }
            
        
       
      
      ///////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////ANother approach without SOrting using hashmap//////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////
      //hashing way
        
        //get max min in linear time 
        
        //then fill hash with frequeencies of elems
      HashMap<Integer,Integer> hm= new HashMap<>();
      for(int c: A){
          if(hm.containsKey(c)){
              hm.put(c,hm.get(c)+1);
          }
          else{
              hm.put(c,1);
          }
      }
      while(true)
      {
          if(B==0|| max== min ){
             return max- min;
             
          }
          
          if(hm.get(max)>hm.get(min)){
              
              //min pakdo
              int possibleAddition=B/hm.get(min);
              if(possibleAddition==0){
                  break;
              }
              B=B-hm.get(min);
              hm.put(min+1,hm.getOrDefault(min+1,0)+hm.get(min));
              min++;
          }
          else{
               //max pakdo
              int possibleAddition=B/hm.get(max);
              if(possibleAddition==0){
                  break;
              }
              B=B-hm.get(max);
              hm.put(max-1,hm.getOrDefault(max-1,0)+hm.get(max));
              max--;
          }
          
          
       }
        
        
        return max-min;
        
    }
}
