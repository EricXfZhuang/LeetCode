/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int[] an = new int[n];
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        an[0] = 1; an[1] = 2;
        for(int i = 2;i < n;i++){
            an[i] = an[i-1] + an[i-2];
        }
        return an[n-1];
    }
}
// @lc code=end

