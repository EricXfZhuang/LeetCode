/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0;i < nums.length;i++){
            int end = i+k;
            if(end>=nums.length) end = nums.length-1;
            while(i<end){
                if(nums[i]==nums[end--]) return true;
            }
        }
        return false;
    }
}
// @lc code=end

