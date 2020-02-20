import java.util.*;
/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(Integer item : nums){
            set.add(item);
        }
        for(int i = 1;i <= nums.length;i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}
// @lc code=end

