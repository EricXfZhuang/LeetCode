/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        while(n%3==0)
            n /= 3;
        if(n==1)
            return true;
        else
            return false;

    }
}
// @lc code=end

