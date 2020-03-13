import java.util.*;
/*
 * @lc app=leetcode id=309 lang=java
 *
 * [309] Best Time to Buy and Sell Stock with Cooldown
 */

// @lc code=start
class Solution {
    // 1. Brute force(3 ** n)
    // int maxProfit = 0;
    // public int maxProfit(int[] prices) {
    //     /**
    //      * status = {buy, sell, cooldown}
    //      */
    //     if(prices.length<=1) return 0;
    //     boolean[] status = new boolean[2];
    //     dfs(status, 0, prices, 0);
    //     //System.out.println(profits.toString());
    //     return maxProfit;
    // }

    // public void dfs(boolean[] status, int profit, int[] prices, int day){
    //     if(day==prices.length) return;
    //     if(!status[0] && !status[1]){
    //         // buy
    //         status[0] = true; status[1] = false;
    //         //System.out.println("profit:"+profit+"price:"+prices[day]);
    //         dfs(status, profit-prices[day], prices, day+1);

    //         //not buy
    //         status[0] = false; status[1] = false;
    //         dfs(status, profit, prices, day+1);
    //     }else if(status[0]){
    //         //sell
    //         status[0] = false; status[1] = true;
    //         if(profit+prices[day] > maxProfit) {
    //             maxProfit = profit+prices[day];
    //         }
    //         dfs(status, profit+prices[day], prices, day+1);

    //         //not sell
    //         status[0] = true; status[1] = false;
    //         dfs(status, profit, prices, day+1);
    //     }else if(status[1]){
    //         //cooldown
    //         status[0] = false; status[1] = false;
    //         dfs(status, profit, prices, day+1);
    //     }
    // }

    /**
     * 1. DP 
     * Status : {hold, sold, rest}
     * Action: {buy, sell, cooldown}
     * rest --> buy --> hold --> sell --> sold --> cooldown --> rest
     *      --> rest         --> hold        
     */  
    public int maxProfit(int[] prices){
        int[] rest = new int[prices.length+1];
        int[] sold = new int[prices.length+1];
        int[] hold = new int[prices.length+1];
        int[] dp = new int[prices.length+1];
        rest[0] = 0; sold[0] = 0; hold[0] = Integer.MIN_VALUE; dp[0] = 0;
        for(int i = 1; i < prices.length+1; i++){
            rest[i] = Math.max(rest[i-1], sold[i-1]);
            hold[i] = Math.max(hold[i-1], rest[i-1]-prices[i-1]);
            sold[i] = hold[i-1] + prices[i-1];  
            dp[i] = Math.max(dp[i-1], sold[i]);
        }
        return dp[prices.length];
    }
}
// @lc code=end

