import java.util.ArrayList;

/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        String ret = "";
        while(n>0){
            n--;
            char c = (char)('A' + n%26);
            ret = c + ret;
            n = n/26;
        }
        return ret;
    }
}
// @lc code=end

