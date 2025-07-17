class Solution {
    public boolean isSameAfterReversals(int num) {
        int orginal=num;
          int rev=0;
        while(num!=0){
            int digit=num%10;
            num=num/10;
            if (orginal<0){
                return false;
            }
            rev=(rev*10)+digit; 
        }
        int temp=rev;
        int dble_rev=0;
        while(temp!=0){
            int r_digit=temp%10;
            temp=temp/10;
            dble_rev=(dble_rev*10)+r_digit;
        }
        
         if (orginal==dble_rev){
                return true;
            }else{
                return false;
            }

    }
}
    
