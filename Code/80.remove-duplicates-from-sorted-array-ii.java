/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int count = 1; int prev = nums[0]; int len = 0; int index = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i]==prev){
                count++;
            }else{
                prev = nums[i];
                count=1;
            }
            if(count<3){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
// @lc code=end

