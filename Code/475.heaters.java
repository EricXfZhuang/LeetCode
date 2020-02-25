import java.util.Arrays;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 */

// @lc code=start
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        for(int house : houses) {
            int t = Integer.MAX_VALUE;
            for(int heater : heaters) {
                t = Math.min(t, Math.abs(house - heater));
            }
            res = Math.max(res, t);
        }
        return res;
    }
}
// @lc code=end

