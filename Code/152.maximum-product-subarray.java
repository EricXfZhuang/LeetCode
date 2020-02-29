import java.util.Arrays;

/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        /**
         * 1. nums[i]
         * 2. minProduct[i-1] * nums[i]
         */
        int[] maxProduct = new int[nums.length];
        int[] minProduct = new int[nums.length];
        maxProduct[0] = nums[0]; minProduct[0] = nums[0]; 
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxProduct[i] = Math.max(Math.max(nums[i], nums[i] * maxProduct[i-1]), nums[i] * minProduct[i-1]);
            minProduct[i] = Math.min(Math.min(nums[i], nums[i] * maxProduct[i-1]), nums[i] * minProduct[i-1]);
            max = Math.max(maxProduct[i], max);
        } 
        return max;
    }
}
// @lc code=end

