/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        if(n==0) return 0;
        return trailingZeroes(n/5) + n/5;
    }
}
// @lc code=end

