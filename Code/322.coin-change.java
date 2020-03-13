import java.util.*;

/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i = 1; i <= amount; ++i){
            for(int j = 0; j < coins.length; ++j){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        if(dp[amount] > amount) return -1;
        else return dp[amount];
    }

    
}
// @lc code=end

