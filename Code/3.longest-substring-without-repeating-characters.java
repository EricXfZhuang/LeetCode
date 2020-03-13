/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] dp = new String[s.length()+1];
        Character c;
        int rs = 0;
        dp[0] = "";
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(!dp[i].contains(Character.toString(c))){
                dp[i+1] = dp[i] + c;
            }else{
                int start = dp[i].indexOf(c)+1;
                dp[i+1] = dp[i].substring(start) + c;
                if(dp[i].length() > rs) rs = dp[i].length();
            }
        }
        if(dp[s.length()].length() > rs) rs = dp[s.length()].length();
        return rs;
    }
}
// @lc code=end

