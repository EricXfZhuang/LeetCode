/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int[] rs = new int[2];
        rs[0] = -1; rs[1] = -1;
        while(left < nums.length){
            if(nums[left]==target){
                rs[0] = left;
                break;
            }
            left++;
        }
        while(right >= left){
            if(nums[right]==target){
                rs[1] = right;
                break;
            }
            right--;
        }
        if(rs[0]==-1 || rs[1]==-1){
            rs[0] = -1; rs[1] = -1;
        }
        return rs;
    }
}
// @lc code=end

