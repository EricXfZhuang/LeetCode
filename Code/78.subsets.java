import java.util.*;
/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(),res);
        return res;
    }

    public void dfs(int[] nums, int start, List<Integer> curr, List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length; i++){
            curr.add(nums[i]);
            dfs(nums, i+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
// @lc code=end

