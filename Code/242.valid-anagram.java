/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==0 && t.length()==0) return true;
        if(s.length()!=t.length()){
            return false;
        }else{
             return isAnagram(s.replace(Character.toString(s.charAt(0)), ""), t.replace(Character.toString(s.charAt(0)),""));
        }
    }
}
// @lc code=end

