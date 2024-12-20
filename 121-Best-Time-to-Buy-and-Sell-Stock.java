class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int profit;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=prices[i]-min;
            min=Math.min(min,prices[i]);
            max=Math.max(max,profit);
            
        }
        return max;
    }
}