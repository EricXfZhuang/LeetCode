/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        String[] hex = "0123456789abcdef".split("");
        if(num==0) return "0";
        String ret = "";
        for(int i = 0;i < 8;i++){
            ret = hex[num & 0xf] + ret;
            num >>= 4;
        }
        return ret.replaceAll("^0+", "");
    }
}
// @lc code=end

