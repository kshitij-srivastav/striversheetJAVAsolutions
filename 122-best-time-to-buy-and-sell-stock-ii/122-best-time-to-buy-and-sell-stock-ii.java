class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length, ans = 0; 
        for(int i=1;i<n;i++){
            int base = i-1;
            while(i<n && prices[i] > prices[i-1]){
                i++;
            }
            ans += prices[i-1] - prices[base];
        }
        return ans; 
    }
}