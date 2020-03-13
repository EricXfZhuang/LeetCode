import java.util.Arrays;

/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i = 1; i < s.length(); i++){
            for(int j = 0; j <= i; j++){
                if(isPalindromic(s.substring(j, i+1))){
                    dp[i]++;
                }
            }
            dp[i] += dp[i-1];
        }
        return dp[s.length()-1];
    }

    public boolean isPalindromic(String s){
        if(s.isBlank()) return false;
        if(s.length()==1) return true;
        int len = s.length();
        int mid = len/2;
        for(int i = 0; i < mid; i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                return false;
            }
        }
        return true;

    }
}
// @lc code=end

