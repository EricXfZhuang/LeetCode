import java.util.ArrayList;
import java.util.Collections;

/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int buy = prices[0];
        int max_profit = -buy;
        for(int i = 1;i<prices.length;i++){
            buy = prices[i-1];
            int sell = findSellPrice(prices, i);
            int profit = sell - buy;
            if(profit > max_profit) max_profit = profit;
            System.out.println(max_profit);
        }
        if(max_profit>0) return max_profit;
        return 0;
    }

    public int findSellPrice(int[] prices, int start){
        int sell = prices[start];
        if((prices.length-1)==start) return sell;
        for(int i = start+1;i<prices.length;i++){
            if(prices[i] > sell) sell = prices[i];
        }
        return sell;
    }
}
// @lc code=end

