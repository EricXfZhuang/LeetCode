import java.util.*;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort nums
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> rs = new ArrayList<>();
        //Set<List<Integer>> set = new HashSet<>();;
        for (int i = 0; i < len - 2; ++i) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = len - 1;      
            while (l < r) {
              if (nums[i] + nums[l] + nums[r] == 0) {
                List<Integer> ls = List.of(nums[i], nums[l++], nums[r--]);
                rs.add(ls);
                while (l < r && nums[l] == nums[l - 1]) ++l;
                while (l < r && nums[r] == nums[r + 1]) --r;          
              } else if (nums[i] + nums[l] + nums[r] < 0) {
                ++l;
              } else {
                --r;
              }
            }
          }
        //rs.addAll(set);
        return rs;
    }
}
// @lc code=end

