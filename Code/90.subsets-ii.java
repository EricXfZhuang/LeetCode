import java.util.*;
/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> rs = new ArrayList<>();
        if(nums.length == 0) return rs;
        for(int i = 0; i <= nums.length; i++){
            dfs(nums, new ArrayList<>(), set, 0, i, 0);
        }
        rs.addAll(set);
        return rs;
    }

    public void dfs(int[] nums, List<Integer> curr, Set<List<Integer>> set, int currLen, int targetLen, int currIndex){
        if(currLen == targetLen){
            set.add(new ArrayList<>(curr));
            return;
        }

        for(int i = currIndex; i < nums.length; i++){
            curr.add(nums[i]);
            dfs(nums, curr, set, currLen+1, targetLen, i+1);
            curr.remove(currLen);
        }
    }
}
// @lc code=end

