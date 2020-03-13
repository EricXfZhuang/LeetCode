/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            //System.out.println(slow);
            //System.out.println(fast);
            if(slow==fast) break;
        }
        fast = 0;
        while(true){
            if(nums[slow]==nums[fast]) return nums[slow];
            fast = nums[fast];
            slow = nums[slow];
        }
    }
}
// @lc code=end

