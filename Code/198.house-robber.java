import java.util.Stack;

/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        //return dP(nums, nums.length-1); time limit exceed

        //iterative
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; dp[1] = Math.max(dp[0], nums[1]);
        for(int i = 2;i < nums.length;i++){
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        return dp[nums.length-1];
    }

    public int dP(int[] nums, int i){
        if(i<0) return 0;
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0], nums[1]);
        return Math.max(nums[i]+dP(nums, i-2), dP(nums, i-1));
    }

    

}
// @lc code=end

