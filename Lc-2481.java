class Solution {
    public int numberOfCuts(int n) {
          if(n%2==0){
            return n/2;
         }else if(n==1){
            return 0;
         }else{
            return n;
         }
        
    }
}
