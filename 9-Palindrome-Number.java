class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,temp;
    if(x<0){
        return false;
    }
        temp=x;
        while(x>0){
           int rem=x%10;
           sum=(sum*10)+rem;
            x=x/10;

        }
        if(temp==sum){
           return true;
        }
        return false;
    }
}
