import java.util.*;
/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        TreeMap<Integer, int[]> map = new TreeMap<Integer, int[]>();
        for(int i = area;i>=Math.sqrt(area);i--){
            if(area%i==0){
                int[] arr = {i, area/i};
                map.put(i-area/i, arr);
            }
        }
        return map.firstEntry().getValue();
    }
}
// @lc code=end

