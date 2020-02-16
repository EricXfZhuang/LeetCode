/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        if(needle.isEmpty()){
            return 0;
        }
        for(int i = 0;i < haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

