/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 0; i < nums.length-1; i++){
            if(dp[i]){
                for(int j = i; j < nums[i]+i+1; j++){
                    if(j > nums.length-1) break;
                    dp[j] = true;
                }
            }
        }
        return dp[nums.length-1];
    }
}
// @lc code=end

