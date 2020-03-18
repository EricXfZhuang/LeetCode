import java.util.*;
/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, curr, rs);
        return rs;
    }

    public void dfs(int[] nums, int target, int curIndex, List<Integer> curr, List<List<Integer>> rs){
        if(target == 0){
            rs.add(new ArrayList<>(curr));
            return;
        }

        for(int i = curIndex; i < nums.length; i++){
            if(nums[i] > target) break;
            curr.add(nums[i]);
            dfs(nums, target-nums[i], i, curr, rs);
            curr.remove(curr.size()-1);
        }
    }
}
// @lc code=end

