class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int right[] = new int[length];
        int maxProfit = 0;
        
        right[length-1] = prices[length-1];
        for (int i = length-2; i>= 0; i--){
            right[i] = Math.max(prices[i], right[i+1]);
        }
        
        for (int i=0; i< length; i++){
            maxProfit=Math.max(maxProfit, right[i]-prices[i]);
        }
        
        return maxProfit;
    }
}