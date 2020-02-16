import java.util.Arrays;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
       for(int i = 0, count = 0;i < nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                if(count>0){
                    nums[i-count] = nums[i];
                    nums[i] = 0;
                }
            }
       }
    }
}
// @lc code=end

