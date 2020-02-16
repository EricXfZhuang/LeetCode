import java.util.HashSet;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> int_set = new TreeSet<Integer>();
        for(Integer i : nums){
            int_set.add(i);
        }
        int len = int_set.size();
        for(int i = 0;i < len;i++){
            nums[i] = int_set.pollFirst();
        }
        return len;
        
    }
}
// @lc code=end

