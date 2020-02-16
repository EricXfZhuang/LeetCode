/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        long pow = 1; int expo = 0;
        while(pow<=n){
            if(pow==n) return true;
            pow = (long) Math.pow(2, ++expo);
        }
        return false;
    }
}
// @lc code=end

