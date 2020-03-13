import java.util.*;
/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int target = 0;
        for(int i = 0; i < nums.length; i++){
            target += nums[i];
        }
        if(target % 2 == 1) return false;
        target /= 2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int num : nums){
            for(int i = target; i >= 0; i--){
                if(dp[i] && num+i<target+1) dp[i+num] = true;
            }
            if(dp[target]){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

