import java.util.*;
/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        dfs(n, k, curr, set, 1);
        List<List<Integer>> rs = new ArrayList<>();
        rs.addAll(set);
        return rs;
    }

    public void dfs(int target, int k, List<Integer> curr, Set<List<Integer>> set, int start){
        if(target == 0 && k == 0){
            set.add(new ArrayList<>(curr));
            return;
        }else if(target < 0 || k <= 0){
            return;
        }

        for(int i = start; i <= 9; i++){
            if(i > target) break;
            curr.add(i);
            dfs(target-i, k-1, curr, set, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
// @lc code=end

