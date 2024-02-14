/*

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

*/

class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int maxp = 0;
        while (r<prices.length){
            if(prices[l]<prices[r])
                maxp = Math.max(maxp, prices[r]-prices[l]);
            else
                l = r;
            r++;
        }
        return maxp;
    }
}
