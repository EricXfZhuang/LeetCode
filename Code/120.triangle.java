import java.util.*;
/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len1 = triangle.size();
        for(int i = len1 - 2; i >= 0; i--){
            int len2 = triangle.get(i).size();
            for(int j = 0; j < len2; j++){
                int val = triangle.get(i).get(j);
                triangle.get(i).set(j, Math.min(val + triangle.get(i+1).get(j), val + triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
// @lc code=end

