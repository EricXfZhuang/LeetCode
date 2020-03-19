/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        boolean findPivot = false;
        int rs = nums[0];
        if(nums.length==1) return nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1])
                findPivot = true;
            if(nums[i] < rs) rs = nums[i];
            if(findPivot) break;
        }
        return rs;
    }
}
// @lc code=end

