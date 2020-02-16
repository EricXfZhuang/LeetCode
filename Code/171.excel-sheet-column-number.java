/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        int exp = 1;
        while(!s.isEmpty()){
            char c = s.charAt(s.length()-1);
            ret += (c+1)%65*exp;
            if(s.length()==1) return ret;
            s = s.substring(0, s.length()-1);
            exp *= 26;
        }
        return ret;
    }
}
// @lc code=end

