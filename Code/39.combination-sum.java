import java.util.*;
/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        dfs(candidates, target, set, new ArrayList<>(), 0);
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            res.add((List<Integer>) iter.next());
        }
        return res;
    }

    public void dfs(int[] candidates, int target, Set<List<Integer>> set, List<Integer> leaf, int sum){
        if(sum == target){
            Collections.sort(leaf);
            set.add(leaf);
            return;
        }else if(sum > target){
            return;
        }else{
            for(Integer ele : candidates){
                ArrayList<Integer> newLs = (ArrayList<Integer>) ((ArrayList<Integer>) leaf).clone();
                newLs.add(ele);
                dfs(candidates, target, set, newLs, sum+ele);
            }
        }
    }

}
// @lc code=end

