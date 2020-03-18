import java.util.*;
/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> rs = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        dfs(candidates, curr, target, 0, rs);
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(rs);
        return ans;
    }

    public void dfs(int[] nums, List<Integer> curr, int target, int currIndex, Set<List<Integer>> rs){
        if(target == 0){
            rs.add(new ArrayList<>(curr));
            return;
        }

        for(int i = currIndex; i < nums.length; i++){
            if(nums[i] > target) break;
            curr.add(nums[i]);
            dfs(nums, curr, target-nums[i], i+1, rs);
            curr.remove(curr.size()-1);
        }
    }
}
// @lc code=end

