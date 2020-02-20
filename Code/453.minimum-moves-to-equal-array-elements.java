/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        if(nums.length<=1) return 0;
        int min = nums[0]; int sum = 0;
        for(Integer ele : nums){
            min = Math.min(ele, min);
        }
        for(Integer ele : nums){
            sum += (ele-min);
        }
        return sum;
    }
}
// @lc code=end

