import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> contains = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++){
            if(contains.contains(nums[i])) return true;
            contains.add(nums[i]);
        }
        return false;
    }
}
// @lc code=end

