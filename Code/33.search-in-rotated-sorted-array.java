/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            if(nums[left]==target){
                return left;
            }
            left++;
            if(nums[right]==target){
                return right;
            }
            right--;
        }
        return -1;
    }
}
// @lc code=end

