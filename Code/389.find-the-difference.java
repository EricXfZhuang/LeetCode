/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        while(!s.isBlank()){
            String str = Character.toString(s.charAt(0));
            s = s.replaceFirst(str, "");
            t = t.replaceFirst(str, "");
        }
        return t.charAt(0);
    }
}
// @lc code=end

