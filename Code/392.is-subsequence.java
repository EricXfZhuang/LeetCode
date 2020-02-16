/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        
        //traverse string s
        int prevIndex = 0;
        int startIndex = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            int index = t.indexOf(c, startIndex);
            if(index==-1) return false;
            if(index < prevIndex)
                return false;
            prevIndex = index;
            startIndex = prevIndex + 1;
        }

        return true;
    }
}
// @lc code=end

