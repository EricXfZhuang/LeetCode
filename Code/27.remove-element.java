/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int num = 0;
        int move = 0;
        int i = 0;
        while(i < len-move){
            if(nums[i] == val){
                for(int j = i;j < len-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[len-1] = val;
                move += 1;
            }else{
                num += 1;
                i += 1;
            }
            
        }
        return num;
    }

}
// @lc code=end

