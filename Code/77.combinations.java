import java.util.*;
/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(n, k, new LinkedList<>(), 0,  1);
        return res;       
    }

    public void dfs(int n, int k, List<Integer> leaf, int currPos, int prev){
        if(currPos==k){
            // System.out.println(leaf.toString());
            res.add(new LinkedList<>(leaf));
            return;
        }else{
            for(int j = prev;j<=n;j++){
                leaf.add(j);
                dfs(n, k, leaf, currPos+1, j+1);
                leaf.remove(leaf.size()-1);
            }  
        }
    }
}
// @lc code=end

