/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        for(int i = 0;i<32;i++){
            int lowest = n&1;
            ret += lowest<<(31-i);
            n >>= 1;
        }
        return ret;
    }
}
// @lc code=end

