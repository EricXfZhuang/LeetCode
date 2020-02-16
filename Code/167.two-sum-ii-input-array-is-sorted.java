/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] ret = new int[2];
        while(true){
            int l = numbers[left]; int r = numbers[right];
            int sum = l+r;
            if(sum==target){
                ret[0] = left+1; ret[1] = right+1;
                return ret;
            }
            if(left>=right && sum!=target)
                return ret;
            if(sum>=target) right--;
            else left++;
        }
    }
}
// @lc code=end

