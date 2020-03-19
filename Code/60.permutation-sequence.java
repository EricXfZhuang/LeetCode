import java.awt.List;
import java.util.*;
/*
 * @lc app=leetcode id=60 lang=java
 *
 * [60] Permutation Sequence
 */

// @lc code=start
class Solution {
    public String getPermutation(int n, int k) {
        List<String> rs = new ArrayList<>();
        dfs(n, k, "", rs);
        return rs.get(k-1);
    }

    public void dfs(int n, int k, String curr, List<String> rs){
        if(curr.length() == n){
            String str = curr;
            rs.add(str);
            if(rs.size() == k){
                return;
            }
        }
        
        for(int i = 1; i <= n; i++){
            String str = curr;
            if(!str.contains(Character.toString(i))){
                dfs(n, k, str + i, rs);
            }
        }
    }
}
// @lc code=end

