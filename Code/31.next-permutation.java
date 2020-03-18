import java.util.Arrays;
/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;
        /**
         * find the switch spot
         */
        for(;index > 0; index--){
            if(nums[index] > nums[index-1]) break;
        }
        if(index <= 0){
            Arrays.sort(nums);
            return;
        }
        int num1 = nums[index-1], num1Index = index-1, num2 = Integer.MAX_VALUE, num2Index = index;
        System.out.println(num1);
        for(; index < nums.length; index++){
            if(nums[index] > num1 && nums[index] < num2){
                num2 = nums[index];
                num2Index = index;
            }
        }
        nums[num1Index] = num2;
        nums[num2Index] = num1;
        Arrays.sort(nums, num1Index+1, nums.length);
    }
}
// @lc code=end

