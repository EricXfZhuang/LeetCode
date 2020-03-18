/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        boolean foundPivot = false;
        if(nums[0] == target) return true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > target && foundPivot) return false;
            if(nums[i] < nums[i-1]) foundPivot = true;
            if(nums[i] == target) return true;
        }
        return false;
    }
}
// @lc code=end

