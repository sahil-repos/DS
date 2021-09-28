class Solution {
    public int bulbSwitch(int n) {
        int ans=0;

        int i=1;
        while(i*i<n+1){
            if(i*i<n+1){ans++;}
            i++;
        }
        
        return ans;
    }
}
