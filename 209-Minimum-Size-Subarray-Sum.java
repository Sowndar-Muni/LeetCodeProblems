class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int sum=0;
        int length=nums.length;
        int i=0,j=0;
        while(j<length){
            sum=sum+nums[j];
            while(sum >= target){
                 int len=j-i+1;
                 if(len < res){
                    res=len;
                 }
                 sum=sum-nums[i];
                 i++;
            }
            j++;
        }
        if(res == Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}