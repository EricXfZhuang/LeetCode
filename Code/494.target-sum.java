import java.util.*;

/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 */

// @lc code=start
class Solution {
    int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, S);
        return res;
    }

    public void dfs(int[] nums, int curr, int S){
        if(curr==nums.length){
            if(S==0){
                res++;
                //System.out.println(str);
            }
            return;
        }
        dfs(nums, curr+1, S-nums[curr]);
        dfs(nums, curr+1, S+nums[curr]);
    }
}
// @lc code=end

