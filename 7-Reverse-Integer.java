class Solution {
    public int reverse(int x) {
        int INT_MIN=Integer.MIN_VALUE;
        int INT_MAX=Integer.MAX_VALUE;
        int reverse=0,digit;
        while(x!=0){
            digit=x % 10;
            
            x=x/10;

            if(reverse > INT_MAX/10 || (reverse == INT_MAX/10 && digit > 7)){
                return 0;
            }
            if(reverse < INT_MIN/10 || (reverse == INT_MIN/10 && digit < -8)){
                return 0;
            }
            reverse=reverse*10+digit;
        }
        return reverse;
    }
}